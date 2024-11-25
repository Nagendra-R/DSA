package gfg.dsa.demo.arrays.medium;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] arr ={2, 3, 4, 5, -1, 0};
        System.out.println(maxProductSubArray(arr));
    }

    private static long maxProductSubArray(int[] arr) {
        long maxFinal =Integer.MIN_VALUE;
        long product = 1;
        for (int i=0;i<arr.length;i++){
            product = arr[i];
            if(product>maxFinal){
                maxFinal = product;
            }
            for (int j=i+1;j<arr.length;j++){
                product *=arr[j];
                if(product >  maxFinal){
                    maxFinal = product;
                }

            }
        }
        return maxFinal;
    }
}
