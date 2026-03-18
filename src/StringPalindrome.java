public class StringPalindrome {
    public static void main(String[] args) {
        String str = "abcBa";
        String str1 = "@a#a%";
        String str2 = "  aba  ";
        String str3 = "";

        //Passing through method(function)
        System.out.println(verifyPalindrome(str));
        System.out.println(verifyPalindrome(str1));
        System.out.println(verifyPalindrome(str2));
        System.out.println(verifyPalindrome(str3));
    }

        private static boolean verifyPalindrome(String str) {
        //If the length of the String is 0 or 1 return true
        if (str.length()==1 || str.length() == 0){
            return true;
        }
        int left=0;
        int right=str.length()-1;
        //loop run till the left is less than right
        while(left<right){
            //if a char is not a alphabet it is skipped by increasing the index by 1(left)
            if(!Character.isAlphabetic(str.charAt(left))){
                left++;
            }
            //if a char is not a alphabet it is skipped by decreasing the index by 1(right)
            else if(!Character.isAlphabetic(str.charAt(right))){
                right--;
            }
            //if two char not matched return false
            else if(Character.toLowerCase(str.charAt(left))!=Character.toLowerCase(str.charAt(right))){
                return false;
            }
            //increment and decrement to move to next char
            else{
                left++ ;
                right--;
            }

        }
        //return true if the character matched
        return true;

    }

}
