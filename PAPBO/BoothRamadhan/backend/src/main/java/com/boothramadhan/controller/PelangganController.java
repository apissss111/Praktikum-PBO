package com.boothramadhan.controller;

import com.boothramadhan.service.DataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pelanggan")
@CrossOrigin
public class PelangganController {

    private final DataService dataService;

    public PelangganController(DataService dataService) {
        this.dataService = dataService;
    }

    @PostMapping("/reservasi")
    public String pesan(@RequestBody Map<String, String> req) {

        int boothId = Integer.parseInt(req.get("boothId"));
        String username = req.get("username");
        String tanggal = req.get("tanggal");

        return dataService.tambahReservasi(boothId, username, tanggal);
    }

    @GetMapping("/reservasi/{username}")
    public List<?> getRiwayat(@PathVariable String username) {
        return dataService.getReservasiByUsername(username);
    }
}