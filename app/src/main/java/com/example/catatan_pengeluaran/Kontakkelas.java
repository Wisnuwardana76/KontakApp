package com.example.catatan_pengeluaran;

import java.io.Serializable;

public class Kontakkelas implements Serializable
{
    public String nama;
    public String no_hp;
    public String status;
    public String color;

    public Kontakkelas(String nama, String no_hp, String status, String color) {
        this.nama = nama;
        this.no_hp = no_hp;
        this.status = status;
        this.color = color;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
