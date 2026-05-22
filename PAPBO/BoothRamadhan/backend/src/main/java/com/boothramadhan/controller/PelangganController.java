package com.boothramadhan.controller;

import com.boothramadhan.model.Penyewaan;
import com.boothramadhan.service.DataService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pelanggan")
@CrossOrigin
public class PelangganController {

    private final DataService dataService;

    public PelangganController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/reservasi")
    public List<Penyewaan> getAll() {
        return dataService.getAllPenyewaan();
    }

    @PostMapping("/reservasi")
    public Penyewaan add(@RequestBody Penyewaan p) {
        return dataService.addPenyewaan(p);
    }

    @DeleteMapping("/reservasi/{id}")
    public void delete(@PathVariable int id) {
        dataService.deletePenyewaan(id);
    }
}