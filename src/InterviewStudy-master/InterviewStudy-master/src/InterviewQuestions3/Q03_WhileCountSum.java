import java.util.Scanner;

public class Q03_WhileCountSum {
    //  Kullanicidan toplanmak uzere sayilar isteyin
    // sayi adedi 10'u gecerse veya toplam 500 'u gecerse
    // bu kadar sayi yeter
    // ".. adet sayi girdin, toplami..." yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayıAdedi=0;

        while (toplam<=500 && sayıAdedi<=10){
            System.out.println("lütfen sayı gırınız");
            int sayı= scan.nextInt();
            toplam+=sayı;
            sayıAdedi++;
        }
        System.out.println("bu kadar sayı yeterli -->"+sayıAdedi+ "kadar sayı gırıdınız,toplamı-->"+toplam);
    }
}
