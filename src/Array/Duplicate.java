package Array;

public class Duplicate {
    public static void main(String[] args){
        int[] studentIDs={91,100,74,2,2,34,34};
        System.out.println("Duplicate student ID: "+duplicate(studentIDs));
    }
    public static int duplicate(int[] arr){
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        boolean[] seen=new boolean[max+1];
         for(int num:arr){
             if(seen[num]){
                 return num;
             }
             seen[num]=true;
         }
         return -1;
    }
}
