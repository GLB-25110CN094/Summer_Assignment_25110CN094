//Q3----transpose of a matrix

import java.util.Scanner;

public class day19Q3 {
     public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and colom of matrix 1 and 2: ");
        int m= sc.nextInt();
        int n=sc.nextInt();
       
        //initialise matrix 1 and 2
        int[][] mat=new int[m][n];
        //input matrix
        System.out.println("Enter matrix :");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        //printing matrix
        System.out.println("matrix :");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               System.out.print(mat[i][j]+" ");
             } 
             System.out.println();   
        }
        System.out.println("transpose matrix");
        //transpose of matrix 
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(mat[j][i]+" ");
             } 
             System.out.println();   
        }
    }
}