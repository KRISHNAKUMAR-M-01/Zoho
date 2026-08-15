package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Krish");
        list.add("Raj");
        list.add("Ram");

        Iterator<String> iterator=list.iterator();

        while(iterator.hasNext()){
            String name= iterator.next();
            System.out.println(name);

            if(name.equals("Raj")){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
