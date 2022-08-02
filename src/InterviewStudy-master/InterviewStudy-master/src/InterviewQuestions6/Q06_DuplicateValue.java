import java.util.ArrayList;
import java.util.Arrays;

public class Q06_DuplicateValue {
    public static void main(String[] args) {
        /* Write a code that returns the duplicate chars in a String array.(interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]*/

        String str="Javaisalsoeasy";
        char[] arr=str.toCharArray();
        System.out.print("Arrays.toString(arr) -->"+ Arrays.toString(arr));

        ArrayList<Character> output=new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {//arrayın her bır elemanına bakar
            for (int j = 0; j <arr.length ; j++) {//her bır elemana bakarken bır sonrakı ıle karsılaştırıyor
                if (arr[i]==arr[j] && !output.contains(arr[j])){
                    System.out.print(arr[j]);
                    output.add(arr[j]);
                }

            }
        }
        System.out.println("output = " + output);
    }
}
