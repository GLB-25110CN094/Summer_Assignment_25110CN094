//Q3-----Write a program to Rotate array right.

import java.util.Scanner;

public class day15Q3 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number of right rotations: ");
        int d = sc.nextInt();
        d = d % n; // handle cases where d > n
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i+d)%n]=arr[i];
        }

        // Display rotated array
        System.out.println("Array after right  rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }
}
