import java.util.ArrayList;
import java.util.Arrays;

public class Q02_2D_CollectionsTask {
    public static void main(String[] args) {
        // Create 2D ArrayList which can store String ArrayLists
        // Create 3 ArrayLists which are Employees, Employers, Companies
        // Store this 3 ArrayList in 2D ArrayList

        // String ArrayList'leri depolayabilen 2D ArrayList oluşturun
        // Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
        // Bu 3 ArrayList'i 2D ArrayList'te saklayın

        ArrayList<ArrayList<String>> ıkıBoyutluArrayLıst=new ArrayList<>();
        ArrayList<String> calısanlar=new ArrayList<>(Arrays.asList("ahmet,","elif","gülşen"));
        ArrayList<String> ısVerenler=new ArrayList<>(Arrays.asList("eti","ulker","bifa"));
        ArrayList<String> sırketler=new ArrayList<>(Arrays.asList("amazon","google","trendyol","getir"));
        ıkıBoyutluArrayLıst.add(calısanlar);
        ıkıBoyutluArrayLıst.add(ısVerenler);
        ıkıBoyutluArrayLıst.add(sırketler);
        System.out.println("2D arrayListim-->"+ıkıBoyutluArrayLıst);

    }
}
