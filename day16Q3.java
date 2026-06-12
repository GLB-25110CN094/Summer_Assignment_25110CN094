//Q3---- java program to find pair with given sum

import java.util.*;
public class day16Q3 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 
        System.out.print("Enter targeted  sum : ");
        int target=sc.nextInt();
        int find=0;
        for(int i=0;i<n;i++){
           int count=0;
           for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
                System.out.println("pair found : ("+arr[i]+","+arr[j]+")");
                find=1;
                }
            }
        }
       if(find==0){
        System.out.println("no such two element present whose sum is equal to target ");
       }
    }
}

