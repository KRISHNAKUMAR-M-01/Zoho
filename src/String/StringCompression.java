package String;

public class StringCompression {
    public static void main(String[] args) {
        String string = "aabcccccaaa";
        System.out.println(compress(string));
    }
    public static String compress(String str){
        StringBuilder result=new StringBuilder();
        int i=0;
        while (i<str.length()){
            char currentChar=str.charAt(i);
            int count=0;

            while(i<str.length()&&str.charAt(i)==currentChar){
                count++;
                i++;
            }
            result.append(currentChar);
            if (count>1){
                result.append(count);
            }

        }
        return result.length()<str.length()?result.toString():str;
    }
}
