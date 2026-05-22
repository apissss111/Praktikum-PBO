package com.boothramadhan.service;

import com.boothramadhan.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {

    // ========================
    // DATA STORAGE (sementara)
    // ========================
    private List<Booth> boothList = new ArrayList<>();
    private List<Penyewaan> penyewaanList = new ArrayList<>();
    private List<User> userList = new ArrayList<>();

    private int boothIdCounter = 1;
    private int penyewaanIdCounter = 1;

    // ========================
    // BOOTH (ADMIN)
    // ========================

    public List<Booth> getAllBooth() {
        return boothList;
    }

    public Booth addBooth(Booth b) {
        b.setId(boothIdCounter++);
        boothList.add(b);
        return b;
    }

    public Booth updateBooth(int id, Booth updated) {
        for (Booth b : boothList) {
            if (b.getId() == id) {
                b.setNamaBooth(updated.getNamaBooth());
                b.setLokasi(updated.getLokasi());
                b.setHarga(updated.getHarga());
                return b;
            }
        }
        return null;
    }

    public void deleteBooth(int id) {
        boothList.removeIf(b -> b.getId() == id);
    }

    // ========================
    // PENYEWAAN (PELANGGAN)
    // ========================

    public List<Penyewaan> getAllPenyewaan() {
        return penyewaanList;
    }

    public Penyewaan addPenyewaan(Penyewaan p) {
        p.setId(penyewaanIdCounter++);
        penyewaanList.add(p);
        return p;
    }

    public void deletePenyewaan(int id) {
        penyewaanList.removeIf(p -> p.getId() == id);
    }

    // ========================
    // AUTH (LOGIN & REGISTER)
    // ========================

    public User registerUser(Pelanggan p) {
        userList.add(p);
        return p;
    }

    public User loginUser(String username, String password) {
        for (User u : userList) {
            if (u.getUsername().equals(username) &&
                u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }
}