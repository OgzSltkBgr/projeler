import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_CountFactors {
    public static void main(String[] args) {
       /*
        Type java code by using while loop,
       Write a program to count the factors of an integer which is entered by user.
       Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
       Factors of 8  = 1, 2, 4, 8 ==> 4
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen çarpanlarını bulmak ıstedıgınız sayıyı gırınız");
        int sayı =Math.abs(scan.nextInt());//kullanıcı negatıf gırse de mutlak degerını al

        int i=1;
        int sayac=0;
        List<Integer> carpanListesi=new ArrayList<>();

        while (i<=sayı){
            if (sayı%i==0){
                carpanListesi.add(i);
                sayac++;
            }
            i++;
        }
        System.out.println();
        System.out.println("sayinin pozitif carpanlarinin sayisi :"  +sayac+"  tanedır ve şunlardır "+carpanListesi);
        System.out.println("sayinin negatif carpanlarinin sayisi :" + sayac);
        System.out.println("sayinin tum carpanlarinin sayisi :" + 2*sayac);





    }
}
