package InterviewPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        String string="programming";
        System.out.println(countFrequency(string));
    }
    public static Map<Character,Integer> countFrequency(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        return map;

    }
}
