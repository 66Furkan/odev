import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci(1,null,null,1985,104001,0);
        Ogrenci ogrenci1 = new Ogrenci(2,"Gökhan","Bilgisayar Müh",1985,104001,0);
        Ogrenci ogrenci2 = new Ogrenci(3,"Ayşe","Makine Müh",1985,104001,0);
        Ogrenci ogrenci3 = new Ogrenci(4,"Elif","Elektrik-Elektronik Müh",2020,104001,1.98);

        ogrenci.showInfos();
        ogrenci1.showInfos();
        ogrenci2.showInfos();
        ogrenci3.showInfos();
        ogrenci2.harcHesapla();
        ogrenci3.harcHesapla();

    }
}