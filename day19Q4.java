//Q4-----Write a program to Find diagonal sum

import java.util.Scanner;

public class day19Q4 {
     public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        int sum=0;
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
        //sum of diagonal element 
        System.out.print("sum of diagonal element are : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                if(i==j){
                    sum+=mat[i][j];
                }
            }
        }
        System.out.println(sum);    
    }
}
