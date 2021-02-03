import java.util.*;

public class GrillIt {

    public static String grille(String message, int code) {
        String result1 = "";
        if (message.length() > 0) {
            String result = "";
            String temp = "";
            int size = message.length();

            while (code > 0) {
                if (code % 2 == 0) {
                    result += "0";
                } else if (code % 2 != 0) {
                    result += "1";
                }

                code = code / 2;
            }
            temp = new StringBuilder(result).reverse().toString();

            List<String> first = new ArrayList<>();
            List<String> second = new ArrayList<>();
            List<String> res = new ArrayList<>();


            for (int i = 0; i < message.length(); i++) {
                second.add(String.valueOf(message.charAt(i)));
            }


            for (int i = 0; i < temp.length(); i++) {
                first.add(String.valueOf(temp.charAt(i)));
            }

            int amount = size - first.size();

            for (int i = 0; i < amount; i++) {
                first.add(i, "0");
            }

            int index = first.size() - 1;
            int ind = second.size() - 1;
            while (index >= 0) {
                if (first.get(index).equals("0")) {
                    if (ind < 0){
                        break;
                    }
                    res.add("null");
                    ind--;
                } else if (first.get(index).equals("1")) {
                    if (ind < 0){
                        break;
                    }
                    res.add(second.get(ind));
                    ind--;
                }
                index--;
            }



            Iterator<String> iterator = res.iterator();
            while (iterator.hasNext()) {
                String o = iterator.next();
                if (o.equals("null")) {
                    iterator.remove();
                }
            }

            result1 = res.toString();
            result1 = result1.replaceAll(",", "");
            result1 = result1.replaceAll(" ", "");
            result1 = result1.replaceAll("]", "");
            result1 = result1.substring(1);

            StringBuilder sb = new StringBuilder();
            sb.append(result1);
            sb.reverse();
            result1 = sb.toString();

        }
        if (message.length() == 0){
            result1 = "";
        }

        return result1;

    }
}
