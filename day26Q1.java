//Q1----Write a program to Create number guessing game
                         //NUMBER GUESSING GAME
import java.util.*;
public class day26Q1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("--------------------------------WELCOME IT's A NUMBER GUESSING GAME--------------------------------------");
        int computer_Number=71;
        int num=-1;
        int count=0;
        
        System.out.print("Enter a number : ");
        while(computer_Number!=num){
            num=sc.nextInt();
            if(computer_Number<num){
                System.out.println("enter smaller number");
            }
            else if(computer_Number>num){
                System.out.println("enter bigger number ");
            }
            count++;
        }
        System.out.println("YOU HAVE ENTER CORRECT NUMBER \nAND TAKEN "+count+" ATTEMPTS TO GUESS THE NUMBER ");
        System.out.println("CONGRATULATIONS YOU WON 🎉🎉🎉🎊🎉🎉🎉");
    }
}
