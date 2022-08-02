import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q03_CollectionsMethodsTask {
    public static void main(String[] args) {
        // part 1: create list of 5 numbers from user input
        // sort the list in reverse order and print it
        // shuffle the list and print it
        // rotate right by 3 places and print it

        // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
        // listeyi ters sırada sırala ve yazdır
        // listeyi karıştır ve yazdır
        // 3 yer sağa döndür ve yazdır

        // part 2: find the max number and min number, print them
        // replace all max number with min number

        // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
        // tüm maksimum sayıları minimum sayı ile değiştir

        Scanner scan=new Scanner(System.in);
        List<Integer> sayılar=new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            System.out.println("sayı giriniz");
            sayılar.add(scan.nextInt());
        }
        Collections.sort(sayılar,Collections.reverseOrder());//reverseOrder methodu ters sıralama yapar.
                                                             //sort sıralar.
        System.out.println("ters sıraladıktan sonra sayılar:"+sayılar);

        Collections.shuffle(sayılar);
        System.out.println("shuffle yapıldıktan sonra sayılar :"+sayılar);

        Collections.rotate(sayılar,3);//belirtilen listedeki ogeleri kaydirir distance hangi no ise ordan baslar
        System.out.println("rotate edıldıkten sonra sayılar -->"+sayılar);

        Integer  max=Collections.max(sayılar);
        Integer  min=Collections.min(sayılar);
        System.out.println("max :"+max);
        System.out.println("min :"+min);

        Collections.replaceAll(sayılar,max,min);
        System.out.println("replacealldan sonra :"+sayılar);


    }
}
