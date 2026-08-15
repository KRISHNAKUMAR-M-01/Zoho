package OutOfBoxQuestions;

import java.util.*;

public class Intersect {
    public static void main(String[] args) {
        int[] setA={2,3,5,4,7,8};
        int[] setB={1,3,6,7,9};
        System.out.println("Set A: "+ Arrays.toString(setA));
        System.out.println("Set B: "+Arrays.toString(setB));
        System.out.println("Intersect :"+intersectFunc(setA,setB));
    }
    public static List<Integer> intersectFunc(int[] a,int[] b){
        Set<Integer> set = new LinkedHashSet<>();
        for(int num:a){
            set.add(num);
        }
        List<Integer> result=new ArrayList<>();
        Set<Integer> seen=new LinkedHashSet<>();
        for(int num:b){
            if(set.contains(num)&&seen.add(num)){
                result.add(num);
            }
        }
        return result;
    }
}
