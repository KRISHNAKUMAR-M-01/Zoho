package String;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="listen";
        String str2="sil ent";
        System.out.println(str1+" and "+str2+" are anagram:"+isAnagram(str1,str2));
    }
    public static Boolean isAnagram(String str1,String str2){
        char[] arr1=str1.toLowerCase().replace(" ","").toCharArray();
        char[] arr2=str2.toLowerCase().replace(" ","").toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}
