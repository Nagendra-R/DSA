package gfg.dsa.demo.arrays.medium;

import java.util.Arrays;

public class ReArrangePositiveAndNegative {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,-1,-2,-3};
        reArrange(arr);
        System.out.println("=========================");
        System.out.println(Arrays.toString(arr));
    }

    private static void reArrange(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i] >= 0) {
                    continue;
                } else {
                    index = findNextPositiveIndex(arr, i);
//                    System.out.println("positiveIndex::   "+ index);
                }
            } else {
                if (arr[i] < 0) {
                    continue;
                } else {
                    index = findNextNegativeIndex(arr, i);
//                    System.out.println("negativeIndex::   "+ index);
                }
            }
            if (index == -1) {
                break;
            } else {
                rotateOneElement(arr, i, index);
//                System.out.println(Arrays.toString(arr));
            }

        }
    }

    private static void rotateOneElement(int[] arr, int i, int index) {
        int temp = arr[index];
        for (int j = index-1; j >=i; j--) {
//            System.out.println(arr[j]);
            arr[j+1]=arr[j];
        }
        arr[i] = temp;
    }

    private static int findNextNegativeIndex(int[] arr, int i) {
        for (int j = i; j < arr.length; j++) {
            if (arr[j] < 0) {
                return j;
            }
        }
        return -1;
    }

    private static int findNextPositiveIndex(int[] arr, int i) {
        for (int j = i; j < arr.length; j++) {
            if (arr[j] >= 0) {
                return j;
            }
        }
        return -1;
    }


}
