import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q01_SetTask {
    public static void main(String[] args) {
        //  PART 1
        // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
        // and add all elements from ArrayList to Set

        // ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
        // ve tüm öğeleri ArrayList'ten Set'e ekleyin

        // PART 2
        // create a method that takes Set<Character> and varargs of char as parameters
        // and adds all chars to the set

        // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
        // ve tüm karakterleri sete ekleyin

        //1. bölüm
        ArrayList<Integer> arrList=new ArrayList<>(Arrays.asList(2,4,5,6,3,3,7,9,0));
        System.out.println("arrlist-->"+arrList);
        Set<Integer> setList=new HashSet<>();
        setList=seteDonustur(arrList,setList);
        System.out.println("setlist-->"+setList);

        //2.bölüm
        Set<Character> setChar=new HashSet<>();
        char harf1='a';
        char harf2='b';
        char harf3='d';
        char harf4='c';
        char harf5='e';
        seteKarakterEkle(setChar,harf1,harf2,harf5,harf3,harf4);



    }

    private static void seteKarakterEkle(Set<Character> setChar, char... harf) {
        for (char w:harf
             ) {
            setChar.add(w);
        }
        System.out.println("setchar-->"+setChar);
    }

    private static Set<Integer> seteDonustur(ArrayList<Integer> arrList,Set<Integer> setList) {

        setList.addAll(arrList);
        return  setList;
    }
}
