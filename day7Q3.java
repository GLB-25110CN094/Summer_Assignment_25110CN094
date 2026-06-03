// Q3--- java program to recursive  sum of digit

import java.util.*;

public class day7Q3 {
    public static int sumdigit(int n){
            if(n==0)return 0;

            return (n%10)+sumdigit(n/10);

    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int num=sc.nextInt();
        System.out.println("Sum of digit of a number is: "+sumdigit(num));
     }
}
