import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrillIt {

    public static String grille(String message, int code) {
        String result = "";
        String temp = "";
        int size = message.length();

        while (code > 0){
            if (code % 2 == 0){
                result += "0";
            }else  if (code % 2 != 0){
                result += "1";
            }

            code = code / 2;
        }
        temp = new StringBuilder(result).reverse().toString();

        List<String> list = new ArrayList<>();

        for (int i = 0; i <temp.length() ; i++) {
            list.add(String.valueOf(temp.charAt(i)));
        }

        int amount = size - list.size();

        for (int i = 0; i < amount ; i++) {
            list.add(i, "0");
        }

        System.out.println(list);


        return "";
    }

}
