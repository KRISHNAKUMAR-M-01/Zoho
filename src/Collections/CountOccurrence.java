package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurrence {
    public static void main(String[] args) {
        String str="apple";
        System.out.println("Characters and their Occurrence:"+countOccurrance(str));
        System.out.println("first non repeating character:"+nonRepeating(str));
    }
    public static Map<Character,Integer> countOccurrance(String str){
         Map<Character,Integer> map = new LinkedHashMap<>();
         for(int i=0;i<str.length();i++){
             char c=str.charAt(i);
              map.put(c,map.getOrDefault(c,0)+1);
         }
         return map;
    }

    public static char nonRepeating(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer>entry: map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return '\0';
    }

}
