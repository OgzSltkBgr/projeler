public class Urunler {
    private String urunIsmi;
    private String uretici;
    private String birimi;
    private double miktar;
    private String rafNo;


    public Urunler() {//parametresız cons
    }

    public Urunler(String urunIsmi, String uretici, String birimi, double miktar, String rafNo) {//urun bılgılerını tasıyacak
        this.urunIsmi = urunIsmi;                                                                        //parametreli constractor
        this.uretici = uretici;
        this.birimi = birimi;
        this.miktar = miktar;
        this.rafNo = rafNo;

    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getBirimi() {
        return birimi;
    }

    public void setBirimi(String birimi) {
        this.birimi = birimi;
    }

    public double getMiktar() {
        return miktar;
    }

    public void setMiktar(double miktar) {
        this.miktar = miktar;
    }

    public String getRafNo() {
        return rafNo;
    }

    public void setRafNo(String rafNo) {
        this.rafNo = rafNo;
    }

    @Override
    public String toString() {
        return "ÜrunIsmi='" + urunIsmi + '\'' +
                ", Üretici='" + uretici + '\'' +
                ", Birimi='" + birimi + '\'' +
                ", Miktar=" + miktar +
                ", RafNo='" + rafNo + '\''
                ;
    }
}
