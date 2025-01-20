package com.cc.java;

public class Konto {
    private int kontostand;

    public Konto() {
        this.kontostand = 10000; // Anfangswert
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }
}
