// Q1--- java program to recursive factorial

import java.util.*;

public class day7Q1 {
       public static int factorial(int n){
        if (n<=1)return 1;
        return n*factorial(n-1);
       }
       public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        System.out.println( "factorial of " +  num  + " is :" +factorial(num));

       }
}
