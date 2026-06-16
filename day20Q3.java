//Q3--------Write a program to Find row-wise sum

import java.util.Scanner;

public class day20Q3 {

         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and colom of matrix : ");
        int m= sc.nextInt();
        int n=sc.nextInt();
       
        //initialise matrix 
        int[][] mat=new int[m][n];
        //input matrix
        System.out.println("Enter matrix :");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
         System.out.println("matrix :");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               System.out.print(mat[i][j]+" ");
            } 
             System.out.println();
        }//sum 
        System.out.println("Row-wise sums:");
        for (int i = 0; i <m; i++) {
            int sum = 0;
            for (int j = 0; j <n; j++) {
                sum += mat[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }

    }
}
