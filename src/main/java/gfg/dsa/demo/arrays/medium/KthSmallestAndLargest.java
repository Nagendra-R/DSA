package gfg.dsa.demo.arrays.medium;

import java.util.Set;
import java.util.TreeSet;

public class KthSmallestAndLargest {
    public static void main(String[] args) {
        int[] arr = {3, 1, 34, 44, 45, 53, 2};
        int kthSmallest = kSmallest(arr, 5);
        System.out.println(kthSmallest);
//        int kthLargest = kLargest(arr,4);

    }

    private static int kSmallest(int[] arr, int k) {
        Set<Integer> set = new TreeSet<>();
        for (int element : arr) {
            set.add(element);
        }
        System.out.println(set);
        int c=1;
        for (int ele:set){
            if(c==k){
                return ele;
            }
            c++;
        }
        return -1;
    }
}
