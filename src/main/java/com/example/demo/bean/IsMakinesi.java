package com.example.demo.bean;

import jakarta.persistence.Entity;

@Entity(name = "ismakinesi")
public class IsMakinesi extends Car{
    private int agirlik;
    private String tip;

    public IsMakinesi() {}

    public IsMakinesi(long id, String marka, int model, int fiyat, String renk, String yakit, String sehir, int agirlik, String tip) {
        super(id, marka, model, fiyat, renk, yakit, sehir);
        this.agirlik = agirlik;
        this.tip = tip;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "IsMakinesi{" +
                "agirlik=" + agirlik +
                ", tip='" + tip + '\'' +
                '}';
    }
}
