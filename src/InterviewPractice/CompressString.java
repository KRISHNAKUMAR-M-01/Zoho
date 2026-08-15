package InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class CompressString {
    public static void main(String[] args) {
        String string = "aabbc";
        System.out.println(compress(string));
    }
    public static String compress(String str) {
        String compressString="";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1) {
                compressString+=entry.getKey();
            }
            else{
                compressString+=entry.getKey()+""+entry.getValue();
            }
        }
        return compressString;
    }
}
