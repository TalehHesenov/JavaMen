
package main;


public class Anbar {
    public static Anbar[] praduktTopla= null;
     public static Anbar[] praduktTopla2= null;
    
  private int id;
  private String ad;
  private double qiymet;
  private String kateqorya;

    @Override
    public String toString() {
        return "Pradukt" + "\nId:" + id + "\nAd:" + ad + "\nQiymet:" + qiymet + "\nKateqorya:" + kateqorya+ "\n" ;
    }
  
  

    public Anbar(int id, String ad, double qiymet, String kateqorya) {
        this.id = id;
        this.ad = ad;
        this.qiymet = qiymet;
        this.kateqorya = kateqorya;
    }

    public Anbar() {
    }

    public static Anbar[] getPraduktTopla() {
        return praduktTopla;
    }

    public static void setPraduktTopla(Anbar[] praduktTopla) {
        Anbar.praduktTopla = praduktTopla;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getQiymet() {
        return qiymet;
    }

    public void setQiymet(double qiymet) {
        this.qiymet = qiymet;
    }

    public String getKateqorya() {
        return kateqorya;
    }

    public void setKateqorya(String kateqorya) {
        this.kateqorya = kateqorya;
    }
  
  
  
  
  

}