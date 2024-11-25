package gfg.dsa.demo.arrays.medium;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr ={1,-1,2,-2,3,-3};
        System.out.println(maxSubArray(arr));
//        System.out.println(kadan(arr));
    }

    private static int kadan(int[] arr) {
        int maxSum = arr[0];
        int sum =arr[0];
        for(int ele : arr){
            sum = sum + ele;
            if(ele>sum){
                maxSum = sum;
            }

        }
        return 0;
    }

    private static int maxSubArray(int[] arr) {
        int finalSum = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = arr[i];
            if(sum>finalSum){
                finalSum = sum;
            }
            for (int j=i+1;j<arr.length;j++){
                sum +=arr[j];
                if(sum>finalSum){
                    finalSum = sum;
                }
            }
        }
        return finalSum;
    }

}
