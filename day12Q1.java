//Write a program to Write function for 
//palindrome. 

import java.util.*;

public class day12Q1 {
    public static boolean checkpalidrome(int a){
        int reverse=0;
        int originalnum=a;
        while(a>0){
            int digit=a%10;
            reverse=reverse*10+digit;
            a=a/10;
        }
        return reverse==originalnum;
    }
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.print("enter a number : ");
      int num=sc.nextInt();
      if(checkpalidrome(num))
      System.out.println("number is palindrome"); 
      else System.out.println("not palindrome number");   
    }

}
