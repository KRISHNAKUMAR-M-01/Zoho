package InterviewPractice;

public class Palindrome {
    public static void main(String[] args) {
        String string = "Nurses Run";
        String org="";
        for(int i=0;i<string.length();i++){
            char c=Character.toLowerCase(string.charAt(i));
            if (c>='a'&& c<='z'){
                org+=c;
            }
        }
        String temp="";
        for (int i=org.length()-1;i>=0;i--){
            temp+=org.charAt(i);
        }
        if(org.equals(temp)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not a palidrome");
        }


    }
}
