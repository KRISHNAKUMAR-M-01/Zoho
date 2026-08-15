package InterviewPractice;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr={12, 35, 1, 10, 34, 1};
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int[] arr){
        if(arr.length==0||arr.length==1){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>max){
                secondMax=max;
                max=num;
            } else if (secondMax<num && num!=max) {
                secondMax=num;
            }
        }
        if(secondMax==Integer.MIN_VALUE){
           return max;
        }

        return secondMax;

    }
}
