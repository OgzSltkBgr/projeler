import java.util.Arrays;

public class Q06_MultiDimensolArray {
    public static void main(String[] args) {
        /*
    int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane eleman oldugunu return eden methodu yazdiriniz //cevap : 13 donsun
    */

        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        elemanSayısı(arr);
    }

    private static void elemanSayısı(int[][] arr) {

        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                sayac++;
            }
        }
        System.out.println("eleman sayısı-->"+sayac);
    }
}
