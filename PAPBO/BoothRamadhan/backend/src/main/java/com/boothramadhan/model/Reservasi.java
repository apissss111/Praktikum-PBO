package com.boothramadhan.model;

public class Reservasi {
    private int id;
    private int boothId;
    private String username;
    private String tanggal;

    public Reservasi() {}

    public Reservasi(int id, int boothId, String username, String tanggal) {
        this.id = id;
        this.boothId = boothId;
        this.username = username;
        this.tanggal = tanggal;
    }

    public int getId() { return id; }
    public int getBoothId() { return boothId; }
    public String getUsername() { return username; }
    public String getTanggal() { return tanggal; }

    public void setId(int id) { this.id = id; }
    public void setBoothId(int boothId) { this.boothId = boothId; }
    public void setUsername(String username) { this.username = username; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }
}