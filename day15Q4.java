//Write a program to Move zeroes to end. 

import java.util.Scanner;

public class day15Q4 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                 int temp=arr[i];
                 arr[i]=arr[count];
                 arr[count]=temp;
                 count++;
            }
        }
    System.out.println("new array :");
       for(int i=0;i<n;i++){
           System.out.print(arr[i] + " ");
        }
    }
}
