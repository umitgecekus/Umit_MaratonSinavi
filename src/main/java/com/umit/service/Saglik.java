package com.umit.service;

import com.umit.entity.Insan;
import com.umit.entity.NormalInsan;
import com.umit.entity.SuperInsan;

public class Saglik {

    public void asilamaYap(Insan insan) { //ası olan kisilerin hasta,hastalikTasiyorMu ozellikleri false olarak degistirildi, asiliMi ozelligi ise true oldu.

        if (insan instanceof NormalInsan ){
            if (insan.hasta && !insan.asiliMi) { //hasta olup asisi yoksa
                System.out.println(insan.isim+" "+insan.soyIsim +" adında ki hasta olan normal insana aşı yapıldı");
                insan.hasta=false;
                insan.asiliMi=true;
                insan.hastalikTasiyorMu=false;
                insan.asiOlanlar(insan);


            }
            else if (insan.asiliMi) {System.out.println(insan.isim+" " +insan.soyIsim+ " adlı kişiye daha önceden aşı yapılmış."); insan.hasta=false;insan.hastalikTasiyorMu=false;}//asisi varsa
            //ustte insan.asiOlanlar(insan); yazmiyoruz cunku asisi olan kisilere asi yapilmiyor o yuzden asi olanlar listesine eklemek hatali olur.
            else if (!insan.asiliMi && !insan.hasta&&!insan.hastalikTasiyorMu){ System.out.println(insan.isim+" "+insan.soyIsim+" hasta olmamasına rağmen aşı yaptırdı"); //hasta degil ve asisi yoksa
                insan.asiliMi=true;insan.hastalikTasiyorMu=false;insan.asiOlanlar(insan);}
            else if (insan.hastalikTasiyorMu) {
                System.out.println(insan.isim+" "+insan.soyIsim+" hastalık taşımamak için aşı yaptırdı");
                insan.hastalikTasiyorMu=false;
                insan.asiliMi=true;
                insan.asiOlanlar(insan);
            }
        }
        else if (insan instanceof SuperInsan)System.out.println("Sadece Normal insanlara aşı yapılabilir... "+insan.isim +" " +insan.soyIsim+ " Süper insan olduğu için aşıya ihtiyacı yoktur...");
        else System.out.println("Sadece normal insanlara aşı yapılabilir... "+insan.isim + " " +insan.soyIsim+ " Doktor olduğu için daha önceden aşı olmuştur... ");

    }
    public void ekranaYazdir(Insan insan){
        System.out.println("*********Kişi Bilgisi*********");
        System.out.println(insan.isim);
        System.out.println(insan.soyIsim);
        System.out.println("hasta mı "+insan.hasta);
        System.out.println("aşılı mı "+insan.asiliMi);
        System.out.println("hastalık taşıyor mu "+insan.hastalikTasiyorMu);

    }



}//saglik class sonu
