import java.util.Scanner;

public class Q05_ExponentialNumber {
    public static void main(String[] args) {
        //Get 2 numbers from the user.
//first number base
//second number Top
//Write a code that calculates the prime of a number.
// 2, 3 --> 2^3 = 2*2*2= 8

// 4, 3 --> 4^3= 4*4*4 = 64

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen taban ve üs gırınız");
        int taban=scan.nextInt();
        int üs=scan.nextInt();
        int sonuc=1;
        while (üs!=0){
            sonuc*=taban;
            üs--;
        }
        System.out.println("whıle ıle sonuc :"+sonuc);

        for (int i = 1; i <=üs ; i++) {
            sonuc*=taban;
        }
        System.out.println("for ile sonuç :"+sonuc);
    }
}
