package OutOfBoxQuestions;

public class Factorial {
    public static void main(String[] args) {
        int num=5;
        System.out.println("fact of "+ num+ " is "+ factRecur(num));
    }
    public static int factRecur(int num){
        if(num<=1)return 1;
        return num * factRecur(num-1);
    }
}
