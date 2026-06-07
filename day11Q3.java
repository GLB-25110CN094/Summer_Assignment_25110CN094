// Q4----- java program to make function that  check that a number is prime or not

import java.util.*;


public class day11Q3 {
    public static int isprime(int a){
        if(a<0){
            return 0;
        }
        else{
            for(int i=2;i<=a/2;i++){
                if ( a%i==0) {
                    return 0;
                }
                else{
                    return 1;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(isprime(num)==0){
        System.out.println("it is not a Prime number");
     }
    else{
        System.out.println("it is a prime number");
     }
    }
}
