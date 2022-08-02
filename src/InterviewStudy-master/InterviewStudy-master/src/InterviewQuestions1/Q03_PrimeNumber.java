import java.util.Scanner;

public class Q03_PrimeNumber {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı gırınız");
        int sayı=scan.nextInt();

        boolean sonuc=false;
        if (sayı>=2){
        for (int i = 2; i <sayı ; i++) {
            if (sayı%i==0){
                sonuc=true;
            }
        }
        if (sonuc==true ){
            System.out.println(sayı+" sayısı asal sayı değildir");
        } else {
            System.out.println(sayı+" sayısı asal bir sayıdır");
        }
    } else {
            System.out.println(sayı+ " sayısı asal sayı değildir");
        }
}}
