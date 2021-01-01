public class WhitespaceNumber {

    public static String whitespaceNumber(final int n) {
        String temp = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        String binary = "";
        int convert = 0;

        if (temp.charAt(0) == '-'){
            sb.append("\t");
        }
        if (temp.charAt(0) != '-'){
            sb.append(' ');
        }

        if (temp.charAt(0) == '-'){
            temp = temp.substring(1);
            convert = Integer.valueOf(temp);
        }else  if (temp.charAt(0) != '-'){
            convert = Integer.valueOf(temp);
        }

        binary = intToBinary(convert);


        for (int i = 0; i < binary.length() ; i++) {
            if (binary.charAt(i) == '1'){
                sb.append("\t");
            }else  if (binary.charAt(i) == '0'){
                sb.append(" ");
            }
        }

        sb.append("\n");

        return sb.toString();
    }

    private static String intToBinary(int n){
        String result = "";

        while (n > 0){
            if (n % 2 == 0){
                result += "0";
            }else  if (n % 2 != 0){
                result += "1";
            }

            n = n / 2;
        }

       return new StringBuilder(result).reverse().toString();
    }
}
