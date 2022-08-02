public class Q01_UseContinue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

        String str="Java Cok Guzel";

        for (int i = 0; i <str.length() ; i++) {
            boolean sonuc=false;
            if (str.charAt(i)=='a' || str.charAt(i)==' '){ //ifade a veya boşluk içerirse
                sonuc=true;
            }
            if (sonuc==false){
                System.out.println(str.charAt(i));
            }
        }

        //2. yol continue kullanarak

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='a' || str.charAt(i)==' '){
                continue; // bu satir calistiginda dongunun basina gider,
                // cunku a veya bosluk var iken herhangi bir ciktisini istemiyor
                // break aklilniza gelebilir.. ancak break kodu tamamen kirar ve devam etmez..
            }
            System.out.println(str.charAt(i));
        }
    }
}
