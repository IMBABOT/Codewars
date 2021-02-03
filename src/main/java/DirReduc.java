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

        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size() - 1; j++) {
                if (strings.get(j).equals(n) && strings.get(j + 1).equals(e) ||
                        strings.get(j).equals(e) && strings.get(j + 1).equals(n) ||
                        strings.get(j).equals(n) && strings.get(j + 1).equals(w) ||
                        strings.get(j).equals(w) && strings.get(j + 1).equals(n) ||
                        strings.get(j).equals(s) && strings.get(j + 1).equals(e) ||
                        strings.get(j).equals(e) && strings.get(j + 1).equals(s) ||
                        strings.get(j).equals(s) && strings.get(j + 1).equals(w) ||
                        strings.get(j).equals(w) && strings.get(j + 1).equals(s)) {

                        for (int h = 0; h < strings.size() - 1; h++) {
                            if (strings.get(h).equals(n) && strings.get(h + 1).equals(s)) {
                                strings.set(h, "");
                                strings.set(h + 1, "");
                            }
                            if (strings.get(h).equals(s) && strings.get(h + 1).equals(n)) {
                                strings.set(h, "");
                                strings.set(h + 1, "");
                            }
                            if (strings.get(h).equals(w) && strings.get(h + 1).equals(e)) {
                                strings.set(h, "");
                                strings.set(h + 1, "");
                            }
                            if (strings.get(h).equals(e) && strings.get(h + 1).equals(w)) {
                                strings.set(h, "");
                                strings.set(h + 1, "");
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
                }
            }

        String[] result = strings.toArray(new String[strings.size()]);
        return result;
    }
}





