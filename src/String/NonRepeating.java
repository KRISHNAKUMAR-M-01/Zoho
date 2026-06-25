package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeating {
    public static void main(String[] args) {
        String string ="programmingp";
        Map<Character,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<string.length();i++){
            char c=string.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("Non repeating Character: "+entry.getKey());
                break;
            }
        }
    }
}
