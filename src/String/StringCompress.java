package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompress {
    public static void main(String[] args) {
        String string = "aabcccc";
        System.out.println(stringcompress(string));
    }
    public static String stringcompress(String str){
        StringBuilder string = new StringBuilder();
        Map<Character,Integer> map =new LinkedHashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                string.append(entry.getKey()).append(entry.getValue());
            }
            else{
                string.append(entry.getKey());
            }
        }
        return string.toString();
    }
}
