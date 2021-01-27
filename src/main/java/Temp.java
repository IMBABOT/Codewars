public class Temp {
    public static void deleteNth(int[] elements, int maxOccurrences) {
            int occur = 0;
            int element;
            int index = 0;

            while (index < elements.length - 1){
                for (int i = 0; i < elements.length ; i++) {
                    if (elements[index] == elements[i]){
                        occur++;
                        index++;
                    }
                }
            }

    }


    public static void main(String[] args) {
            int[] ints = new int[]{ 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1};
            deleteNth(ints,3);
    }
}
