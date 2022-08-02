import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class Q03_OddIndexNumber {
    //indeksi tek sayı olan karakterleri yazdıran bır code create edınız
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str= scan.nextLine();

        int indeks=0;
        do {
            if (indeks%2==0){//indeksi tek sayı olan
                System.out.print(str.charAt(indeks)+" ");
            }
            indeks++;
        }while (indeks<str.length());
    }
}
