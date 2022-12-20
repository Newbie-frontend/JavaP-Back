package com.example.demo.bean;

public class Adres {
    private String sehir;
    private String mahalle;
    private String cadde;
    private String sokak;
    private int nomara;

    public Adres() {

    }

    public Adres(String sehir, String mahalle, String cadde, String sokak, int nomara) {
        this.sehir = sehir;
        this.mahalle = mahalle;
        this.cadde = cadde;
        this.sokak = sokak;
        this.nomara = nomara;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getCadde() {
        return cadde;
    }

    public void setCadde(String cadde) {
        this.cadde = cadde;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public int getNomara() {
        return nomara;
    }

    public void setNomara(int nomara) {
        this.nomara = nomara;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "sehir='" + sehir + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", cadde='" + cadde + '\'' +
                ", sokak='" + sokak + '\'' +
                ", nomara=" + nomara +
                '}';
    }
}

