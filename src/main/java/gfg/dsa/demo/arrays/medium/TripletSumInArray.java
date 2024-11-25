package gfg.dsa.demo.arrays.medium;

public class TripletSumInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 6};
        tripletSum(arr, 10);


    }

    private static void tripletSum(int[] arr, int sum) {

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    System.out.println(i + " " + j + " " + k);
                    if (arr[i] + arr[j] + arr[k] == sum) {
//                        System.out.println(i + " " + j + " " + k);
//                        System.out.println(arr[i] + "  " + arr[j] + " " + arr[k]);
//                    break;
                    }
                }
            }
        }

    }
}
