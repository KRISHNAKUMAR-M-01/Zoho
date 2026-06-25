package String;

public class CapitalizeFirst {
    public static void main(String[] args) {
        String string = "hello krish";
        System.out.println("String:" + capitalizeFirst(string));
    }
    public static String capitalizeFirst(String str){
        String[] arr=str.split(" ");
        String result="";
        int j=0;
        for(String string:arr){
            result+=Character.toUpperCase(string.charAt(0))+string.substring(1)+" ";
        }
        return result.trim();
    }

}
