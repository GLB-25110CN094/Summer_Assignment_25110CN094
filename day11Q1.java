//Write a program to Write function to find sum 
//of two numbers
import java.util.*;

public class day11Q1 {
    //function add two number
    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enter first number
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        //enter second number
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        System.out.println("Sum of two number is :"+add(num1,num2));    
    }
}
