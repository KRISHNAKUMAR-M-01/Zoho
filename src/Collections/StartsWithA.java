package Collections;

import java.util.ArrayList;

public class StartsWithA {
    public static void main(String[] args) {
        String[] strings = {"Apple","Banana","ApplePie","Avacado","Amala","Cherry"};
        System.out.println("Words Start with A:"+startsWithA(strings));
    }
    public static ArrayList<String> startsWithA(String[] str){
        ArrayList<String> list = new ArrayList<>();
        for (String string:str){
            if(string.toLowerCase().startsWith("a")){
                list.add(string);
            }
        }
        return list;
    }


}
