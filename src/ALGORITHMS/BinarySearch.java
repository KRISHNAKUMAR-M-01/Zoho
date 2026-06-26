package ALGORITHMS;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={5,7,8,9,10,22,55,67,89};
        int target=8;
        int index=binarySearch(arr,target);
        System.out.println("Binary search:Target: "+target+ " found at index:"+index);
    }
    public static int binarySearch(int[] arr,int tar){
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==tar){
                return mid+1;
            } else if (arr[mid]>tar) {
                right=mid-1;
            } else {
                left=mid+1;

            }
        }
        return -1;

    }
}
