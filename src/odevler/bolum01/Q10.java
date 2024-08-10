package odevler.bolum01;

public class Q10 {

    public static void main(String[] args){


        double min=45;
        double sec=30;
        double km=14;
        double mil = 0;

        mil=km/1.6;


        double totalTime = min / 60.0 + sec / 3600.0;

        double mph= mil/totalTime;

        System.out.println(mph);
    }
}
