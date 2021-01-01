public class CheckThreeAndTwo {
    public static boolean checkThreeAndTwo(char[] chars) {
        int A = 0;
        int B = 0;
        int C = 0;

        for (int i = 0; i < chars.length ; i++) {
            if (chars[i] == 'a') A++;
            if (chars[i] == 'b') B++;
            if (chars[i] == 'c') C++;
        }

        return A == 3 && B == 2 || A == 2 && B == 3 || A == 3 && C == 2 || A == 2 && C == 3 || B == 3 && C == 2 || B == 2 && C == 3;

    }
}
