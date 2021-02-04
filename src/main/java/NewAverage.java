import java.util.Arrays;

public class NewAverage {

    public static long newAvg(double[] arr, double navg) {
        long result = 0;
        double avr = 0;
        double dot = 0;



        for (int i = 0; i < arr.length; i++) {
            avr += arr[i];
        }

        dot = (avr % 1);



        System.out.println(avr);
        System.out.println(avr);



        System.out.println(dot);
        System.out.println(dot);


        if (dot == 0) {

            result = (long) (navg * (arr.length + 1) - avr);

            if (result <= 0) {
                throw new IllegalArgumentException();
            }
        }

        if (dot > 0){

            result = (long) (navg * (arr.length + 1) - (avr - 1));

            if (result <= 0) {
                throw new IllegalArgumentException();
            }

        }

        System.out.println(result);
        System.out.println(result);
        System.out.println(result);
        System.out.println(result);
        System.out.println(result);


        return result;

    }
}