package InterviewPractice;

public class StringManipulation {
    public static void main(String[] args) {
        String string="abc123xyz456";
        stringManipulation(string);
    }
    public static void stringManipulation(String str){
        char[] arr=str.toCharArray();
        int count=0;
        boolean is_seen=false;
        for(int i=0;i< arr.length;i++){
            if(Character.isDigit(arr[i])){
                arr[i]='*';
                count++;
            }
            if(!is_seen){
                arr[i]=Character.toUpperCase(arr[i]);
                if(arr[i]=='*'){
                    is_seen=true;
                }
            }

        }
        System.out.println("Count of digit:"+count);
        System.out.println("output: "+new String(arr));

    }
}
