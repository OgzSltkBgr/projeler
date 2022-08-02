public class Q04_SurviveMonkey {
     /*
There is a lonely monkey in the island
He needs to eat 4 bananas every day
there are just 165 bananas in that island
Create following variables and find how many days
monkey can survive.
Use do while loop, increment and decrement and if statements
int numberOfBananas =165, survivalDays = 1;
boolean monkeyAlive = true;
*/
     public static void main(String[] args) {
         int numberOfBananas=165;
         int survivalDays=1;
         boolean monkeyLive=true;
         do {
             System.out.println("maymunlar günde 4 muz yer ");
             numberOfBananas-=4;//toplam muz sayısından her seferınde 4 muz eksılır
             survivalDays++;//yasadığı gun sayısını 1 arttır
             if (numberOfBananas<4){
                 monkeyLive=false;
                 System.out.println("bugun "+survivalDays+" gun.Muz kalmadı.maymun sizlere ömür");
             }
         }while (monkeyLive);
     }
}
