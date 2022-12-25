package com.example.demo.bean;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Car{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String marka;
    private int model;
    private int fiyat;
    private String renk;
    private String yakit;
    private String sehir;

    public Car() {
    }

    public Car(long id, String marka, int model, int fiyat, String renk, String yakit, String sehir) {
        super();
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
        this.renk = renk;
        this.yakit = yakit;
        this.sehir = sehir;
    }

    public long getId() {
        return id;
    }

    public String getMarka() {
        return marka;
    }

    public int getModel() {
        return model;
    }

    public int getFiyat() {
        return fiyat;
    }

    public String getRenk() {
        return renk;
    }

    public String getYakit() {
        return yakit;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setYakit(String yakit) {
        this.yakit = yakit;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model=" + model +
                ", fiyat=" + fiyat +
                ", renk='" + renk + '\'' +
                ", yakit='" + yakit + '\'' +
                ", sehir='" + sehir + '\'' +
                '}';
    }
}
