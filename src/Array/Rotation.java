package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rotation {
    public static void main(String[] args){
        int[] tasks={1,2,3,4,5,6,7};
        int k=3;
        System.out.println("Original:" + Arrays.toString(tasks));
        System.out.println("Rotated:" +rotateArray(tasks,k));
    }
    public static String rotateArray(int[] arr,int k){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        left=0;
        right=k-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        left=k;
        right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return Arrays.toString(arr);
    }
}
