import java.util.Arrays;

public class DirReduc {

    public static String[] dirReduc(String[] arr) {
        String n = "NORTH";
        String s = "SOUTH";
        String e = "EAST";
        String w = "WEST";
        int index = 0;
        do {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].equals(n) && arr[i + 1].equals(s)) {
                    arr[i] = "";
                    arr[i + 1] = "";
                }
                if (arr[i].equals(s) && arr[i + 1].equals(n)) {
                    arr[i] = "";
                    arr[i + 1] = "";
                }
                if (arr[i].equals(w) && arr[i + 1].equals(e)) {
                    arr[i] = "";
                    arr[i + 1] = "";
                }
                if (arr[i].equals(e) && arr[i + 1].equals(w)) {
                    arr[i] = "";
                    arr[i + 1] = "";
                }
                index++;
            }
        }    while (arr[index].equals(n) && arr[index + 1].equals(w) ||
                arr[index].equals(w) && arr[index + 1].equals(n) ||
                arr[index].equals(n) && arr[index + 1].equals(e) ||
                arr[index].equals(e) && arr[index + 1].equals(n) ||
                arr[index].equals(s) && arr[index + 1].equals(e) ||
                arr[index].equals(e) && arr[index + 1].equals(s) ||
                arr[index].equals(s) && arr[index + 1].equals(w) ||
                arr[index].equals(w) && arr[index + 1].equals(s)) ;

        return new String[]{};
    }
}

