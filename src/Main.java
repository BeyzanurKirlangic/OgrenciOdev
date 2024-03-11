import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Ogrenci OGR1 = new Ogrenci(null, null, "1973", 0.0, "104", "001", 0, 0);
        Ogrenci OGR2 = new Ogrenci("Gökhan", "Bilgisayar Müh.", "1985", 0.0, "104", "001", 0, 0);
        Ogrenci OGR3 = new Ogrenci("Ayşe", "Makine Müh.", "1985", 0.0, "104", "001", 7, 1);
        Ogrenci OGR4 = new Ogrenci("Elif", "Elektrik-Elektronik Müh.", "2020", 1.98, "104", "001", 5, 3);


        System.out.println("OGR-1 " + OGR1.getAd()+" "+OGR1.getBolum()+" "+ OGR1.getOgrNo()+" "+OGR1.getGano());
        System.out.println("OGR-2 " + OGR2.getAd()+" "+OGR2.getBolum()+" "+ OGR2.getOgrNo()+" "+OGR2.getGano());
        System.out.println("OGR-3 " + OGR3.getAd()+" "+OGR3.getBolum()+" "+ OGR3.getOgrNo()+" "+OGR3.getGano());
        System.out.println("OGR-4 " + OGR4.getAd()+" "+OGR4.getBolum()+" "+ OGR4.getOgrNo()+" "+OGR4.getGano());

        double harc3 = OGR3.HarcHesapla(OGR3.getDersSayisi(),OGR3.getUzatmaYili());
        double harc4 = OGR4.HarcHesapla(OGR4.getDersSayisi(), OGR4.getUzatmaYili());

        System.out.println("3. öğrencinin ödeyeceği harç: " + harc3);
        System.out.println("4. öğrencinin ödeyeceği harç: " + harc4);



        }





        }

