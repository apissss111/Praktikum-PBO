package com.boothramadhan.model;

public class Booth {
    private int id;
    private String namaBooth;
    private String lokasi;
    private double harga;

    public Booth() {}

    public Booth(int id, String namaBooth, String lokasi, double harga) {
        this.id = id;
        this.namaBooth = namaBooth;
        this.lokasi = lokasi;
        this.harga = harga;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNamaBooth() { return namaBooth; }
    public void setNamaBooth(String namaBooth) { this.namaBooth = namaBooth; }

    public String getLokasi() { return lokasi; }
    public void setLokasi(String lokasi) { this.lokasi = lokasi; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
}