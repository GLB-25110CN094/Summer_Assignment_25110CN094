// Q2--- java program to recursive fibonacci

import java.util.*;

public class day7Q2 {
     public static int fibonacci(int n){
         if(n==0||n==1)return n;
         else{
            return fibonacci(n-1)+fibonacci(n-2);
         }

     }
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        System.out.println(" fibonnaci upto "+num+" term is : ");
        for(int i =0;i< num;i++){
            System.out.println(fibonacci(i)+ " ");
        }
    }
}
