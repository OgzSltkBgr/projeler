import java.util.ArrayList;

public class Q02_CreateRandomList_SetList {
    public static void main(String[] args) {
        // int array list oluşturun 10 elemandan oluşmalı
// random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemanının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.

        ArrayList<Integer> liste=new ArrayList<>();
        randomEkle(liste);

    }

    public static void randomEkle(ArrayList<Integer> liste) {
        for (int i = 0; i <10 ; i++) {
            liste.add((int)(Math.random()*20));

        }
        System.out.println("Random liste : "+liste);

        int sayac=0;
        for (int i = 0; i <liste.size() ; i++) {//random oluşturulan elemanların listesine bakıyoruz
            if (liste.get(i)%2==0){//çift sayı varsa
                liste.set(i,111);
                sayac++;
            }
        }
        System.out.println("111 yazdırdıktan sonrakı hali :"+liste);

        if (sayac==0){
            System.out.println("bu lıstede çift sayı yoktur");
        }
        System.out.println("listenin son hali :"+liste);
    }
}
