//Write a program to Find maximum frequency 
//element.

import java.util.Scanner;

public class day16Q2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 
        int maxfrequency=0;
        int maxelement=arr[0];
        
        for(int i=0;i<n;i++){
           int count=0;
           for(int j=0;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
            }
           }
           if(count>maxfrequency){
            maxfrequency=count;
            maxelement=arr[i];
           }

        }
        System.out.println("maximum frequent element is : "+maxelement+" and frequency is : "+maxfrequency);
    }
}
