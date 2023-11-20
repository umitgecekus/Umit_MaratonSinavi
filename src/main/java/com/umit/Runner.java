package com.umit;

import com.umit.entity.Doktor;
import com.umit.entity.Insan;
import com.umit.entity.NormalInsan;
import com.umit.entity.SuperInsan;
import com.umit.service.Saglik;

public class Runner {
    public static void main(String[] args) {
        Saglik saglik=new Saglik();

        //Hasta olup, asisi olmayan normal insan tanımlıyoruz.  Polymorphism kullandik. Kalıtım örneğidir.
        Insan normalInsan=new NormalInsan("Umit","Gecekus",true,false,true);

        //asilama islemini musaitlik durumuna gore yapiyoruz ve cikti olarak bilgi veriyoruz
        saglik.asilamaYap(normalInsan);

        //tekrardan asi islemi yapmaya calistigimizda güncel bilgiyi cikti olarak veriyoruz.
        saglik.asilamaYap(normalInsan);
        System.out.println();

        //ekrana yazdir methodu kisinin bilgilerini veriyor
        saglik.ekranaYazdir(normalInsan);
        System.out.println();

        //yeni bir kişi oluşturup özelliklerini giriyoruz.Bu sefer asisi olsun
        normalInsan= new NormalInsan("Zeynep","Gönül",false,true,false);
        saglik.asilamaYap(normalInsan);
        System.out.println();

        //hasta olmayan ama aşı yaptırmak isteyen normal insan tanımladık
        normalInsan=new NormalInsan("Buse","Yaşar",false,false,false);
        saglik.asilamaYap(normalInsan);
        System.out.println();

        //aşı ve hastalığı olmayan ama taşıyıcı olan normal kişiye aşı yaptırdık.
        normalInsan=new NormalInsan("Pelin","Kaya",true,false,false);
        saglik.asilamaYap(normalInsan);
        System.out.println();

        //Superinsan için çıktı verdik
        normalInsan=new SuperInsan("Ozge","Yilmaz");
        saglik.asilamaYap(normalInsan);  //superInsan icin asi yapilmadi ve ekrana cikti verildi
        System.out.println();

        //Doktor için çıktı verdik
        normalInsan=new Doktor("Hilal","Tekin",true);
        saglik.asilamaYap(normalInsan);
        System.out.println();


        //asi olan kisi listesi (RAPOR EKRANI)
        normalInsan.asiOlanListeGoster();



    }//main sonu


}//class sonu
