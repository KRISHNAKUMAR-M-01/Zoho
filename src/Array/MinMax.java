package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinMax {
    public static void main(String[] args) {
        int[] arr={5,8,5,3,5,7};
        System.out.println("Maximum in Array(Collections):"+findMax(arr));
        System.out.println("Minimum in Array(Collections):"+findMin(arr));
        System.out.println("Maximum in Array(Stream):"+Max(arr));
        System.out.println("Minimum in Array(Stream):"+Min(arr));
    }
    //using Collections
    public static int findMax(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int num:arr){
            list.add(num);
        }
        return Collections.max(list);
    }

    public static int findMin(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int num:arr){
            list.add(num);
        }
        return Collections.min(list);
    }

    public static int Max(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }

    public static int Min(int[] arr){
        return Arrays.stream(arr).min().getAsInt();
    }
}
