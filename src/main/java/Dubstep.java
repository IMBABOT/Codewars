import java.util.Arrays;

public class Dubstep {

    public static String SongDecoder (String song) {
        String temp = song.replaceAll("WUB", "1");
        String[] arr = temp.split("1");
        StringBuilder sb = new StringBuilder();
        String s = "";

        for (int i = 0; i < arr.length ; i++) {
            if (!arr[i].equals(" ")){
                sb.append(arr[i] + " ");
            }
        }

        s = sb.toString();
        s = s.trim().replaceAll(" +", " ");


        return s;
    }
}
