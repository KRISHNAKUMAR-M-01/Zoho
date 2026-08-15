package Normal;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println("Original: 12345, Sum Of Digit: " + sumOfDigit(12345));
        System.out.println("Original: 1000,  Sum Of Digit: " + sumOfDigit(1000));
        System.out.println("Original: -123,  Sum Of Digit: " + sumOfDigit(-123));
        System.out.println("Original: 120,   Sum Of Digit: " + sumOfDigit(120));
    }
    public static int sumOfDigit(int num){
        boolean isnegative=false;
        if(num==0)return 0;
        if(num<0){
            isnegative=true;
            num=num*-1;
        }
        int rem=0;
        int sum=0;
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        return isnegative? -sum:sum;
    }
}
