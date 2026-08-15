package Array;

import java.util.Arrays;

public class InitializeAllToOne {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Arrays.fill(arr,-1);
        System.out.println(Arrays.toString(arr));
    }
}
