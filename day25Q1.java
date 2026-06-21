//Q1----write a program that merge two sorted array
import java.util.*;

class day25Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Two Sorted Array ");
         //for foirst array
         System.out.print("Enter size of array 1: ");
         int n=sc.nextInt();
         System.out.print("Enter Array 1: ");
         int[] arr1=new int[n];
          for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
         //for second array
         System.out.print("Enter size of array 2: ");
         int m=sc.nextInt();
         System.out.print("Enter Array 2: ");
         int[] arr2=new int[m];
         for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        //creating new array that store two array
        int[] merge=new int[n+m];
        for(int i=0;i<n;i++){
            merge[i]=arr1[i];
        }
        //loop run from greater then n and run up to n
        for(int i=0;i<m;i++){
            merge[n+i]=arr2[i];
        }
        System.out.println("merged array: ");
         for(int i=0;i<n+m;i++){
        System.err.print(merge[i]+" ");
         }
    }
}