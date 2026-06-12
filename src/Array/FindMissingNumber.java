package Array;

public class FindMissingNumber {
    public static void main(String[] args){
        int[] attendance = {1, 2, 4, 5, 6, 3, 8, 7, 9,10, 11};
        System.out.println(missingNumber(attendance));
    }
    public static int missingNumber(int[] arr){
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        int actualVal=0;
        for(int num:arr){
            actualVal+=num;
        }
        int originalVal=0;
        originalVal=(max*(max+1))/2;
        int res=originalVal-actualVal;
        return res;
    }
}
