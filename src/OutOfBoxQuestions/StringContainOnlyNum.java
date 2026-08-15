package OutOfBoxQuestions;

public class StringContainOnlyNum {
    public static void main(String[] args) {
        String string ="987";
        System.out.println("String Contain only Digits: "+ isDigits(string));
    }
    public static Boolean isDigits(String str){
        for(char c:str.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return !str.isEmpty();
    }
}
