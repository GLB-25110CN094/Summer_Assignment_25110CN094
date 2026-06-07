/* Q4------java program to Write function to find 
factorial. */

import java.util.*;

public class day11Q4 {
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
             fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int num=sc.nextInt();
        System.out.println("factorial of number "+num+" is: "+factorial(num));
    }
    
}
