import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String str="abc@abc@d@@AAa";
        String str1="ababcdc";
        FindLongestSubstring(str);
    }
    public static void FindLongestSubstring(String str){
        String LongestSubstring=null;
        int LongestSubstringLength=0;
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] arr=str.toCharArray();
        for(int i=0;i< arr.length;i++){
            char c=arr[i];
            if(!map.containsKey(c)){
                map.put(c,i);
            }
            else{
                i=map.get(c);
                map.clear();
            }
            if(map.size()>LongestSubstringLength){
                LongestSubstringLength=map.size();
                LongestSubstring=map.keySet().toString();
            }
        }
        System.out.println(LongestSubstringLength);
        System.out.println(LongestSubstring);
    }
}
