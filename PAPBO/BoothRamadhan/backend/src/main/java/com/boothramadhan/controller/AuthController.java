package com.boothramadhan.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    private List<Map<String, String>> users = new ArrayList<>();

    // REGISTER
    @PostMapping("/register")
    public String register(@RequestBody Map<String, String> data) {
        users.add(data);
        return "Register berhasil";
    }

    // LOGIN
    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> data) {
        String username = data.get("username");
        String password = data.get("password");

        // ADMIN FIX
        if (username.equals("admin") && password.equals("admin123")) {
            return "admin";
        }

        // USER BIASA
        for (Map<String, String> u : users) {
            if (u.get("username").equals(username) &&
                u.get("password").equals(password)) {
                return "user";
            }
        }

        return "gagal";
    }
}