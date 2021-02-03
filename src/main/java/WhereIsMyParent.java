import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WhereIsMyParent {
    public static String findChildren(final String text) {
        char[] word=text.toCharArray();
        List<String> list = new ArrayList<>();

        for (int i = 0; i <word.length - 1 ; i++) {
            for (int j = 0; j <word.length - i -1 ; j++) {
                if (word[j] > word[j + 1]){
                    char temp = word[j];
                    word[j] = word[j + 1];
                    word[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < word.length ; i++) {
            list.add(String.valueOf(word[i]));
        }
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        String result = list.toString();
        result = result.replace(",", "");
        result = result.replaceAll(" ", "");
        result = result.replaceAll("]", "");
        result = result.substring(1);

        return result;
    }
}
