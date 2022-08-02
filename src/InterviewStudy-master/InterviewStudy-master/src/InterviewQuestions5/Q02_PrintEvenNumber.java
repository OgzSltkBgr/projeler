import java.util.Scanner;

public class Q02_PrintEvenNumber {
    public static void main(String[] args) {

        /*
        write a method named ısEven that accept an ınteger argument
        the method should return tru if the argument ıs even ,or false ortherwise
         */

        Scanner scan=new Scanner(System.in);
        int sayı=scan.nextInt();
        System.out.println(isEvenCift(sayı));
    }

    private static boolean isEvenCift(int sayı) {
        if (sayı%2==0){
            return true;
        } else return false ;

    }


}
