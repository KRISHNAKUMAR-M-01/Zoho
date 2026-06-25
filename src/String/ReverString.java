package String;

import java.util.Arrays;

public class ReverString {
    public static void main(String[] args) {
        String str="god";
        System.out.println("Original String:"+str);
        System.out.println("Reversed String:"+reverseString(str));
        System.out.println("IsPalindrome:"+checkPalindrome(str));
        System.out.println("Reversed String(without reverse()):"+reverseStringWithoutreverse(str));
        System.out.println("Reversed String(with pointers):"+reverseStringWithPointer(str));
    }
    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static Boolean checkPalindrome(String str){
        String revStr= new StringBuilder(str).reverse().toString();
        if (revStr.equals(str)){
            return  true;
        }
        return false;
    }
    public static String reverseStringWithoutreverse(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        return reverse;
    }
    public static String reverseStringWithPointer(String str){
        char[] arr=str.toCharArray();
        int left=0,right= arr.length-1;
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}
