package Normal;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Original: 12345, Armstrong number: " + armstrongNumber(153));
        System.out.println("Original: 1000,  Armstrong number: " + armstrongNumber(371));
        System.out.println("Original: -123,  Armstrong number: " + armstrongNumber(123));
        System.out.println("Original: 120,   Armstrong number: " + armstrongNumber(1634));
    }
    public static boolean armstrongNumber(int num){
        if(num==0)return false ;
        int org=num;
        int temp=num;
        int count=0;
        int rem=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        int sum=0;
        while(num >0){
            rem=num%10;
            sum= (int) (sum+Math.pow(rem,count));
            num=num/10;
        }
        return sum==org;
    }
}
