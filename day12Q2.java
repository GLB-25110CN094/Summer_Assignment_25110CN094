//Write a program to Write function for 
//Armstrong. 

import java.util.*;


public class day12Q2 {
    public static boolean check_armstrong(int a){
        int originalnum=a;
        int newnum=0;
        while(a>0){
            int r=a%10;
            newnum+=r*r*r;
            a=a/10;
        }
        return originalnum == newnum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a three digit number :");
        int num=sc.nextInt();
        if(check_armstrong(num)){
        System.out.println("number is armstrong number");
    }
       else{
        System.out.println("not a armstrong number");
       }   
    }
}
