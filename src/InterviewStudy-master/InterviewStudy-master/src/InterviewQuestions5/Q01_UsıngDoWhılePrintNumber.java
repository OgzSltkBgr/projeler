import java.util.Scanner;

public class Q01_UsıngDoWhılePrintNumber {
    public static void main(String[] args) {

        /*
        create one int
        do whıle int is less then 100
        print the number
        increment by 5
        for example :0  5  10  15  20
         */
        Scanner scan=new Scanner(System.in);

        int sayı=scan.nextInt();
        do {
            System.out.print(sayı+" ");
            sayı+=5;
        }while (sayı<100);
    }
}
