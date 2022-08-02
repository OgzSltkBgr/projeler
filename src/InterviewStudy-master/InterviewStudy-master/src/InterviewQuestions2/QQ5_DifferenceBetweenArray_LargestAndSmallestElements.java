import java.util.Arrays;
import java.util.Scanner;

public class QQ5_DifferenceBetweenArray_LargestAndSmallestElements {
    public static void main(String[] args) {
         /*
Create a function that takes an array and the difference between the largest
and the smallest numbers.
Ask user to enter array elements.
   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/

        arrayOlustur();
    }

    private static void arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Array uzunluğunu gırınız :");
        int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("arrayin "+(i+1)+". elemanını giriniz :");
            arr[i]= scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[uzunluk-1] + " - "+arr[0]);

    }
}
