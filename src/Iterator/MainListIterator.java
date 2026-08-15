package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

public class MainListIterator {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("Krish");
        list.add("Raj");
        list.add("Ram");

        ListIterator<String> listIterator=list.listIterator();
        System.out.println("Forward");
        while(listIterator.hasNext()){
            String name =listIterator.next();
            int index= listIterator.nextIndex();
            System.out.println(index+":"+name);

            if (name.equals("Raj")){
                listIterator.set("Goku");
            }
            if(name.equals("Ram")){
                listIterator.set("Vegita");
            }
        }
        System.out.println(list);

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
