import java.util.Arrays;
import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir string gırınız");
        String str=scan.next();
        System.out.println("bir sayı gırınız");
        int sayı=scan.nextInt();

        ilkSonharf(str,sayı);

    }

    private static void ilkSonharf(String str,int sayı) {
        String arr[]=str.trim().split("");

        for (int i = 1; i <=sayı; i++) {
            System.out.print(arr[0]+arr[arr.length-1] );
        }
    }
}
