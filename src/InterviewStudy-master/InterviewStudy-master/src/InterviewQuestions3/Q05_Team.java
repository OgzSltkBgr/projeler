import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Q05_Team {
    public static void main(String[] args) {
        /*
         Part1:
         Create an arraylist of Strings
         add - "Red", "Green", "Blue", "Yellow" and "Black" inside
         print out all the elements, each element on new line
         -->Stringlrden oluşan bır arraylist tanımla.
         "Red", "Green", "Blue", "Yellow" ve "Black" elemanlarını ekle ve her ögeyı yenı satırda yazdır

         */

        //1.yöntem-->looplar ile
        ArrayList<String> colors=new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow","Black"));
        //colors.add()
        System.out.println("\n **foreach ile**\n");
        for (String w:colors
             ) {
            System.out.println(w);
        }

        System.out.println("\n **for loop ile**\n");
        for (int i = 0; i <colors.size() ; i++) {
            System.out.println(colors.get(i));
        }


        //2.yöntem--> Lambda ile
        System.out.println("\n **Lambda ile**\n");
        colors.stream().forEach(System.out::println);
        //colors.stream().forEach(t-> System.out.println(t));



       /* Part2:
         Create a method that accepts a String arraylist and a String as parameters
         method should add the element at the first index of arraylist
         -->Parametre olarak bir String arraylist ve bir String kabul eden bir method oluşturun.
         method, öğeyi arraylistin ilk indeksine eklemelidir.
        */
        System.out.println("\n-->ekleme yapılmadan önce\n"+colors);
        ilkIndexeEkle(colors,"white");


        System.out.print("\npart2-->ilk ındexe eklenınce\n"+colors);

       /* Part3:
         Create a method that accepts a String arraylist and a String as parameters
         it should add element before last element
         ex:  [1, 2, 3]  -> [1, 2, 4, 3]
         -->Parametre olarak bir String arraylist ve bir String kabul eden bir method oluşturun.
         method, öğeyi arraylistin son elemandan öncesine eklemelidir.
        */
        sonElemanOncesıneEkle(colors,"purple");


        System.out.println("\npart3-->son elemandan önceye eklenınce\n"+colors);






    }

    private static void sonElemanOncesıneEkle(ArrayList<String> colors, String str) {
        colors.add(colors.size()-1,str );
    }

    private static void ilkIndexeEkle(ArrayList<String> colors, String str) {
        colors.add(0,str);
    }


}
