package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Merge {
    public static void main(String[] args) {
        int[] arr1={2,5,7,8,9,12,14};
        int[] arr2={1,3,4,6,10,11,13};
        System.out.println("Sorted Array"+sortedArray(arr1,arr2));
    }
    public static ArrayList<Integer> sortedArray(int[] arr1,int[] arr2){
        ArrayList<Integer> sorted=new ArrayList<>();
        for(int num:arr1){
            sorted.add(num);
        }
        for(int num:arr2){
            sorted.add(num);
        }
        Collections.sort(sorted);
        return sorted;
    }
}
