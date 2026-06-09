//Write a program to Find largest and smallest 
//element. 

import java.util.Scanner;

public class day13Q3 {
    public static void main(String[] args) {
        int largest = 0;
        int smallest=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of element of array :");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=1;j<n;j++){
            if(arr[largest]<arr[j]){
                largest=j;
            }
        }
        System.out.println( "largest element of array is : "+arr[largest]);
        for(int k=1;k<n;k++){
            if(arr[smallest]>arr[k]){
                smallest=k;
            }
        }
        System.out.println( "Smallest element of array is : "+arr[smallest]); 
    }
}
