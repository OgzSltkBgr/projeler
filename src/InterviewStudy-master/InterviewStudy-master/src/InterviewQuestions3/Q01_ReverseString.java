public class Q01_ReverseString {
    public static void main(String[] args) {
          /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */
//1.yol
        StringBuilder str = new StringBuilder("edip pide ye ");
        System.out.println("reverse öncesi str= " + str);
        str.append(" ye edip ye");//bu method str a ekleme yapar.String buılder de vardır
        str.reverse();//str tersten yazdıran method
        System.out.println("reverse sonrası str =" + str);
//2.yol
        String str1 = "Java güzel";

        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.print(str1.charAt(i));

        }
        //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
        String input="Java guzeldır";
        System.out.print("3.yol :");
        inputTersArray(input);

    }
    private static void inputTersArray(String input) {
        char [] arr = input.toCharArray(); //String bir veriyi karakterlere char tipinde ayirir..

        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(arr[i]);

        }

    }//method sonu


    }

