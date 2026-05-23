package com.boothramadhan.model;

public class Penyewaan {
    private int id;
    private String namaPelanggan;
    private int boothId;
    private String tanggal;

    public Penyewaan() {}

    public Penyewaan(int id, String namaPelanggan, int boothId, String tanggal) {
        this.id = id;
        this.namaPelanggan = namaPelanggan;
        this.boothId = boothId;
        this.tanggal = tanggal;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNamaPelanggan() { return namaPelanggan; }
    public void setNamaPelanggan(String namaPelanggan) { this.namaPelanggan = namaPelanggan; }

    public int getBoothId() { return boothId; }
    public void setBoothId(int boothId) { this.boothId = boothId; }

    public String getTanggal() { return tanggal; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }
}