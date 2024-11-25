package gfg.dsa.demo.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1,1,3, 2, 2, 3};
        System.out.println(nonRepeatEle(arr));
        usingHashing(arr);
    }

    private static void usingHashing(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        for(int ele:arr){
            if(map.get(ele)==1){
                System.out.println(ele);
            }
        }
        System.out.println(0);
    }

    private static int nonRepeatEle(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int left = i - 1;
            int right = i + 1;
            boolean leftFound = false;
            boolean rightFound = false;

            while (right < arr.length) {
                if (arr[i] == arr[right++]) {
                    rightFound = true;
                }
            }

            while (left >= 0) {
                if (arr[i] == arr[left--]) {
                    leftFound = true;
                }
            }

            if (!leftFound && !rightFound) {
                return arr[i];
            }


        }
        return 0;

    }
}
