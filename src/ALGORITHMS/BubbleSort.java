package ALGORITHMS;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={8,7,9,5,3,6};
        System.out.println("sorted array"+bubbleSort(arr));
    }
    public static String bubbleSort(int[] arr){
        int n= arr.length-1;
        for(int i=0;i<=n-1;i++){
            for (int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
}
