package OutOfBoxQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        int[] setA={1,4,5,6,7};
        int[] setB={1,8,4,6,9};
        System.out.println("Set A: "+Arrays.toString(setA));
        System.out.println("Set B: "+Arrays.toString(setB));
        System.out.println("Union :"+unionFunc(setA,setB));
    }
    public static Set<Integer> unionFunc(int[] arr1,int[] arr2){
        Set<Integer> unionSet=new LinkedHashSet<>();
        for(int num:arr1){
            unionSet.add(num);
        }
        for(int num:arr2){
            unionSet.add(num);
        }
        return unionSet ;
    }
}
