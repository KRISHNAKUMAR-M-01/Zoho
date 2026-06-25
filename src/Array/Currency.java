package Array;

public class Currency {
    public static void main(String[] args) {
        int[] arr = {1,2,5,10,50,100,200,500};
        int amount = 53;
        int a = 1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] <= amount){
                a = amount / arr[i];
                amount %= arr[i];
                System.out.println(arr[i] + " X " + a + " = " + (arr[i] * a));
            }

        }
    }
}
