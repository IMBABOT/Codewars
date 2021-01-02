import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareDigit {

    public static int squareDigits(int n) {
        String temp = Integer.toString(n);
        int[] array = new int[temp.length()];
        List<Integer> list = new ArrayList<>();
        String result = "";


        for (int i = 0; i < array.length ; i++) {
            array[i] = temp.charAt(i) - '0';
        }

        for (int i = 0; i < array.length ; i++) {
            list.add(square(array[i]));
        }

        for (Integer i : list){
            result += String.valueOf(i);
        }


       return Integer.valueOf(result);
    }

    public static int square(int n){
        for (int i = 0; i < 1; i++) {
            n *= n;
        }

        return n;
    }
}
