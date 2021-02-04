import java.util.Arrays;

public class NewAverage {

    public static long newAvg(double[] arr, double navg) {
        double result = 0;
        double avr = 0;
        double dot = 0;
        double dot1 = 0;
        long res = 0;

        for (int i = 0; i < arr.length; i++) {
            avr += arr[i];
        }



        dot = (navg % 1);
        dot1 = (avr % 1);


        if (dot > 0 || dot1 > 0){
            result = (long) (navg * (arr.length + 1) - (avr));

            res = (long) result;
            res = res + 1;

            System.out.println(avr);
            System.out.println(avr);

            System.out.println(dot);
            System.out.println(dot);

            if (result <= 0) {
                throw new IllegalArgumentException();
            }
            System.out.println(result);
        }

        if (dot == 0 && dot1 == 0) {
            result = (long) (navg * (arr.length + 1) - (avr));

            res = (long) result;

            System.out.println(avr);
            System.out.println(avr);


            System.out.println(dot);
            System.out.println(dot);


            if (result <= 0) {
                throw new IllegalArgumentException();
            }

            System.out.println(result);
        }
        return res;
    }
}