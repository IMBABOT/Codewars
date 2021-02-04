import java.util.Arrays;

public class NewAverage {

    public static long newAvg(double[] arr, double navg) {
        long result = 0;
        double sum = 0;


        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        result = (long)Math.ceil((navg * (arr.length + 1) - (sum)));

        if (result <= 0) {
            throw new IllegalArgumentException();
        }

        return result;
    }
}