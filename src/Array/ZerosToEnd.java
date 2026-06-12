package Array;

import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args){
        int[] readings={0,1,0,3,12,0,5};
        System.out.println("Original: "+ Arrays.toString(readings));
        System.out.println("Cleaned: "+moveZero(readings));
    }
    public static String moveZero(int[] arr){
       int j=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
               int temp=arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
               j++;
           }
       }

       return Arrays.toString(arr);

    }
}
