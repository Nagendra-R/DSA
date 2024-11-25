package gfg.dsa.demo.strings.easy;

public class RotateBy2 {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "geeksgeeksfor";
        System.out.println(check2Rotate(s1,s2));
    }


    private static boolean check2Rotate(String s1, String s2) {
        StringBuilder clockWise = new StringBuilder();
        StringBuilder antiClockWise = new StringBuilder();

        if(s1.length() != s2.length()){
            return false;
        }
        if(s1.length() >= 2){
            clockWise.append(s1.substring(2));
            clockWise.append(s1, 0, 2);


            antiClockWise.append(s1.substring(s1.length()-2));
            antiClockWise.append(s1, 0, s1.length()-2);
        }

        return clockWise.toString().equals(s2) || antiClockWise.toString().equals(s2);
    }
}
