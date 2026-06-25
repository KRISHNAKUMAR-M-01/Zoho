package Array;

import java.util.ArrayList;

public class Filter  {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,7,5,4,3,2,7,9};
        System.out.println("Even Numbers:"+evenNumbers(arr));
        System.out.println("Odd Numbers:"+oddNumbers(arr));
        System.out.println("Prime Number:"+primeNumbers(arr));
    }
    public static ArrayList<Integer> evenNumbers(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int num :arr){
            if(num % 2==0){
                list.add(num);
            }
        }
        return list;
    }
    public static ArrayList<Integer> oddNumbers(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int num :arr){
            if(num % 2!=0){
                list.add(num);
            }
        }
        return list;
    }
    public static ArrayList<Integer> primeNumbers(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int num :arr){
            if(isBoolean(num)){
                list.add(num);
            }
        }
        return list;
    }
    public static Boolean isBoolean(int num){
        if(num<=1){
            return false;
        }
        if(num==2){
            return true;
        }
        if(num % 2==0){
            return false;
        }
        for(int i=3;i<=Math.sqrt(num);i+=2){
            if(num % i==0){
                return false;
            }
        }
        return true;
    }

}
