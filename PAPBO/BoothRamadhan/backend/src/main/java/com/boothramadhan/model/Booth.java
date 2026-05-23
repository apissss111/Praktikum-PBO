package com.boothramadhan.model;

public class Booth {
    private int id;
    private String nama;
    private String lokasi;
    private int harga;

    public Booth() {}

    public Booth(int id, String nama, String lokasi, int harga) {
        this.id = id;
        this.nama = nama;
        this.lokasi = lokasi;
        this.harga = harga;
    }

    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getLokasi() { return lokasi; }
    public int getHarga() { return harga; }

    public void setId(int id) { this.id = id; }
    public void setNama(String nama) { this.nama = nama; }
    public void setLokasi(String lokasi) { this.lokasi = lokasi; }
    public void setHarga(int harga) { this.harga = harga; }
}