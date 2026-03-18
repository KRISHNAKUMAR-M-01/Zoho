public class FindMissing {
    public static void main(String[] args) {
        int[] arr={3,0,1,5,2,6};
        int[] arr1={1,4};
        int[] arr2={1,2};
//        int[] arr1={};
        System.out.println(FindMissing(arr));
        System.out.println(FindMissing(arr1));
        System.out.println(FindMissing(arr2));
    }
    public static int FindMissing(int[] arr){
        if(arr==null||arr.length==0){
            return 0;
        }
        int length=arr.length;
        //formula by carl friedrich gauss
        //sum of all integers from 1 to n=n(n+1)/2
        int total=length*(length+1)/2;
        for(int num:arr){
            total-=num;
        }
        return total;

    }

}
