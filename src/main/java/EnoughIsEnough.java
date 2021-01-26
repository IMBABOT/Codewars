import java.util.*;

public class EnoughIsEnough {


    public static void deleteNth(int[] elements, int maxOccurrences) {
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

        int first = 0;
            int el = 0;
        if (count == 1) {
            for (int i = 0; i <element.size() ; i++) {
                if (element.get(i) > maxOccurrences){
                    el = element.get(i);
                }
            }

            while (count > 0) {
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
        }else {

        }
        int first = 0;
        while (count > 0) {
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
        System.out.println(element);

    }



    public static void main(String[] args) {
        int[] arr = new int[]{ 1, 1, 3, 3, 7, 2, 2, 2, 2};
        deleteNth(arr,    3);
    }
}
