//Write a program to Write function to find 
//maximum. 


import java.util.*;
public class day11Q2 {
    public static int maximum(int a,int b){
          if(a>b){
            return a;
          }
          else{
            return b;
          }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();
        System.out.print("Enter second number:");
        int num2=sc.nextInt();
        System.out.println("maximum number between two  number is: "+maximum(num1,num2));
    }
    
}
