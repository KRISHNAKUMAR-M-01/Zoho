package Task;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row=0,col=0;
        System.out.print("Enter the no. of Rows: ");
        row=scanner.nextInt();
        System.out.print("Enter the no. of columns: ");
        col=scanner.nextInt();
        char[][] arr=new char[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]='*';
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int c=0,r=0;
        System.out.println("Position to insert @");
        System.out.print("Enter the no. of Rows: ");
        r=scanner.nextInt();
        System.out.print("Enter the no. of columns: ");
        c=scanner.nextInt();
        arr[r-1][c-1]='@';

        int a=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(a<(row-r)) {
                    int rightCol = Math.min(c + a, col - 1);
                    arr[r + a][rightCol] = '@';
                    a++;
                }
            }
        }
        int x=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(x<=(row-r)) {
                    int leftCol = Math.max(c - x - 1, 0);
                    arr[r +x -1][leftCol] = '@';
                    x++;
                }
            }
        }
        int end = (r - 1) + Math.max(col - c, c - 1);
        if (end < row) {
                for (int j = 0; j < col; j++) {
                    arr[end][j] = '@';
                }
        }



        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}



