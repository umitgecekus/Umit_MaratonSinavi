package com.umit.entity;

public class Doktor extends Insan {
    public Doktor(String isim, String soyIsim,boolean hastalikTasiyorMu) { //doktor asili ve hasta olamaz, sadece tasiyici olabilir.
        super(isim, soyIsim, hastalikTasiyorMu);
    }
}
