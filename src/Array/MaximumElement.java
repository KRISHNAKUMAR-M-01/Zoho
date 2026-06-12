package Array;

public class MaximumElement {
    public static void main(String[] args){
        int temperatures[]={32,45,28,67,55,41,60,99};
        System.out.println("Highest temperature: "+maximumNumber(temperatures));
    }
    public static int maximumNumber(int[] temperature){
        int maximum=Integer.MIN_VALUE;
        int n=temperature.length;
        for(int i=0;i<n;i++){
            if(temperature[i]>maximum){
                maximum=temperature[i];
            }
        }
        return maximum;
    }
}
