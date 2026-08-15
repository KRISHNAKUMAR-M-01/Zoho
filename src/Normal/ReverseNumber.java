package Normal;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Original: 12345, Reversed: " + reverse(12345));
        System.out.println("Original: 1000,  Reversed: " + reverse(1000));
        System.out.println("Original: -123,  Reversed: " + reverse(-123));
        System.out.println("Original: 120,   Reversed: " + reverse(120));
    }
    public static int reverse(int num){
        boolean isnegative=false;
        if(num==0)return 0;
        if(num<0){
            isnegative=true;
            num=num*-1;
        }
        int rem=0;
        int rev=0;
        while(num>0){
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        return isnegative? -rev:rev;
    }
}
