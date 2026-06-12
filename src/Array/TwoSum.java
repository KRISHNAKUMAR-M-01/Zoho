package Array;

public class TwoSum {
    public static void main(String[] args){
        int[] prices={10,20,35,50,75,90};
        int target=60;
        sumTwo(prices,target);
    }
    public static void sumTwo(int[] arr,int target){
        int n=arr.length;
        for(int j=0;j<n-1;j++){
            for(int i=j+1;i<n;i++){
                if(arr[j]+arr[i]==target){
                    System.out.println("Item at index ["+j+","+i+"] add up to"+target);
                    System.out.println("Price["+j+"]="+arr[j]+","+"Price["+i+"]="+arr[i]+"->"+arr[j]+"+"+arr[i]+"="+target);
                }
            }
        }
    }
}
