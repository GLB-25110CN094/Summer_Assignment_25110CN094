//Write a program to Write function for 
//Fibonacci.

import java.util.*;

public class day12Q3 {
    public static int fibonacci(int a){
         if(a==0||a==1){
            return a;
         }
         else{
            return fibonacci(a-1)+fibonacci(a-2);
         }
             }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("enter a number : ");
       int num=sc.nextInt();
       for(int i=0;i<num;i++){
       System.out.print(fibonacci(i)+" ");
      }
    }   
    
}
