package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        String[] playlist={"Song A","Song B","Song C","Song D","Song E"};
        System.out.println("Original: "+Arrays.toString(playlist));
        System.out.println("Reversed: "+reverseArray(playlist));
    }
    public static String reverseArray(String[] playlist){
        int left=0;
        int right=playlist.length-1;
        while(left<right){
            String temp=playlist[left];
            playlist[left]=playlist[right];
            playlist[right]=temp;
            left++;
            right--;
        }
        return Arrays.toString(playlist);
    }
}

