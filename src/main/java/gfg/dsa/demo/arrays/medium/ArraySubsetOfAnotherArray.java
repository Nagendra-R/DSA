package gfg.dsa.demo.arrays.medium;

import java.util.Arrays;

public class ArraySubsetOfAnotherArray {
    public static void main(String[] args) {
        int[] arr1 = {10,11,11, 5, 2, 23, 19};
        int[] arr2 = {5,2,11,11};

        //without duplicates
//        boolean isSubset = arraySubset(arr1, arr2);
        boolean ans = arraySubsetWithDuplicates(arr1, arr2);
        System.out.println(ans);

    }

    private static boolean arraySubsetWithDuplicates(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        while(j< arr2.length){
            if(arr1[i]==arr2[j]){
                i++;
                j++;
                continue;
            }
            if(arr1[i] > arr2[j]){
                return false;
            }else{
                i++;
            }
        }

        return true;

    }

    private static boolean arraySubset(int[] arr1, int[] arr2) {
        if (arr2.length > arr1.length){
            return false;
        }

        for(int i=0;i< arr2.length;i++){
            boolean check = false;
            for (int j =0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    check = true;
                }
            }
            if(!check){
                return false;
            }
        }
        return true;
    }
}
