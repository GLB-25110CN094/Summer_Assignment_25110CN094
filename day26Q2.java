//Q2-------Write a program to Create voting eligibility 
//system.

                          //voting eligibility
import java.util.*;

public class day26Q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
         System.out.print("Enter your Age :");
         int age=sc.nextInt();
         //checking if age greater then 18 our not
         if(age<0){
            System.out.println("Enter valid age");
         }
         else if(age>=18){
            System.out.println("your is greater or equal to 18 so you are able to give vote");
         }
         else{
            System.out.println("Age is less then 18 so you are not able to give vote");
         }
    }
}
