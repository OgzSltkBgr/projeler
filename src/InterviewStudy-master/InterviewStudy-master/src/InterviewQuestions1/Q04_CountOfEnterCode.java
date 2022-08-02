import java.util.Scanner;

public class Q04_CountOfEnterCode {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        String pin ="said.12345";
        int girisHakki = 4;
        while (true){
            System.out.println("ltfen pin kodunuzu gırınız");
            String pin1= scan.next();
            if (pin.equals(pin1)){
                System.out.println("başarılı giriş");
                break;
            } else {
                System.out.println("hatalı giriş");
                girisHakki--;
                System.out.println("kalan giriş hakkınız :"+girisHakki);
            }
            if (girisHakki==0){
                System.out.println("Giriş hakkınız kalmadı sım kartınız bloke oldu ");
                break;
            }
        }
    }
}
