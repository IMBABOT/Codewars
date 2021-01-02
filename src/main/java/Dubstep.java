import java.util.*;

public class Dubstep {
    public static String SongDecoder(String song) {
        String temp = song.replace("WUB", "1");
        String[] arr = temp.split("");
        StringBuilder sb = new StringBuilder();
        String first = "";
        String second = "";
        HashMap<Integer, String> map = new HashMap<>();
        if (!arr[0].equals("1")) {
            first = arr[0];
        }
        if (!arr[arr.length - 1].equals("1")) {
            second = arr[arr.length - 1];
        }

        for (int i = 1; i < arr.length - 1; i++) {
            map.put(i, arr[i]);
        }

        if (!first.equals("")) {
            sb.append(first);
        }
        String s = "";
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (!entry.getValue().equals("1") && entry.getKey() != 2) {
                sb.append("" + entry.getValue());
            } else if (!entry.getValue().equals("1")) {
                sb.append(entry.getValue());
            }
            if (entry.getKey().equals("1") && entry.getValue().equals("1")){
                System.out.println(1);
            }
        }

        System.out.println(s);

        return "s";
    }
}

