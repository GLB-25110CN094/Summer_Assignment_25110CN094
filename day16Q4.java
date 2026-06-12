//Write a program to Remove duplicates from 
//array. 

import java.util.Scanner;

public class day16Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 
        int[] temp = new int[n];
        int newSize = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[newSize] = arr[i];
                newSize++;
            }
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
