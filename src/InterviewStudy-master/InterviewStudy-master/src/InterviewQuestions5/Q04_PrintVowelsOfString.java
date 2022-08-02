import java.util.Scanner;

public class Q04_PrintVowelsOfString {
    public static void main(String[] args) {
        //Get String from user and print just vowels(aeiou) inside String on the console

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scanner.nextLine().toLowerCase();//soruda kucuk harf istemis o yuzden toLowerCase yaptik
        System.out.println("1.yol whıle loop ile \n");
        //1.yol:

        int index=0;
        while(index<str.length()){
            char c=str.charAt(index);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
                System.out.print(c);
            }
            index++;
        }
        System.out.println(" \n2.yol ile replace All methodu");
        //2.yol

        String s=str.replaceAll("[^aeiou]","");
        //[]: icerisindeki butun karakterlere islem yapar
        // ^ : yanindaki karakterlerin disindakileri alir
        System.out.println(s);
    }
}
