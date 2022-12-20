package com.example.demo.bean;

import jakarta.persistence.Entity;

@Entity(name = "kamyon")
public class Kamyon extends Car{
    private int uzunluk;
    private int tasiyabilecekYuk;

    public Kamyon() {

    }

    public Kamyon(long id, String marka, int model, int fiyat, String renk, String yakit, String sehir, int uzunluk, int tasiyabilecekYuk) {
        super(id, marka, model, fiyat, renk, yakit, sehir);
        this.uzunluk = uzunluk;
        this.tasiyabilecekYuk = tasiyabilecekYuk;
    }



    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getTasiyabilecekYuk() {
        return tasiyabilecekYuk;
    }

    public void setTasiyabilecekYuk(int tasiyabilecekYuk) {
        this.tasiyabilecekYuk = tasiyabilecekYuk;
    }

    @Override
    public String toString() {
        return "Kamyon{" +
                ", uzunluk=" + uzunluk +
                ", tasiyabilecekYuk=" + tasiyabilecekYuk +
                '}';
    }
}
