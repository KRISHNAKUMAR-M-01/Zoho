package ALGORITHMS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={8,7,9,5,3,6};
        System.out.println("sorted array"+selectionSort(arr));
    }
    public static String selectionSort(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                   minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        return Arrays.toString(arr);
    }
}
