//Q2-----Write a program to Check symmetric matrix

import java.util.Scanner;

public class day20Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and colom of matrix : ");
        int m= sc.nextInt();
        int n=sc.nextInt();
        if(n!=m){
            System.out.println("it is not a square ,hence not symmetric ");
        }
       
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
        }//checking transpose of a matrix equal to original matrix
        boolean isSymmetric=true;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(mat[i][j]!=mat[j][i]){
                    isSymmetric=false;
               }
            }
        }
        if(isSymmetric==true){
            System.out.println("it is a symmetric matrix ");
        }
        else{
            System.out.println("not a symmetric matrix");
        }
    }
}
