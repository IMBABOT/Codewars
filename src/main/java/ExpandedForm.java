import java.util.Arrays;

public class ExpandedForm {
    public static String expandedForm(int num) {
        String temp = Integer.toString(num);
        int[] arr = new int[temp.length()];
        StringBuilder sb = new StringBuilder();
        int enter = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp.charAt(i) - '0';
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                enter++;
            }
        }

        int result = enter;
        System.out.println(enter);

        int times = 0;
        int i = 0;
        while (enter > 0) {
            if (times == result){
                break;
            }
            if (arr[j] != 0) {
                sb.append(arr[j]);
                times++;
                i = j;
                while (j < arr.length - 1){
                    sb.append(0);
                    j++;
                }
                sb.append(" " + "+ ");
                if (times == 1) {
                    enter--;
                    j = 0;
                    j++;
                }else if (times > 1){
                    j = i + 1;

            }else if (arr[j] == 0){
                j++;
            }
        }

        String res = sb.toString();
        return res.substring(0, res.length() - 3);

    }
}
