import java.util.*;

public class EnoughIsEnough {


    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        int index = 0;
        int occurrences = 0;
        List<Integer> element = new ArrayList<>();
        List<Integer> occurrence = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i <elements.length ; i++) {
            if (!map.containsKey(elements[i])){
                map.put(elements[i], 1);
            }else if (map.containsKey(elements[i])){
                map.put(elements[i], map.get(elements[i]) + 1);
            }
        }
            int count = 0;
            int value = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()){
            if (m.getValue() > maxOccurrences){
                count++;
                value = m.getValue();
            }
        }



        while (index <= elements.length - 1) {
            for (int i = 0; i < elements.length; i++) {
                if (elements[index] == elements[i]) {
                    occurrences++;
                }
            }
            element.add(elements[index]);
            occurrence.add(index, occurrences);
            index++;
            occurrences = 0;
        }
            if (count == 1) {
                int first = 0;
                while (count > 0) {
                    if (first > element.size() - 3) {
                        break;
                    }
                    int elem = element.get(first);
                    int delete = occurrence.get(first) - maxOccurrences;
                    int ind = element.size() - 1;
                    while (ind >= 0) {
                        if (element.get(ind) == elem) {
                            while (delete > 0) {
                                element.remove(ind);
                                delete--;
                                break;
                            }
                        }
                        ind--;
                    }
                    if (delete < 0) {
                        first++;
                        count++;
                    } else {
                        first++;
                        count--;
                    }
                }
            }

            if (count > 1){
                int first = 0;
                while (count > 0) {
                    if (first > element.size()) {
                        break;
                    }
                    int elem = element.get(first);
                    int delete = occurrence.get(first) - maxOccurrences;
                    int ind = element.size() - 1;
                    while (ind >= 0) {
                        if (element.get(ind) == elem) {
                            while (delete > 0) {
                                element.remove(ind);
                                delete--;
                                break;
                            }
                        }
                        ind--;
                    }

                        first++;
                        count--;
                }
            }



            int[] result = new int[element.size()];

        for (int i = 0; i <element.size() ; i++) {
            result[i] = element.get(i);
        }
        System.out.println(Arrays.toString(result));

        return result;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{  12, 13, 79, 76, 71, 46, 14, 85, 21, 19, 42, 74, 3, 1, 23, 22, 60, 47, 85, 46, 10, 9, 56, 56, 2, 63, 58, 23, 4, 30, 51, 33, 14, 17, 64, 10, 8, 18, 88, 65, 62, 52, 3, 30, 62, 34, 13, 40, 77, 2, 69, 43, 41, 89, 38, 84, 17, 25, 76, 47, 60, 33, 41, 25, 19, 84, 87, 63, 50, 48, 36, 59, 38, 29, 62, 69, 14, 32, 9, 52, 85, 23, 89, 51, 16, 39, 71, 51, 50, 40  };
        deleteNth(arr,      3);
    }
}
