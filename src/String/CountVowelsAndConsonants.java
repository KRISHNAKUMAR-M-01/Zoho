package String;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String string = "Programming";
        count(string);
    }
    public static void count(String str){
        str=str.toLowerCase();
        int vowel=0;
        int consonant=0;
        String vowels="";
        String consonants="";
        for (int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u'){
                    vowel++;
                    vowels+=ch;
                }
                else{
                    consonant++;
                    consonants+=ch;
                }
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("No. of Vowels:"+vowel);
        System.out.println("Consonants:"+consonants);
        System.out.println("No. of Consonants:"+consonant);
    }
}
