package ALGORITHMS;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={7,9,5,66,45,74};
        int target=66;
        int index=linearSearch(arr,target);
        if(index!=-1){
            System.out.println("Element found at index :"+index);
        }else{
            System.out.println("Element not found");
        }
    }
    public static int linearSearch(int[] arr,int tar){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return i+1;
            }
        }
        return -1;
    }
}
