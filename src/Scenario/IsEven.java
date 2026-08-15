package Scenario;

public class IsEven {
    public static void main(String[] args) {
        int n=9;
        int[] isEven={1,0};
        int even=isEven[n&1];
        System.out.println(even);
    }
}
