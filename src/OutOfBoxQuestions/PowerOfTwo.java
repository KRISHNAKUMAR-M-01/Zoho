package OutOfBoxQuestions;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num=8;
        System.out.println("Number is a Power of 2 :"+isPower(num));
    }
    public static boolean isPower(int num){
        if((num &(num-1))==0){
            return true;
        }
        return false;
    }
}
