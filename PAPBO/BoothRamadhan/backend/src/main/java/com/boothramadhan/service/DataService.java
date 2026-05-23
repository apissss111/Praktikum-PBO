package com.boothramadhan.service;

import com.boothramadhan.model.Booth;
import com.boothramadhan.model.Reservasi;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {

    private List<Booth> booths = new ArrayList<>();
    private List<Reservasi> reservasiList = new ArrayList<>();

    private int boothId = 1;
    private int reservasiId = 1;

    // ================= BOOTH =================
    public List<Booth> getBooths() {
        return booths;
    }

    public Booth addBooth(Booth b) {
        b.setId(boothId++);
        booths.add(b);
        return b;
    }

    public Booth updateBooth(int id, Booth newBooth) {
        for (Booth b : booths) {
            if (b.getId() == id) {
                b.setNama(newBooth.getNama());
                b.setLokasi(newBooth.getLokasi());
                b.setHarga(newBooth.getHarga());
                return b;
            }
        }
        return null;
    }

    public boolean deleteBooth(int id) {
        return booths.removeIf(b -> b.getId() == id);
    }

    // ================= RESERVASI =================
    public String tambahReservasi(int boothId, String username, String tanggal) {

        for (Reservasi r : reservasiList) {
            if (r.getBoothId() == boothId && r.getTanggal().equals(tanggal)) {
                return "GAGAL: Booth sudah dipesan di tanggal ini";
            }
        }

        reservasiList.add(new Reservasi(reservasiId++, boothId, username, tanggal));
        return "OK";
    }

    public List<Reservasi> getReservasiByUsername(String username) {

        List<Reservasi> hasil = new ArrayList<>();

        for (Reservasi r : reservasiList) {
            if (r.getUsername() != null &&
                r.getUsername().equalsIgnoreCase(username)) {
                hasil.add(r);
            }
        }

        return hasil;
    }

    public List<Reservasi> getAllReservasi() {
        return reservasiList;
    }
}