package Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,4,};
        System.out.println("Duplicates:"+removeDuplicate(arr));
        System.out.println("Array without Duplicate:"+arrayWithoutDuplicate(arr));
    }
    public static ArrayList<Integer> removeDuplicate(int[] arr){
        Set<Integer> seen=new LinkedHashSet<>();
        ArrayList<Integer> duplicates =new ArrayList<>();
        for(int num:arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        return duplicates;
    }
    public static Set<Integer> arrayWithoutDuplicate(int[] arr){
        Set<Integer> seen=new LinkedHashSet<>();
        ArrayList<Integer> duplicates =new ArrayList<>();
        for(int num:arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        return seen;
    }

}
