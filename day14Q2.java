//Q2----Write a program to Frequency of an element.

import java.util.Scanner;

public class day14Q2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of element of array : ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the element to search in arr :");
        int num=sc.nextInt();
        int count=0;
        for(int j=0;j<n;j++){
            if(num==arr[j]){
                count++;
            }
        }
        if(count==0)
        System.out.println("Element not found in array! ");
        else{
            System.out.println("number of times element occur in array is : "+count);
        }
    }
}
