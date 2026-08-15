package Scenario;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class InterviewQuestion {
    public static void main(String[] args) {
        String str="krish#kanna@asdfghj@$";
        caseQuestion(str);
    }
    public static void caseQuestion(String str){
        int CountOfHash=0;
        int CountOfAt=0;
        for(char c:str.toCharArray()){
            if(c=='#'){
                CountOfHash++;
            } else if (c=='@') {
                CountOfAt++;
            }
        }
        System.out.println("The Count of #: "+CountOfHash);
        System.out.println("The count of @: "+CountOfAt);


        char[] chars = str.toCharArray();
        for (int i=0;i< chars.length;i++){
            if(chars[i]=='#'){
                chars[i]='$';
            } else if (chars[i]=='@') {
                chars[i]='$';
            }
        }
        String newString = "";
        for(char c:chars){
            newString +=c;
        }
        System.out.println(newString);

//        String string=str.replace("#","$").replace("@","$");
//        System.out.println(string);


        char[] chars1=newString.toCharArray();
        for (int i=0;i< chars1.length;i++){
            chars1[i]=Character.toUpperCase(chars1[i]);
            if(chars1[i]=='$'){
                break;
            }
        }
        String newString1 = "";
        for(char c:chars1){
            newString1 +=c;
        }
        System.out.println(newString1);
    }
}
