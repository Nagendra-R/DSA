package gfg.dsa.demo.arrays.medium;

import java.util.Arrays;

public class LongConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,9,9,10,10};
//        System.out.println(longConsSubSequence(arr));
        System.out.println(secondRepeat(arr));
    }

    private static int secondRepeat(int[] arr) {
        int count = 0;
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] == arr[i - 1]) {
                count++;
            }
            if (count == 2 ){
                return arr[i];
            }

        }
        return -1;


    }

    private static int longConsSubSequence(int[] arr) {
        Arrays.sort(arr);
        int maxCount = 1;
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }
        return maxCount;
    }
}
