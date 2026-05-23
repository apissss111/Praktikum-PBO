package com.boothramadhan.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    private List<Map<String, String>> users = new ArrayList<>();

    @PostMapping("/register")
    public String register(@RequestBody Map<String, String> data) {
        users.add(data);
        return "Register berhasil";
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> data) {
        String username = data.get("username");
        String password = data.get("password");

        if (username == null || password == null) {
            return "gagal";
        }

        if (username.equals("admin") && password.equals("admin123")) {
            return "admin";
        }

        for (Map<String, String> u : users) {
            if (username.equals(u.get("username")) &&
                password.equals(u.get("password"))) {
                return "user";
            }
        }

        return "gagal";
    }
}