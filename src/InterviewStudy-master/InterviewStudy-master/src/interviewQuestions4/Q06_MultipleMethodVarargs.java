public class Q06_MultipleMethodVarargs {
    public static void main(String[] args) {
        /*
        Problem tanımı :
        farklı 4 ögrencının 6,4,3 ve 5 yazılı notlarının ortalamasını
        yazdıran parametrelı method yazınız
         */

        ortalamaHesapla("gülşen",55,65,45,67,23,45);
        ortalamaHesapla("feyza",45,45,45,45);
        ortalamaHesapla("ömer",55,55,55);
        ortalamaHesapla("figen",90,85,89,95,98);
    }
    public static void ortalamaHesapla(String isim,double...not){
        double toplam=0;

        for (double k:not
             ) {
            toplam+=k;
        }
        System.out.println(isim+"-->"+(toplam/not.length));

    }
}
