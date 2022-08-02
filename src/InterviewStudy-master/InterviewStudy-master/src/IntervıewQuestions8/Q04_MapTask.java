import java.util.*;

public class Q04_MapTask {
    public static void main(String[] args) {

        // PART 1
        // create a map with groupName as key and groupMembers as value
        // "Group1" = ["Member1", "Member2"]
        // "Group2" = ["Member3", "Member4", "Member5"]


        // BÖLÜM 1
        // anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
        // "Grup1" = ["Üye1", "Üye2"]
        // "Grup2" = ["Üye3", "Üye4", "Üye5"]

        // PART 2
        // find how many members each group has

        // BÖLÜM 2
        // her grubun kaç üyesi olduğunu bul


        HashMap<String, ArrayList<String>> grupIsımVeUyeler= new HashMap<>();
        ArrayList<String> devTeam=new ArrayList<>(Arrays.asList("Abdullah", "Kutay", "Enes Faruk", "Yasin"));
        ArrayList<String> qaTeam =new ArrayList<>(Arrays.asList("Kadir", "Seher", "Gokhan", "Bahattin"));
        grupIsımVeUyeler.put("Development Team",devTeam);
        grupIsımVeUyeler.put("QA Team",qaTeam);
        System.out.println("grupisim ve uyeleri-->"+grupIsımVeUyeler);
        //grupisim ve uyeleri-->{QA Team=[Kadir, Seher, Gokhan, Bahattin], Development Team=[Abdullah, Kutay, Enes Faruk, Yasin]}

//Bölüm2---1.yol
        Collection<ArrayList<String>> values=grupIsımVeUyeler.values();

        for (ArrayList<String> kisi:values
             ) {
            System.out.println(kisi.size());//ikisi için de 4
        }

        //2.yol-->keylerden gıderek
        Set<String> keys=grupIsımVeUyeler.keySet();
        for (String  key:keys
             ) {
            ArrayList<String> grupLis=grupIsımVeUyeler.get(key);
            System.out.println("gruptakı uye sayısı :"+key+" "+grupLis.size());
            //gruptakı uye sayısı :QA Team 4
            //gruptakı uye sayısı :Development Team 4

        }











    }
}
