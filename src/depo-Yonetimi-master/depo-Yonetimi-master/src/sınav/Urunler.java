import java.util.ArrayList;
import java.util.Arrays;

public class Urunler {
  private   String urunIsmi;
  private  int mıktar;
  private   int urunFiyatı;

    public Urunler() {
    }

    public Urunler(String urunIsmi,int mıktar, int urunFiyatı) {
        this.urunIsmi = urunIsmi;
        this.urunFiyatı = urunFiyatı;
        this.mıktar=mıktar;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public int getUrunFiyatı() {
        return urunFiyatı;
    }

    public void setUrunFiyatı(int urunFiyatı) {
        this.urunFiyatı = urunFiyatı;
    }

    @Override
    public String toString() {
        return "urunIsmi='" + urunIsmi + '\'' +
                ", mıktar=" + mıktar +
                ", urunFiyatı=" + urunFiyatı;
    }
}
