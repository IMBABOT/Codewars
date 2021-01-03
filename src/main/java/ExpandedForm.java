import java.util.Arrays;

public class ExpandedForm {


    public static String expandedForm(int num) {
        String temp = Integer.toString(num);
        int[] arr = new int[temp.length()];
        StringBuilder sb = new StringBuilder();

        int counter = 1;
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp.charAt(i) - '0';
        }

        sb.append(arr[0]);
        int length = arr.length - 1;

        while (length > 0){
            sb.append("0");
            length--;
        }

        sb.append(" " + "+" + " ");


        while (j < arr.length -1) {
            while (arr[counter] == 0) {
                counter++;
                if (arr[counter] != 0) {
                    sb.append(arr[counter]);
                }
            }
            int[] array = new int[arr.length - counter];
            System.arraycopy(arr, counter, array, 0, arr.length-counter);
            arr = array;
            System.out.println(Arrays.toString(arr));
            temp(array);


            while (counter > 0) {
                sb.append("0");
                counter--;
            }
            j++;

        }

        System.out.println(sb);

        return "1";
    }

    private static StringBuilder temp(int[] arr){
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        while (arr[counter] == 0) {
            counter++;
            if (arr[counter] != 0) {
                sb.append(arr[counter]);
            }
        }

        System.out.println(sb);


        return sb;
    }
}

