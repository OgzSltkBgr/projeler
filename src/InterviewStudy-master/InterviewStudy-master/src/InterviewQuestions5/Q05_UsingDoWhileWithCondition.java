import java.util.Scanner;

public class Q05_UsingDoWhileWithCondition {
    public static void main(String[] args) {
        /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"
    */

        Scanner scan=new Scanner(System.in);
        int sayı=0;
        do {
            System.out.println("bir sayı gırınız");
           sayı=scan.nextInt();
           if (sayı<100){
               System.out.println("Won!");
           }
        }while (sayı<100);
        System.out.println("Lost!");

    }
}
