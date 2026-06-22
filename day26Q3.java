//Write a program to Create ATM simulation
                              //ATM Simulation
import java.util.*;
public class day26Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pin=1234;
        int balance=300000;
        int choice=-1;
        System.out.println("enter the pin :");
        int inputPin=sc.nextInt();
        //check pin correct or not
        if(pin==inputPin){
            System.out.println("welcome you have Enter correct pin");
            while(choice!=4){
                System.out.println("--------ATM MENU---------");
                System.out.println("1. CHEKH YOUR BANK BALANCE");
                System.out.println("2. DEPOSIT MONEY");
                System.out.println("3. WITHDRAW MONEY");
                System.out.println("EXITE");
                System.out.print("ENTER YOUR CHOICE :");
                choice=sc.nextInt();
                //choose a choice 
            switch (choice) {
                case 1:
                    System.out.println("bank balance :"+balance);
                    break;
                case 2:
                    System.out.print("Enter money to Deposit : ");
                    int add=sc.nextInt();
                    balance+=add;
                    System.out.println("new balance :"+balance);
                    break;
                case 3:
                    System.out.print("Enter money to withdraw : ");
                    int withdraw=sc.nextInt();
                    //check bank balance before withdrawing money
                    if(balance<withdraw){
                        System.out.println("not sufficiant balance");
                    }else{
                        balance-=withdraw;
                        System.out.println("new balance :"+balance);
                    }
                    break;
                    //if user choose number 4
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                    //other then 1,2,3,4 number choosen by user
                default:
                    System.out.println("Invalid choice. Try again.");
                }
            }
        }else{
            System.out.println("Enter correct PIN");
        }
    }
}
