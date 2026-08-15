package InterviewPractice;

import java.util.Arrays;

public class String_One {
    public static void main(String[] args) {
        String str="krish#kanna@asdfghj@$";
        modify(str);
    }
    public static void modify(String str){
        char[] arr=str.toCharArray();
        int count_Hash=0;
        int count_At=0;
        boolean is_Seen=false;
        for(int i=0;i<arr.length;i++){
            char c=arr[i];
            if(c=='#'){
                count_Hash++;
                arr[i]='$';
            }
            if(c=='@'){
                count_At++;
                arr[i]='$';
            }
            if(!is_Seen){
                arr[i]=Character.toUpperCase(arr[i]);
                if(arr[i]=='$'){
                    is_Seen=true;
                }
            }
        }
        System.out.println("Count of # :"+count_Hash);
        System.out.println("Count of @ :"+count_At);
        System.out.println(new String(arr));

    }
}
