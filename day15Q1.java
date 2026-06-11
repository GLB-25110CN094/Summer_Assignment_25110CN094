//Q1----Write a program to Reverse array.


import java.util.Scanner;

public class day15Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of element of array : ");
        int n=sc.nextInt();
        int[] arr = new int[n];
         System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("reversed array : ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
