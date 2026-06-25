package Collections;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class NonRepeating {
    public static void main(String[] args) {
        String str= "abcddab" ;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            Character c=str.charAt(i);

            map.put(c, map.getOrDefault(c,0)+1);

        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }
}
