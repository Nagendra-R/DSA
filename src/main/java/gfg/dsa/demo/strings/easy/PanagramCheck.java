package gfg.dsa.demo.strings.easy;

import java.util.Arrays;

public class PanagramCheck {
    public static void main(String[] args) {
        String str ="Bawds jog, flick quartz, %%vex nymph";
        System.out.println(checkPanagram(str.toLowerCase()));
    }

    private static boolean checkPanagram(String str) {

        str = str.toLowerCase();

        int[] arr = new int[26];
        if(str.length()<26){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            int index= str.charAt(i)-97;
            if(index>=0 && index<=25){
                arr[index]=1;
            }
        }

        System.out.println( Arrays.toString(arr));

        for (int ele : arr){
            if(ele==0){
                return false;
            }
        }
        return true;
    }
}
