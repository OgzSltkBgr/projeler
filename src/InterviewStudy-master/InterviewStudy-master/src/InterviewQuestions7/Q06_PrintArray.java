public class Q06_PrintArray {
    public static void main(String[] args) {
        // Create a method which takes String array as a parameter
        // and prints all the element

        String [] arabalar = {"Honda", "Toyota", "Porsche", "Tesla", "BMW"};
        printElements(arabalar);

        String [] renkler = {"Mavi", "Kirmizi", "Mor", "Kahverengi", "Sari","Turuncu", "Yesil"};
        printElements(renkler);

    }

    private static void printElements(String[] arabalar) {
        for (int i = 0; i <arabalar.length ; i++) {
            System.out.print(arabalar[i]+" "); //elemanları yazdırdık
        }
        System.out.println("");
    }
}
