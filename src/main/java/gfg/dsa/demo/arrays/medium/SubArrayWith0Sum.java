package gfg.dsa.demo.arrays.medium;

public class SubArrayWith0Sum {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};

        System.out.println(subArrayWithZeroSum(arr));

    }

    private static boolean subArrayWithZeroSum(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = arr[i];
            if(sum == 0){
                return true;
            }
            for(int j=i+1;j< arr.length;j++){
                sum += arr[j];
                if(sum == 0){
                    return true;
                }
            }
        }
        return false;
    }
}
