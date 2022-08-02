import java.util.Scanner;

public class QQ4_PerfectNumber {
    public static void main(String[] args) {
        /* Perfect Number (Mukemmel sayi)
  Kullanici tarafindan bir sayiya kadar olan sayilarin,
  mukemmel olup olmadigini bulan method yaziniz.
  Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
  kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
  ORNEK: (6, 28, 496, 8128)
  INPUT      : 6
  OUTPUT     :  1,2,3
*/

        Scanner scan=new Scanner(System.in);

        System.out.print("Bir sayı gırınız :");
        int sayı=scan.nextInt();

        for (int i = 0; i <=sayı ; i++) {
            mukemmelSayı(i);//girilen sayıya kadar olan mukemmel sayıları yazdırır.
        }

    }

    private static void mukemmelSayı(int sayı) {
        int toplam =0;
        for (int i = 1; i <sayı ; i++) {
            if (sayı%i==0){
                toplam+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        if (toplam==sayı){
            System.out.println(sayı+" sayısı mükemmel sayıdır.");
        } else{
            System.out.println(sayı+" sayısı mükemmel sayı değildir");
        }




    }
}
