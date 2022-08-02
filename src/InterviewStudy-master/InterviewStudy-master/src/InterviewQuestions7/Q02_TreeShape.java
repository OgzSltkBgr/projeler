import java.util.Scanner;

public class Q02_TreeShape {
    public static void main(String[] args) {
        // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken
    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen çizilecek ağaç için tac sayısını gırınız");
        int tacSayısı=scan.nextInt();

        int govdeUzunlugu=5;

        for (int i = 0; i <tacSayısı ; i++) {//satırı ifade eder
            for (int j = 0; j <i+1 ; j++) {//sütunu ifade eder
                System.out.print("^");
            }
            System.out.println("");//her satır sonrası alta gecsın dıye
        }

        for (int i = 0; i <govdeUzunlugu ; i++) {
            System.out.println("|||");
        }

        //2.yol daha kısa hali ile.hocanın çözdüğü

        String yaz="";//bu degiskeni tanimladik , for loop icinde kullanmak icin

        for (int i = 0; i <tacSayısı ; i++) {//satırı ifade eder
            yaz+="^";    //bu kullanım nested fora ıhtıyac bırakmadan yazdırmayı sağlar
            System.out.println(yaz);
        }
        for (int i = 0; i <govdeUzunlugu ; i++) {
            System.out.println("|||");
        }
    }
}
