package gfg.dsa.demo.strings.medium;

public class Equal012 {
    public static void main(String[] args) {
        String str = "0102010";
        System.out.println(countSubStringWith012(str));
    }

    private static int countSubStringWith012(String str) {
        int c = 0;
        int i = 3;
        while (i <= str.length()) {
            for (int j = 0; j < str.length() - i + 1; j++) {
                String eachSubString = str.substring(j, j + i);
                System.out.println(eachSubString);
                c = checkEqualNumbers(eachSubString, i) ? c + 1 : c;
            }
            i= i+3;
        }
        return c;
    }

    private static boolean checkEqualNumbers(String eachSubString, int i) {
        int noOfZeros = 0;
        int noOfOnes = 0;
        int noOfTwos = 0;
        for (int k = 0; k < eachSubString.length(); k++) {
            int number = eachSubString.charAt(k) - '0';
            if (number == 0) {
                noOfZeros++;
            } else if (number == 1) {
                noOfOnes++;
            } else {
                noOfTwos++;
            }
        }
        int total = eachSubString.length() / i;
        return noOfZeros == total && noOfOnes == noOfTwos;
    }


}
