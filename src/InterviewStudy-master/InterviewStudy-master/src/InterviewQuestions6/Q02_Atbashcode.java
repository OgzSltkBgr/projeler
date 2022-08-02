import java.util.Scanner;

public class Q02_Atbashcode {
    /*
  AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
  Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
  "abcdefghijklmnopqrstuvwxyz"; 26 harf
  "zyxwvutsrqponmlkjihgfedcba";
 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("şifrelenecek ifadeyi giriniz");
        String ifade=scan.nextLine().toLowerCase();

        for (int i = 0; i <ifade.length() ; i++) {
            int indeks='z'-ifade.charAt(i);//tersten bakacagı için sondan çıkardık
            System.out.print((char)(('a')+indeks));
        }
        System.out.print("***2.yöntem***");
        String str1="abcdefghijklmnopqrstuvwxyz";
        String str2="zyxwvutsrqponmlkjihgfedcba";
        System.out.println("sifrelenecek ifadeyi giriniz");
        String str3=scan.nextLine().toLowerCase();
        for (int i = 0; i <str3.length() ; i++) {//str3 için indeks
            for (int j = 0; j <26 ; j++) {//str1 ve str2 için indeks
                if (str3.charAt(i)==str1.charAt(j)){
                    System.out.print(str2.charAt(j));
                }

            }
        }
    }
}
