package gfg.dsa.demo.strings.medium;

public class LicenseKeyFormat {
    public static void main(String[] args) {
        String str = "5F3Z-2e-9-w";
        int k = 4;
        System.out.println(licenseFormat(str, k));
    }

    private static String licenseFormat(String str, int k) {
        int noOfk = 0;
        int index = str.length() - 1;
        StringBuilder finalStr = new StringBuilder();
        while (index >= 0) {
            if (str.charAt(index) == '-') {
                index--;
            } else if (noOfk == k) {
                finalStr.append("-");
                noOfk = 0;
            } else if (str.charAt(index)-'a' >=0 &&  str.charAt(index)-'z' <=26) {
                char ch = (char)(str.charAt(index)-32);
                finalStr.append(ch);
                noOfk++;
                index--;
            }else {
                finalStr.append(str.charAt(index));
                noOfk++;
                index--;
            }

        }
//        System.out.println(finalStr);
        return finalStr.reverse().toString();
    }
}
