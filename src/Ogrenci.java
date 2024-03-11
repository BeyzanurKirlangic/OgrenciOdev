public class Ogrenci {
    private String ad;
    private String bolum;
    private String girisYili;
    private String ogrNo;
    private double gano;
    private String bolumKodu;
    private String girisSirasi;
    private int dersSayisi;
    private int uzatmaYili;

    public Ogrenci(String ad, String bolum,String ogrNo,double gano){
        this.ad=ad;
        this.bolum = bolum;
        this.ogrNo=ogrNo;
        this.gano=gano;


    }

    public Ogrenci(String ad,String bolum, String girisYili,double gano,String bolumKodu,String girisSirası,int dersSayisi,int uzatmaYili){
        this.ad=ad;
        this.bolum=bolum;
        this.girisYili=girisYili;
        this.gano=gano;
        this.bolumKodu=bolumKodu;
        this.dersSayisi=dersSayisi;
        this.uzatmaYili=uzatmaYili;
        this.girisSirasi=girisSirası;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(String girisYili) {
        this.girisYili = girisYili;
    }

    public String getOgrNo() {
        this.ogrNo=girisYili+bolumKodu+girisSirasi;
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("GANO 0 ile 4 arasında olmalıdır.");

        }
        this.gano = gano;

    }

    public String getBolumKodu() {
        return bolumKodu;
    }

    public String getGirisSirasi() {
        return girisSirasi;
    }

    public void setGirisSirasi(String girisSirasi) {
        this.girisSirasi = girisSirasi;
    }

    public void setBolumKodu(String bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public int getDersSayisi() {
        return dersSayisi;
    }

    public void setDersSayisi(int dersSayisi) {
        this.dersSayisi = dersSayisi;
    }

    public int getUzatmaYili() {
        return uzatmaYili;
    }

    public void setUzatmaYili(int uzatmaYili) {
        this.uzatmaYili = uzatmaYili;
    }

    public void ogrenciNoOlustur(String ogrNo){
        this.ogrNo= girisYili+bolumKodu+girisSirasi;

   }
    public double HarcHesapla(int dersSayisi) {

        return dersSayisi * 100;
    }
    public double HarcHesapla(int dersSayisi, int uzatmaYili) {

        double toplamHarc = dersSayisi * 100;
        double uzatmaUcreti = uzatmaYili * 500;
        return toplamHarc + uzatmaUcreti;
    }








}

