package com.umit.entity;

public class NormalInsan extends Insan{
    public NormalInsan(String isim, String soyIsim) {
        super(isim, soyIsim);
    }

    public NormalInsan(String isim, String soyIsim, boolean hastalikTasiyorMu, boolean asiliMi, boolean hasta) {
        super(isim, soyIsim, hastalikTasiyorMu, asiliMi, hasta);
    }


    @Override
    public String toString() {
        return "NormalInsan{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", hastalikTasiyorMu=" + hastalikTasiyorMu +
                ", asiliMi=" + asiliMi +
                ", hasta=" + hasta +
                '}';
    }

}
