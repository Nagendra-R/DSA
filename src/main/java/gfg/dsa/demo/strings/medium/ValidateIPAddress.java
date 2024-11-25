package gfg.dsa.demo.strings.medium;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String str = "125.12.100.abc";
        System.out.println(validateIPAddress(str));
    }

    private static boolean validateIPAddress(String str) {
        int noOfValidNumbers = 0;

        String[] ipAddress = str.split("\\.");

        if (ipAddress.length != 4) {
            return false;
        }

        for (int i = 0; i < ipAddress.length; i++) {
            String tempStr = ipAddress[i];
//            System.out.println(tempStr);
            int res = 0;
            for (int j = 0; j < tempStr.length(); j++) {
                if (tempStr.charAt(j) - '0' >= 0 && tempStr.charAt(j) - '0' <= 9) {
//                    System.out.println(tempStr.charAt(j)-'0');
                    res = res * 10 + tempStr.charAt(j) - '0';
//                    System.out.println(res);
                } else {
                    return false;
                }
            }

//            System.out.println(res);

            if (res >= 0 && res <= 255) {
                noOfValidNumbers++;
            } else {
                return false;
            }
        }

        return noOfValidNumbers == 4;

    }
}
