package com.umit.entity;

public class Insan {
    public String isim;
    public String soyIsim;
    public boolean hastalikTasiyorMu=false;
    public boolean asiliMi=true;
    public boolean hasta=false;
    private static Insan[]asiOlanlar=new Insan[15];
    private static int  asiOlanKisiSayisi=0;

    public void asiOlanlar(Insan insan){
        asiOlanlar[asiOlanKisiSayisi++]=insan;
    }
    public void asiOlanListeGoster(){
        System.out.println("************* RAPOR EKRANI ***************");
        System.out.println();
        for (int i=0;i<asiOlanlar.length;i++){
            System.out.println(asiOlanlar[i]);
        }
    }

    public Insan() {
    }

    public Insan(String isim, String soyIsim) { //bu method superInsan ve Doktor icin var , Doktor icin sadece hastalik tasiyorMu ozelligi degisebilir.
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.asiliMi=true;
        this.hastalikTasiyorMu=false;
        this.hasta=false;
    }

    public Insan(String isim, String soyIsim, boolean asiliMi) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.asiliMi = asiliMi;
    }

    public Insan(String isim, String soyIsim, boolean hastalikTasiyorMu, boolean asiliMi, boolean hasta) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.hastalikTasiyorMu = hastalikTasiyorMu;
        this.asiliMi = asiliMi;
        this.hasta = hasta;
    }

    @Override
    public String toString() {
        return "Insan{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", hastalikTasiyorMu=" + hastalikTasiyorMu +
                ", asiliMi=" + asiliMi +
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public boolean isAsiliMi() {
        return asiliMi;
    }

    public void setAsiliMi(boolean asiliMi) {
        this.asiliMi = asiliMi;
    }

    public boolean isHastalikTasiyorMu() {
        return hastalikTasiyorMu;
    }

    public void setHastalikTasiyorMu(boolean hastalikTasiyorMu) {
        this.hastalikTasiyorMu = hastalikTasiyorMu;
    }

    public boolean isHasta() {
        return hasta;
    }

    public void setHasta(boolean hasta) {
        this.hasta = hasta;
    }

    public int getAsiOlanKisiSayisi() {
        return asiOlanKisiSayisi;
    }

    public void setAsiOlanKisiSayisi(int asiOlanKisiSayisi) {
        this.asiOlanKisiSayisi = asiOlanKisiSayisi;
    }

    public Insan[] getAsiOlanlar() {
        return asiOlanlar;
    }

    public void setAsiOlanlar(Insan[] asiOlanlar) {
        this.asiOlanlar = asiOlanlar;
    }
}
