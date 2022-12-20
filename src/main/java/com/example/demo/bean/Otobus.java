package com.example.demo.bean;

import jakarta.persistence.Entity;

@Entity(name = "otobus")
public class Otobus extends Car{
    private double uzunluk;
    private int koltukSayisi;

    public Otobus() {

    }

    public Otobus(long id, String marka, int model, int fiyat, String renk, String yakit, String sehir, double uzunluk, int koltukSayisi) {
        super(id, marka, model, fiyat, renk, yakit, sehir);
        this.uzunluk = uzunluk;
        this.koltukSayisi = koltukSayisi;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getKoltukSayisi() {
        return koltukSayisi;
    }

    public void setKoltukSayisi(int koltukSayisi) {
        this.koltukSayisi = koltukSayisi;
    }

    @Override
    public String toString() {
        return "Otobus{" +
                "uzunluk=" + uzunluk +
                ", koltukSayisi=" + koltukSayisi +
                '}';
    }
}
