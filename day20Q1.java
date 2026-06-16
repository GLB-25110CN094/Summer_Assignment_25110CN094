//Q1---MULTIPLICATION OF A MATRIX OF ORDER M,N

import java.util.*;


public class day20Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and colom of matrix 1: ");
        int m= sc.nextInt();
        int n=sc.nextInt();
        System.out.println("enter number of colom of matrix 2: ");
        int p=sc.nextInt();
        //initialise matrix 1 and 2
        int[][] mat1=new int[m][n];
        int[][] mat2=new int[n][p];
        //input matrix one
        System.out.println("Enter matrix 1:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter matrix 2 :");
        //input matrix second
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        //new matrix
        int[][] mulMat= new int[m][p];
        for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                mulMat[i][j]=0;
            }
        }

        //matrix multiplication
          for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                for(int k=0;k<n;k++){
                  mulMat[i][j]+=mat1[i][k]*mat2[k][j] ;
                }
            }
        }
        //print matrix
        System.out.println("multiplied matrix: ");
         for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
             System.out.print(mulMat[i][j]+" ");
        
            }
            System.out.println();
        }
    }
}
