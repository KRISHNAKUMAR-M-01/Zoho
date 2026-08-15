package OutOfBoxQuestions;

public class OneToHundred_without_Loops {
    public static void main(String[] args) {
        int num=10;
        oneToHundred(num);
    }
    public static void oneToHundred(int num){
        if (num==0)return;
        oneToHundred(num-1);
        System.out.println(num);
    }
}
