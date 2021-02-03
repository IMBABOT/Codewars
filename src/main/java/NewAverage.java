import java.util.Arrays;

public class NewAverage {

    public static long newAvg(double[] arr, double navg) {
        long result = 0;
        double avr = 0;

        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println();
        System.out.println(navg);

        for (int i = 0; i < arr.length; i++) {
            avr += arr[i];
        }

        long temp = Long.valueOf((long) avr);
        result = (long) (navg * (arr.length + 1) - temp);

        if (result <= 0){
            throw new IllegalArgumentException();
        }


        return result;

    }
}
