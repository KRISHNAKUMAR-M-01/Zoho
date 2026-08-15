package InterviewPractice;


public class CompressStringTwo {
    public static void main(String[] args) {
        String string = "aaaaabbc";
        System.out.println(compress(string));
    }
    public static String compress(String str) {
        String compressString="";
        int count=1;

        for(int i=1;i<=str.length();i++){
            if(i<str.length()&& str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else {
                compressString+=str.charAt(i-1)+""+count;
                count=1;
            }
        }

        return compressString.length()<str.length()?compressString:str;
    }
}
