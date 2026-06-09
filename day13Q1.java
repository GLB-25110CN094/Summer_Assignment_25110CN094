
//Write a program to Input and display array. 

import java.util.*;

public class day13Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of element in array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array element are: ");
        for(int j=0;j<n;j++){
            System.out.println("element at index : "+j+" is: "+arr[j]);
        }
    }
}
