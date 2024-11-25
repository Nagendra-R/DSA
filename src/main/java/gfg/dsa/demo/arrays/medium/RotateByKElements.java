package gfg.dsa.demo.arrays.medium;

import java.util.Arrays;

public class RotateByKElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 5, 7, 8};
//        System.out.println(Arrays.toString(rotateByKEle(arr, 2)));

        int missingNumber = findMissingNumber(arr);
        System.out.println(missingNumber);

        //two pointers method

    }

    private static int findMissingNumber(int[] arr) {
        int arrLength = arr.length+1;
        int totalSum = (arrLength*(arrLength+1))/2;
        int arrSum = Arrays.stream(arr).sum();
        int ans = totalSum - arrSum;
        return ans;
    }


    //shift each element from length-1 to 0 to one step right side
    private static int[] rotateByKEle(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            int lastEle = arr[arr.length - 1];
            for (int j = arr.length - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = lastEle;
//            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }


}
