package InterviewPractice;

public class Count_Vowel_Consonant {
    public static void main(String[] args) {
        String string = "Hello World 123";
        count(string);
    }
    public static void count(String str){
        char[] arr=str.toCharArray();
        int vowel=0;
        int consonant=0;
        for(int i=0;i<arr.length;i++){
            char c=Character.toLowerCase(arr[i]);
            if(c>='a' && c<='z'){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
        }
        System.out.println("vowel:"+vowel);
        System.out.println("consonant:"+consonant);
    }
}
