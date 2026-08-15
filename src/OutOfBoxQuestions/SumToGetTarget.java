package OutOfBoxQuestions;

public class SumToGetTarget {
    public static void main(String[] args) {
        int[] arr={1,2,5,10,50,100};
        int tar=503;
        sumToTarget(arr,tar);
    }
    public static void sumToTarget(int[] arr,int tar){
        int time=1;
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]<=tar){
                time=tar/arr[i];
                tar= tar%arr[i];
                System.out.println(arr[i] +" x "+time+"= "+(arr[i]*time));
            }

        }
    }
}
