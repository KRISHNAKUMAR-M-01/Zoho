import java.util.Arrays;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2};
        Arrays.sort(arr);
        System.out.println(FindMissing(arr));
    }
    public static int FindMissing(int[] arr){
        int num=0;
        if(arr.length==0||arr.length==1){
            return -1;
        }
        int j=0;
        for(int i=0;i<arr[arr.length-1];i++){
            if(i!=arr[j]){
                 num=i;
            }
        }
        return num;
    }
}
