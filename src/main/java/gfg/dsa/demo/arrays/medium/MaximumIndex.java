package gfg.dsa.demo.arrays.medium;

public class MaximumIndex {
    public static void main(String[] args) {
        int[] arr = { 34, 8, 10, 3, 2, 80, 30, 33, 1};

        System.out.println(maximumIndexJump(arr));
        System.out.println(maximumIndexJumpUsingTwoPointer(arr));

    }

    private static int maximumIndexJumpUsingTwoPointer(int[] arr) {
        int i=0;
        int max =0;

        int maxFinal = Integer.MIN_VALUE;
        while(i<arr.length){
            int j=arr.length-1;
            while(j>=i){
                if(arr[i]<=arr[j]){
                    max = j-i;
                    break;
                }
                j--;
            }
            maxFinal = Math.max(max,maxFinal);
            i++;
        }
        return maxFinal;
    }

    private static int maximumIndexJump(int[] arr) {
        int maxIndex = 0;
        int max =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >i; j--) {
                if(arr[i]<=arr[j]){
                    max =j-i;
                    break;
                }
            }
            maxIndex = Math.max(max,maxIndex);
        }
        return maxIndex;
//        int currentIndex = 0;
//        int jumpingIndex = 0;
//        for (int i = 1; i <= n; i++) {
//            jumpingIndex = currentIndex + i;
//            if(jumpingIndex == b){
//                continue;
//            }
//            currentIndex = jumpingIndex;
//        }
//        return currentIndex;
    }
}
