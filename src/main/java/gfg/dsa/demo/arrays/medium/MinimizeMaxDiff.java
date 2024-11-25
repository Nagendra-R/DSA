package gfg.dsa.demo.arrays.medium;

import java.util.Arrays;

public class MinimizeMaxDiff {
    public static void main(String[] args) {
        int[] arr ={12, 6, 4, 15, 17, 10};
        int k=6;
        System.out.println(minimizeDiff(arr,k));
    }

    private static int minimizeDiff(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for (int ele :arr){
            max = Math.max(ele,max);
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]+k>max){
                arr[i] = arr[i]-k;
            }else{
                arr[i] = arr[i]+k;
            }
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[arr.length-1]-arr[0];
    }
}
