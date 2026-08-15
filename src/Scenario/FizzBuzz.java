package Scenario;

import java.math.BigInteger;

public class FizzBuzz {
    public static void main(String[] args) {
        int n=(int)('b')-(int)('a');
        for (int i=n;i<=(int)('d');i++){
            if(((i/3)*3==i) &&((i/5)*5==i)){
                System.out.println("FizzBuzz");
            }else if(((i/3)*3==i)){
                System.out.println("Fizz");
            } else if(((i/5)*5==i)){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

    }
}
