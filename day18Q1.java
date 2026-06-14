// Q1------day 18 selection sort


import java.util.Scanner;

public class day18Q1 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         //enter array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
         int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp;
        //bubble sort loop
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                }
            }     
        }
        System.out.println("sorted array : ");
        for(int i=0;i<n;i++){
        System.out.println(arr[i]);
        }
    }
}
