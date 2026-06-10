// Q1----Write a program to Linear search.

import java.util.Scanner;

public class day14Q1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element of array : ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the element to search in arr :");
        int num=sc.nextInt();
        int index=-1;
        for(int j=0;j<n;j++){
            if(num==arr[j]){
                 index=j;
                 break;
            }
        }
        if(index==-1){
            System.out.print("Element not found in array");
        }
        else{
            System.err.println("Element found in array at index : "+index);
        }
    }
}
