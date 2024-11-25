package gfg.dsa.demo.arrays.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,3,3,3,2, 4, 12, 3, 2, 1, 1, 2, 3};
        findDuplicates(arr);
    }

    private static void findDuplicates(int[] arr) {
        Set<Integer> duplicatesSet = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicatesSet.add(arr[j]);
                }
            }
        }

        System.out.println(duplicatesSet);
    }
}
