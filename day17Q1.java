//day17Q1---------program to merge two array


import java.util.Scanner;

public class day17Q1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array 1: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.print("Enter size of array 2: ");
        int m = sc.nextInt();

        int[] arr2 = new int[m];
        System.out.println("Enter " + n + " elements  first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        } 
        System.out.println("Enter " + m + " elements  second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        } 
        // adding element of first array
        int[] arr3= new int[n+m];
         for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i];
        } 
        // adding element of second  array
         for (int i = 0; i < m; i++) {
            arr3[n + i] = arr2[i];
        } 
        System.err.println("merged array : ");
        for(int i=0;i<=n+m;i++){
            System.out.println(arr3[i
            ]);
        }

  }
    
 } 

 
