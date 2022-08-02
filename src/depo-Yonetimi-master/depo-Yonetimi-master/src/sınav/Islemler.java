import java.util.*;

public class Islemler {
    static ArrayList<String> urunListesi = new ArrayList<>(Arrays.asList("Domates", "Salatalık", "Portakal", "Mandalina", "Elma"));
    static Map<Integer, Urunler> sepeteEklenenUrunler = new HashMap<>();
    static int domatesFıyatı = 5;
    static int portakalFıyatı = 6;
    static int salatalıkFıyatı = 12;
    static int mandalinaFıyatı = 10;
    static int elmaFıyatı = 8;
    static int faturaFıyatı = 0;

    static Scanner scan = new Scanner(System.in);
    static int alınanUrunId = 1000;

    public static void alısverisPaneli() {
        System.out.println("*******Java Manava Hoşgeldınız*****");
        System.out.println("lütfen yapmak istediğiniz işlemi seciniz\n1-Ürün seç\n2-Ürün satın al\n3-sepettekı urunlerı gormek için\n4-ÇIKIŞ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                urunSec();
                alısverisPaneli();
                break;
            case 2:
                urunSatınAl();
                alısverisPaneli();
                break;
            case 3:
                sepetiListele();
                break;
            case 4:
                cıkıs();
                break;

        }


    }

    private static void sepetiListele() {
        System.out.println("sepetinizdeki urunler-->"+sepeteEklenenUrunler);
    }

    private static void urunSatınAl() {
        System.out.println("---->Urun Satın Alma sayfası<----");
        int kullanıcınınGırdıgıId = scan.nextInt();
            System.out.println("Aldıgınız urunler-->" + sepeteEklenenUrunler);
            System.out.println("Toplam faturanız-->" + faturaFıyatı);
            System.out.println("satın almak için->1\nişlemi iptal etmek için->2\nalışverişe Devam etmek için->3 ");
            int secım = scan.nextInt();
            switch (secım) {
                case 1:
                    System.out.println("satın alma işleminiz gerçekleşmiştir");
                    faturaFıyatı=0;
                    sepeteEklenenUrunler.clear();
                    cıkıs();
                    break;
                case 2:
                    System.out.println("işleminiz iptal edilmiştir");
                    alısverisPaneli();
                    break;
                case 3:
                    urunSec();
                    break;
            }
        }




    private static void cıkıs() {
        System.out.println("yine bekleriz....:)");
        System.exit(0);
    }

    private static void urunSec() {
        System.out.println("----->ürünn seçme sayfası<-------");
        System.out.println("Manavdaki ürün listesi-->" + urunListesi);

        System.out.println("Lütfen secmek istediğiniz urunun ismini giriniz");
        scan.nextLine();
        String urunIsmı = scan.nextLine();
        System.out.println("lütfen ürün için miktar giriniz");
        int urunMıktarı = scan.nextInt();
        int urunFıyatı = 0;
        boolean flag=false;
        if (urunIsmı.equalsIgnoreCase("domates")) {
            flag=true;
            urunFıyatı = urunMıktarı * domatesFıyatı;
        } else if (urunIsmı.equalsIgnoreCase("mandalina")) {
            flag=true;
            urunFıyatı = urunMıktarı * mandalinaFıyatı;
        } else if (urunIsmı.equalsIgnoreCase("salatalık")) {
            flag=true;
            urunFıyatı = urunMıktarı * salatalıkFıyatı;
        } else if (urunIsmı.equalsIgnoreCase("portakal")) {
            flag=true;
            urunFıyatı = urunMıktarı * portakalFıyatı;
        } else if (urunIsmı.equalsIgnoreCase("elma")) {
            flag=true;
            urunFıyatı = urunMıktarı * elmaFıyatı;
        }
        if (!flag){
            System.out.println("Manavımızda bu urun mevcut değildir");
        }
        faturaFıyatı += urunFıyatı;

        Urunler urun = new Urunler(urunIsmı, urunMıktarı, urunFıyatı);
        sepeteEklenenUrunler.put(alınanUrunId, urun);
        System.out.println("Urununuz sepete eklendi");
        System.out.println("eklenen urununuz --> ID Nosu=" + sepeteEklenenUrunler.get(alınanUrunId));
        System.out.println("Lütfen işlem tercihi yapınız\nBaşka urun almak istiyorsanız->1\nSepete eklediğiniz ürünü satın almak için->2\n" +
                "Sepetteki ürünlerinizi görmek için->3\nAna sayfaya dönmek için->4");
        int islemTercihi = scan.nextInt();
        switch (islemTercihi) {
            case 1:
                urunSec();
                break;
            case 2:
                urunSatınAl();
                break;
            case 3:
                sepetiListele();
                break;
            case 4:
                alısverisPaneli();
                break;

        }
        alınanUrunId++;

    }

}
