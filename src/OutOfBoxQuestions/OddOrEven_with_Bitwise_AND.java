package OutOfBoxQuestions;

public class OddOrEven_with_Bitwise_AND {
    public static void main(String[] args) {
        int num=8;
        if((num & 1)==0){
            System.out.println(num +" is even number");
        }
        else {
            System.out.println(num +" is odd number");
        }
    }
}
