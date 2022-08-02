import java.util.ArrayList;
import java.util.Arrays;

public class Q05_ArrayListTask {
    public static void main(String[] args) {
        // Part1:
        // Create an arraylist of Strings
        // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
        // print out all the elements, each element on new line

        // Part2:
        // Create a method that accepts a String arraylist and a String as parameters
        // method should add the element at the first index of arraylist

        // Part3:
        // Create a method that accepts a String arraylist and a String as parameters
        // it should add element before last element
        // ex:  [1, 2, 3]  -> [1, 2, 4, 3]

        ArrayList<String> renkler=new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow","Black"));
        //part1--->

        for (String w:renkler
             ) {
            System.out.println(w);
        }

        //part2--->
        ilkIndekseEkle(renkler,"beyaz");

        sonIndekstenOnceEkle(renkler,"mavi");
        System.out.println(renkler.size());
    }

    private static void sonIndekstenOnceEkle(ArrayList<String> renkler,String renk) {
        renkler.add(renkler.size()-1,renk);
    }


    private static void ilkIndekseEkle(ArrayList<String> renkler,String renk) {
        renkler.add(0,renk);
    }

}
