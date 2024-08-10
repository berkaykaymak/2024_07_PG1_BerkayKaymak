package odevler.bolum01;

public class Q12 {

    public static void main(String[] args){

       /* Bir koşucunun 24 mili 1 saat, 40 dakika, 35 saniyede koştuğunu varsayalım.
                Ortalama hızı km/saat cinsinden gösterecek bir program yazınız. ( 1 mil, 1.6 kilometredir.)  */


        double mil=24;
        double km;
        double min=40;
        double sec=35;

        km=1.6*mil;

        double totalTime= 1.0+(min/60.0)+(sec/3600.0);

        double kmh= km/totalTime;
        System.out.println(kmh);

    }
}
