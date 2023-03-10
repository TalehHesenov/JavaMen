package util;

import java.util.ArrayList;
import main.Anbar;

public class AnbarToplaMenu {

    public static void menuBir() {
        int say = SoutScannerYazdir.intYazdir("Nece Eded Daxil Edilecek?");
        Anbar.praduktTopla = new Anbar[say];
        for (int i = 0; i < say; i++) {
            int id = SoutScannerYazdir.intYazdir("Id Daxil Et");
            String ad = SoutScannerYazdir.stringYazdir("Ad Daxil Et:");
            double qiymet = SoutScannerYazdir.doubleYazdir("Qiymet Daxil Et");
            String kateqorya = SoutScannerYazdir.stringYazdir("Kateqorya");
            Anbar.praduktTopla[i] = new Anbar(id, ad, qiymet, kateqorya);

        }

    }
    public static void menuIki(){
    
     for (int i = 0; i < Anbar.praduktTopla.length; i++) {
                          if (Anbar.praduktTopla[i]!=null) {
              System.out.println(i+1+"."+Anbar.praduktTopla[i]);
         }
                }
    
    }
    public static void menuUc(){
    
    
       String axtar = SoutScannerYazdir.stringYazdir("Pradukt Adi ve ya Kateqoryasi ile Axtar");
                for (int i = 0; i < Anbar.praduktTopla.length; i++) {
                    
                    if (Anbar.praduktTopla[i].getAd().contains(axtar)||
                            Anbar.praduktTopla[i].getKateqorya().contains(axtar)) {
                        System.out.println(Anbar.praduktTopla[i]);
                        
                    }
                
            }
    
    
    }
    public static void menuDord(){
    
        AnbarToplaMenu.menuIki();
                int say = SoutScannerYazdir.intYazdir("Necenci Pradukt Deyisdirmek Isdeyirsiz?");
                Anbar anbar = Anbar.praduktTopla[say - 1];
                String deyis = SoutScannerYazdir.stringYazdir("Id Ad Qiymet ve ya Kateqorya");
                if (deyis.contains("Id")) {
                    anbar.setId(SoutScannerYazdir.intYazdir("Yeni Id:"));
                }
                if (deyis.contains("Ad")) {
                    anbar.setAd(SoutScannerYazdir.stringYazdir("Yeni Ad:"));
                }
                if (deyis.contains("Qiymet")) {
                    anbar.setQiymet(SoutScannerYazdir.doubleYazdir("Yeni Qiymet:"));

                }
                if (deyis.contains("Kateqorya")) {
                    anbar.setKateqorya(SoutScannerYazdir.stringYazdir("Yeni Kateqorya:"));

                }
    
    
    }
    public static void menuBes(){
    
    
 
     
     int sil=  SoutScannerYazdir.intYazdir("Necencini Silmek Isteyirsiniz?")-1;
     
     
      Anbar.praduktTopla2 = new Anbar[Anbar.praduktTopla.length];
     
   
        for (int i = 0; i < Anbar.praduktTopla.length; i++) {
            if (i!=sil) {
                Anbar.praduktTopla2[i]=Anbar.praduktTopla[i];
                
            }
           
        }
        
        Anbar.praduktTopla=Anbar.praduktTopla2;
        AnbarToplaMenu.menuIki();
  
   
        
    
      
    
    }}


