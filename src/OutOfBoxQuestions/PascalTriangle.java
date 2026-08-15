package OutOfBoxQuestions;

public class PascalTriangle {
    public static void main(String[] args) {
        int n=5;
        int[][] triangle=new int[5][];
        for (int i=0;i<n;i++){
            triangle[i]=new int[i+1];

            triangle[i][0]=1;
            triangle[i][i]=1;

            for (int j=1;j<i;j++){
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
