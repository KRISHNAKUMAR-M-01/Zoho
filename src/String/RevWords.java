package String;

public class RevWords {
    public static void main(String[] args) {
        String str="I Love Java";
        System.out.println("String before Reversed:"+str);
        System.out.println("String after Reversed(by words):"+revWords(str));
    }
    public static String revWords(String str){
        String[] strArr=str.split(" ");
        int left=0,right= strArr.length-1;
        while(left<right){
            String temp = strArr[left];
            strArr[left]=strArr[right];
            strArr[right]=temp;
            left++;
            right--;
        }
        return String.join(" ",strArr );
    }
}
