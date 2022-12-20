package com.example.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Objects;

@Entity(name = "binek")
public class Binek extends Car {
    @Column(nullable = false)
    private String tip;
    @Column(nullable = false)
    private String vites;

    public Binek() {
    }

    public Binek(long id, String marka, int model, int fiyat, String renk, String yakit, String sehir, String tip, String vitesTipi) {
        super(id, marka, model, fiyat, renk, yakit, sehir);
        this.tip = tip;
        this.vites = vitesTipi;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    @Override
    public String toString() {
        return "Binek{" +
                "tip='" + tip + '\'' +
                ", vitesTipi='" + vites + '\'' +
                '}';
    }
}
