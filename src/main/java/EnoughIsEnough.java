import java.util.*;

public class EnoughIsEnough {


    public static void deleteNth(int[] elements, int maxOccurrences) {
        int index = 0;
        int occurrences = 0;
        List<Integer> element = new ArrayList<>();
        List<Integer> occurrence = new ArrayList<>();

        while (index < elements.length) {
            for (int i = 0; i < elements.length; i++) {
                if (elements[index] == elements[i]) {
                    occurrences++;
                }
            }
            index++;
        }
        element.add(elements[index]);
        occurrence.add(occurrences);

        System.out.println(occurrence);
    }







    public static void main(String[] args) {
        int[] arr = new int[]{ 1, 1, 3, 3, 7, 2, 2, 2, 2 };
        deleteNth(arr, 3);
    }
}
