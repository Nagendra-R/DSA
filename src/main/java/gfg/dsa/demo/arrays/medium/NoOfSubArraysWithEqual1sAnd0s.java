package gfg.dsa.demo.arrays.medium;

public class NoOfSubArraysWithEqual1sAnd0s {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1};
        System.out.println(noOfSubArrays(arr));

    }

    private static int noOfSubArrays(int[] arr) {
//        int noOfZeros = 0;
//        int noOfOnes = 0;
        int noOfSubArrays = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int noOfZeros = 0;
            int noOfOnes = 0;
            if (arr[i] == 0) {
                noOfZeros++;
            } else {
                noOfOnes++;
            }
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] == 0) {
                    noOfZeros++;
                } else {
                    noOfOnes++;
                }
                if(noOfZeros == noOfOnes){
                    noOfSubArrays++;
                    System.out.println(i +"   "+j);
                }
            }
        }
        return noOfSubArrays;
    }
}
