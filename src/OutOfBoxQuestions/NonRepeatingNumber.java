package OutOfBoxQuestions;

public class NonRepeatingNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,3,2,9,9};
        System.out.println(findUnique(arr));
    }
    public static int findUnique(int[] arr){
        int result=0;
        for(int num:arr){
            result=result^num;
        }
        return result;
    }
}
