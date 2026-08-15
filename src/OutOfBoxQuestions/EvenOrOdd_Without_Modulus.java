package OutOfBoxQuestions;

public class EvenOrOdd_Without_Modulus {
    public static void main(String[] args) {
        int num=5;
        if(isEven(num)){
            System.out.println(num +" is even number");
        }
        else{
            System.out.println(num +" is odd number");
        }
    }
    public static Boolean isEven(int num){
        boolean val=true;
        for(int i=1;i<=num;i++){
            val=!val;
        }
        return val;
    }
}
