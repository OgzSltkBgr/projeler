public class Q02_Palindrome {
    public static void main(String[] args) {

         /*
        Crteate a program checks if a String is PALINDROME or not.
        If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
        For Example : "madam" or "nursesrun" .
        Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adanada pide ye,  Traş niçin şart
         */

        String input="traş niçin şart";

        palindrome(input);
    }

    private static void palindrome(String input) {
        String tersInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            tersInput+=input.charAt(i);
        }
        if (tersInput.equalsIgnoreCase(input)){
            System.out.println("ifade palindrome 'dur");
        } else{
            System.out.println("ifade palindrome değildir");
        }
    }
    private static void palindomeWithStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        String tersStr = sb.reverse().toString();
        if(tersStr.equalsIgnoreCase(str)){
            System.out.println("girilen ifade palindomdur -> " + tersStr);
        }else System.out.println("girilen ifade palindrom degildir ->" +tersStr);
    }


}
