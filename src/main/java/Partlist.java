import java.util.Arrays;

public class Partlist {

    public static String[][] partlist(String[] arr) {
        String[][] array = new String[arr.length][arr.length];
        int times = 0;

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                array[0][0] = arr[0];
                array[0][1] = arr[1];
                }
            }


        System.out.println(Arrays.deepToString(array));


    return array;
    }
}
