//Write a program to Find sum and average of 
//array. 

import java.util.Scanner;

public class day13Q2 {
    public static void main(String[] args) {
        int sum=0;
        float avg;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of element of array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
         System.out.println("Enter "+n+" element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("sum of element of array are : ");
        for(int j=0;j<n;j++){
            sum+=arr[j];
        }
        System.out.println(sum);
         avg=sum/n;
        System.out.println("average of  element : "+avg);    
    }
    
}
