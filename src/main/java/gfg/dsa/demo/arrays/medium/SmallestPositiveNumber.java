package gfg.dsa.demo.arrays.medium;


import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SmallestPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(smallestNumber(arr));
        System.out.println(smallestNumberByTreeSet(arr));

    }

    private static int smallestNumberByTreeSet(int[] arr) {
        int number =1;
        Set<Integer> set = new TreeSet<>();
        for (int i=0;i<arr.length;i++){
            if(arr[i]>0){
                set.add(arr[i]);
            }
        }

        for(int ele : set){
            if(ele == number){
                number++;
            }else {
                return number;
            }
        }
        return number;
    }

    private static int smallestNumber(int[] arr) {
        int number = 1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                continue;
            } else {
                if(i<arr.length-1 && arr[i]==arr[i+1]){
                    continue;
                }
                else if (arr[i] == number ) {
                    number++;
                } else {
                    return number;
                }
            }
        }
        return number;
    }
}
