import java.util.Scanner;

public class Q06_CountsOfRepeatingElement {
    public static void main(String[] args) {
           /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
     */

        int arr[]={1,1,1,2,3,2,4,5,4,5,6,5,4,3,8};
        Scanner scan=new Scanner(System.in);
        System.out.println("tekrarını sorgulamak ıstedıgınız sayıyı gırınız");
        int sayı= scan.nextInt();
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (sayı==arr[i]){
                sayac++;
            }
        }
        System.out.println("aranılan sayı :"+sayı+"\n"
                +"tekrar sayısı da "+sayac +"kadardır");

    }
}
