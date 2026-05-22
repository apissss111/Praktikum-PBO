package com.boothramadhan.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "*")
public class AdminController {

    // ===== DATA BOOTH =====
    private List<Map<String, Object>> boothList = new ArrayList<>();
    private int boothId = 1;

    // ===== DATA RESERVASI =====
    private List<Map<String, Object>> reservasiList = new ArrayList<>();
    private int reservasiId = 1;

    // =========================
    // BOOTH
    // =========================

    @GetMapping("/booth")
    public List<Map<String, Object>> getBooth() {
        return boothList;
    }

    @PostMapping("/booth")
    public Map<String, Object> tambahBooth(@RequestBody Map<String, Object> data) {
        data.put("id", boothId++);
        boothList.add(data);
        return data;
    }

    @PutMapping("/booth/{id}")
    public Map<String, Object> updateBooth(@PathVariable int id, @RequestBody Map<String, Object> data) {
        for (Map<String, Object> b : boothList) {
            if ((int) b.get("id") == id) {
                b.put("namaBooth", data.get("namaBooth"));
                b.put("lokasi", data.get("lokasi"));
                b.put("harga", data.get("harga"));
                return b;
            }
        }
        return null;
    }

    @DeleteMapping("/booth/{id}")
    public void deleteBooth(@PathVariable int id) {
        boothList.removeIf(b -> (int) b.get("id") == id);
    }

    // =========================
    // RESERVASI
    // =========================

    @GetMapping("/reservasi")
    public List<Map<String, Object>> getReservasi() {
        return reservasiList;
    }

    @PostMapping("/reservasi")
    public Map<String, Object> tambahReservasi(@RequestBody Map<String, Object> data) {
        data.put("id", reservasiId++);
        reservasiList.add(data);
        return data;
    }
}