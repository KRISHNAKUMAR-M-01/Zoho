package OutOfBoxQuestions;

public class CountOnes {
    public static void main(String[] args) {
        System.out.println("Ones in "+9+" : "+countOnes(9));
        System.out.println("Ones in "+7+" : "+countOnes(7));
        System.out.println("Ones in "+255+" : "+countOnes(255));
    }
    public static int countOnes(int num){
        if(num==0)return 0;
        return (num & 1)+countOnes(num>>1);
    }
}
