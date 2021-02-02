import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DirReduc {

        public static String[] dirReduc(String[] arr) {
            String n = "NORTH";
            String s = "SOUTH";
            String e = "EAST";
            String w = "WEST";
            List<String> strings = new ArrayList<>(Arrays.asList(arr));
            int index = 0;

            if (index < arr.length - 1) {
                for (int i = 0; i < strings.size() - 1; i++) {
                    if (strings.get(i).equals(n) && strings.get(i + 1).equals(s)) {
                        strings.set(i, "");
                        strings.set(i + 1, "");
                    }
                    if (strings.get(i).equals(s) && strings.get(i + 1).equals(n)) {
                        strings.set(i, "");
                        strings.set(i + 1, "");
                    }
                    if (strings.get(i).equals(w) && strings.get(i + 1).equals(e)) {
                        strings.set(i, "");
                        strings.set(i + 1, "");
                    }
                    if (strings.get(i).equals(e) && strings.get(i + 1).equals(w)) {
                        strings.set(i, "");
                        strings.set(i + 1, "");
                    }
                }
                Iterator<String> iterator = strings.iterator();
                while (iterator.hasNext()) {
                    String o = iterator.next();
                    if (o.equals("")) {
                        iterator.remove();
                    }
                }


            }
            return new String[]{};
        }
    }


