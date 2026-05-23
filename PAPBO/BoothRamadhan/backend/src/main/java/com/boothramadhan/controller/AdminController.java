package com.boothramadhan.controller;

import com.boothramadhan.model.Booth;
import com.boothramadhan.model.Reservasi;
import com.boothramadhan.service.DataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    private final DataService ds;

    public AdminController(DataService ds) {
        this.ds = ds;
    }

    @GetMapping("/booth")
    public List<Booth> getBooth() {
        return ds.getBooths();
    }

    @PostMapping("/booth")
    public Booth addBooth(@RequestBody Booth b) {
        return ds.addBooth(b);
    }

    @DeleteMapping("/booth/{id}")
    public String deleteBooth(@PathVariable int id) {
        ds.deleteBooth(id);
        return "deleted";
    }

    @GetMapping("/reservasi")
    public List<Reservasi> getAllReservasi() {
        return ds.getAllReservasi();
    }
}