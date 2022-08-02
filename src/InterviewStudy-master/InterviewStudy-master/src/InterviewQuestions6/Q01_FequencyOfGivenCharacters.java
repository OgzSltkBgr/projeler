public class Q01_FequencyOfGivenCharacters {
    public static void main(String[] args) {
        /*
  Interview sorusu...
  Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

  Test data:
  Input =
  output = A3B2C1D2
          */

        String str = "AAABBCDD";
        frekans(str);
    }

    private static void frekans(String str) {

        String output = "";

        for (int i = 0; i < str.length(); i++) {//kıyas edılen harf
            int sayac = 0;
            for (int j = i; j < str.length(); j++) {//kıyas eden harf,bu nedenle i den baslamak gerek
                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {
                    sayac++;
                }
            }
            if (!output.contains(str.substring(i, i + 1))) {//eger kıyas edılen harf outputta yoksa
                output += str.substring(i, i + 1) + sayac;
            }


        }
        System.out.println("output = " + output);
    }
}
