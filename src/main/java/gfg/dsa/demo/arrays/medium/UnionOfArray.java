package gfg.dsa.demo.arrays.medium;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 5,10,11,11, 19, 23};
        int[] arr2 = {2,3,5,11,11};
//        List<Integer> union = unionOfSortedArray(arr1,arr2);
//        System.out.println(union);

        List<Integer> unionSort = unionOfSortedArrayWithOrder(arr1,arr2);
        System.out.println(unionSort);

//        List<Integer> interSection = intersectionOfSortedArray(arr1,arr2);
//        System.out.println(interSection);

    }

    private static List<Integer> unionOfSortedArrayWithOrder(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j< arr2.length){
            if(arr1[i]==arr2[j]){
                if(!list.contains(arr1[i])){
                    System.out.println(arr1[i]);
                    list.add(arr1[i]);
                    i++;
                    j++;
                    continue;
                }
            }
            if(arr1[i]>arr2[j]){
                if(!list.contains(arr2[j])){
                    System.out.println(arr2[j]);
                    list.add(arr2[j]);

                }
                j++;
            }else{
                if(!list.contains(arr1[i])){
                    System.out.println(arr1[i]);
                    list.add(arr1[i]);
                }
                i++;
            }
        }

        while(i< arr1.length){
           if(!list.contains(arr1[i])){
               list.add(arr1[i]);
           }
           i++;
        }

        while(j< arr2.length){
            if(!list.contains(arr2[j])){
                list.add(arr1[j]);
            }
            j++;
        }

        return list;

    }

    private static List<Integer> intersectionOfSortedArray(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i< arr1.length && j<arr2.length){

            if(arr1[i]==arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
                continue;
            }
            if(arr1[i]>arr2[j]){
                j++;
            }else{
               i++;
            }
        }
        return list;
    }

    private static List<Integer> unionOfSortedArray(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        for (int j : arr1) {
            if(!list.contains(j)){
                list.add(j);
            }
        }
        for (int ele : arr2){
            if(!list.contains(ele)){
                list.add(ele);
            }
        }
        return list;
    }
}
