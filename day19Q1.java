//Q1--- ADDITION OF TWO MATRIX

import java.util.Scanner;

public class day19Q1 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and colom of matrix 1 and 2: ");
        int m= sc.nextInt();
        int n=sc.nextInt();
       
        //initialise matrix 1 and 2
        int[][] mat1=new int[m][n];
        int[][] mat2=new int[m][n];
        //input matrix one
        System.out.println("Enter matrix 1:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter matrix 2 :");
        //input matrix second
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        // addition of two matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               mat1[i][j]+=mat2[i][j];
            }
        } 
        // print mat1 
        System.out.println("sum of two matrix is : ");
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }  
    }
}
