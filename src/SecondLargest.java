public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={4,5,3,1,2};
        int[] arr1={};
        int[] arr2={-1,-2,10,10};
        //passing values through methods
        System.out.println(FindSecondLargest(arr2));
    }
    private static int FindSecondLargest(int[] arr){
        //returns -1 if the length of arr is 1 or 0, because we cant find the second largest element
        if(arr.length==0||arr.length==1){
            return -1;
        }
        //Smallest possible value an int can store
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        //enhanced for loop that iterate through each element of an array
        for(int num:arr) {
            //compare element one by one it num is greater that max the max is allocated to the secondmax
            //and the num is allocated to the max
            if (num > max) {
                secondMax = max;
                max =num;
            }
            //if num is not equal to max and num is greater than secondmax allocate num to secondmax
            else if (secondMax < num && num!=max) {
                secondMax = num;
            }
        }
        //if secondmax is == to minvalue return max, it is used when all element in the array is equal
        if(secondMax==Integer.MIN_VALUE){
            return max;
        }
        //once every condition is checked return secondmax
        return secondMax;
    }
}
