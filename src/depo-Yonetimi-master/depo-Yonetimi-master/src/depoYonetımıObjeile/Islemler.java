import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Islemler {
    static Map<Integer, Urunler> yeniUrun = new HashMap<>();
    static Scanner scan = new Scanner(System.in);
    static int id = 1000;

    public static void giris() throws InterruptedException {
        System.out.println("***********HOŞGELDİNİZ************");
        String secim;
        do {
            System.out.println("------>İŞLEM TERCİHİ YAPINIZ<------\n" +
                    "1-->Ürün tanımlama     \n" +
                    "2-->Ürün Girişi           \n" +
                    "3-->Ürün Listeleme        \n" +
                    "4-->Ürün Rafa Yerleştirme \n" +
                    "5-->Ürün Çıkışı           \n" +
                    "Q-->Çıkış                 \n");

            secim = scan.next().toUpperCase();
            switch (secim) {
                case "1":
                    urunTanimlama();
                    break;
                case "2":
                    urunGirisı();
                    break;
                case "3":
                    urunLıstele();
                    break;
                case "4":
                    rafaYerlestirme();
                    break;
                case "5":
                    urunCıkis();
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Yanlış Seçim yaptınız");
            }
        } while (!secim.equalsIgnoreCase("Q"));
        System.out.println("Depodan çıkış yapılmıştır.Yine bekleriz");
    }

    private static void urunTanimlama() throws InterruptedException {
        System.out.println("-----> Ürün Tanımlama Sayfası <-----");
        System.out.println("Lütfen tanımlamak istediğiniz ürünün ismini giriniz");
        scan.nextLine();
        String urunIsmi = scan.nextLine();

        System.out.print("uretici giriniz : ");
        String uretici = scan.nextLine();

        System.out.print("urun birimi giriniz : ");
        String birim = scan.nextLine();
        System.out.print("urun miktarı giriniz : ");
        int miktar = scan.nextInt();
        scan.nextLine();
        System.out.print("urun icin raf giriniz : ");
        String raf = scan.nextLine();

        Urunler urun = new Urunler(urunIsmi, uretici, birim, miktar, raf);
        yeniUrun.put(id, urun);
        System.out.println(id + "= " + yeniUrun.get(id));
        Thread.sleep(2000);

        id++;

    }

    private static void urunGirisı() throws InterruptedException {
        System.out.println("----->Ürün Giriş Sayfası<-----");
        System.out.println("Lütfen ekleme yapmak istediğiniz ürünün ıd numarasını giriniz");
        id = scan.nextInt();
        if (yeniUrun.keySet().contains(id)) {
            System.out.print("miktar giriniz : ");
            int miktar = Math.abs(scan.nextInt()); //kullanıcıdan alınan sayiyin her ne girerse girsin pozitif olmasını sağlar
            yeniUrun.get(id).setMiktar(miktar + yeniUrun.get(id).getMiktar());
            System.out.println("urun ekleme isleminiz gerceklesti");
            System.out.println(yeniUrun.get(id));
            Thread.sleep(2000);

        } else {
            System.out.println("aradıgınız urun bulunamadı : ");
            System.out.println("yeni urun tanımlamak icin 1\n başka ID ile işlem yapmak için2\nana menü icin 3");
            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    urunTanimlama();
                    break;
                case 2:
                    urunGirisı();
                    break;
                case 3:
                    giris();
                    break;
                default:
                    System.out.println("hatali secim yaptiniz");
                    giris();
            }
        }
    }

    private static void urunLıstele() throws InterruptedException {
        Set<Map.Entry<Integer, Urunler>> sınıfEntrySeti = yeniUrun.entrySet();
        System.out.println("==============DEPO ÜRÜN LİSTESİ==========\n");
        System.out.println("___________________________________________");
        for (Map.Entry<Integer, Urunler> w : sınıfEntrySeti
        ) {
            Integer entryKey = w.getKey();
            Urunler valueStr = w.getValue();
            String valueArr[] = w.getValue().toString().split(", ");
            System.out.printf("%-5d %-6s %-9s %-6s %-3s \n", entryKey, valueArr[0], valueArr[1], valueArr[2], valueArr[3], valueArr[4]);

        }
        Thread.sleep(2000);

    }

    private static void rafaYerlestirme() throws InterruptedException {
        System.out.println("----> Raf numarası Güncelleme sayfası<----");
        System.out.println("Raf numarası güncellemek istediğiniz ürünün ıd numarasını gırınız");
        id = scan.nextInt();
        if (yeniUrun.keySet().contains(id)) {//mevcut urunun yerını değiştirmek için
            System.out.print("raf giriniz : ");
            String raf = scan.next();
            yeniUrun.get(id).setRafNo(raf);
            System.out.println("urun istediginiz rafa yerlestirildi ");
            System.out.println(yeniUrun.get(id));
            Thread.sleep(2000);

        } else {
            System.out.println("aradıgınız urun bulunamadı : ");
            System.out.println("başka ıd numarasındakı urunun raf guncellemesı için 1\nana menü icin 2");
            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    rafaYerlestirme();
                    break;
                case 2:
                    giris();
                    break;
                default:
                    System.out.println("hatali secim yaptiniz");
                    giris();
            }
        }
    }

    private static void urunCıkis() throws InterruptedException {
        System.out.println("---->Ürün çıkış sayfası<----");
        System.out.println("lütfen ürün çıkışı yapmak istediğiniz ürünün ıd numarasını gırınız");
        id = scan.nextInt();
        if (yeniUrun.keySet().contains(id)) {
            System.out.print("miktar giriniz : ");
            int miktar = Math.abs(scan.nextInt());
            if (miktar > yeniUrun.get(id).getMiktar()) {
                System.out.println("depoda girdiginiz miktarda urun yok");
                urunCıkis();
            } else {
                yeniUrun.get(id).setMiktar(yeniUrun.get(id).getMiktar() - miktar);
                System.out.println("urun cıkıs isleminiz gerceklesti");
                System.out.println("kalan ürün miktari : " + yeniUrun.get(id).getMiktar());
                Thread.sleep(2000);
            }
        } else {
            System.out.println("aradıgınız urun bulunamadı : ");
            System.out.println("urun cıkıs icin 1\n ana menü icin 2");
            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    urunCıkis();
                    break;
                case 2:
                    giris();
                    break;
                default:
                    System.out.println("hatali secim yaptiniz");
                    giris();
            }
        }
    }




}

