package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortAnElement {
    public static void main(String[] args) {
        ArrayList<Integer> list =new  ArrayList<>(Arrays.asList(4,6,8,1,2));
        List<Integer> sorted=list.stream()
                        .sorted((a,b)->b-a).collect(Collectors.toList());
        System.out.println(sorted);
    }
}
