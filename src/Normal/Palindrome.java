package Normal;

public class Palindrome {
    public static void main(String[] args) {
        int n=0;
        System.out.println(n+" is palindrome: "+ isPalindrome(n));
    }
    public static boolean isPalindrome(int n){
        int rem=0;
        int org=n;
        int rev=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev==org){
            return true;
        }
        return false;
    }
}
