public class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili;
    private int ogrNo;
    private double gano;
    private int bolumKodu;

    public Ogrenci() {
        //Bu şekilde default değerde bırakırsam teker teker değişken atamalarını yapmak zorundayım
    }

    public Ogrenci(int ogrNo, String ad, String bolum, int girisYili, int bolumKodu, double gano) {
        this.ad = ad;
        this.bolum = bolum;
        this.ogrNo = ogrNo;
        this.girisYili = girisYili;
        this.gano = gano;
        this.bolumKodu = bolumKodu;
        //Constructor yapı içerisine değişkenleri yerleştirdikten sonra öğrenci nesnesi oluşturduğumda kolaylıkla değişken atamalarını yaptım
    }

    public void showInfos() { //Bu tanımlanan metodu main metodu içinde çağırdım ve ekrana yazdırdı
        System.out.println("OGR-" + this.ogrNo + " " + this.ad + " " + this.bolum + " " + this.girisYili + this.bolumKodu + " " + this.gano);
    }

    private int dersSayisi;
    private int uzatilanYil;

    public Ogrenci(int dersSayisi, int uzatilanYil) {
        this.dersSayisi = dersSayisi;
        this.uzatilanYil = uzatilanYil;
    }

    public void ortalamaIncele(double gano) {
        if (gano >= 4 || gano <= 0) {
            throw new IllegalArgumentException("Genel Ağırlıklı Not ortalaması 1 ve 4 arasında olmak zorundadır");
        }
    }

    public void harcHesapla() {
        if (girisYili==1985){
            System.out.println(ogrNo+". Öğrencinin Harç Ücreti: "+  480);
        }
        if (girisYili==2020) {
            System.out.println(ogrNo+". Öğrencinin Harç Ücreti: "+960);
        }
    }
}