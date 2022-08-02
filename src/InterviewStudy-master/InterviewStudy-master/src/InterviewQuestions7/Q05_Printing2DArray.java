import java.util.Arrays;

public class Q05_Printing2DArray {
    public static void main(String[] args) {

        // Print 2D String array using loops

        String [][] arr = {{"abc","def","ghi"}, {"jkl","mno","prs"}};

        for (int i = 0; i < arr.length ; i++) {//outer array
            for (int j = 0; j <arr[i].length ; j++) {//inner array
                System.out.print(arr[i][j] +" "); //sadece elemanları yazdırdık
            }
        }

        System.out.println(Arrays.deepToString(arr)); //deepToString methodu cok ıkı katlı arrayın tüm elemanlarını yazdırır.ARRAY OLARAK
    }
}
