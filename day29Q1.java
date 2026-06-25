//Q1-----Write a program to Create menu-driven 
//calculator.
                                                      //menu driven calculator
import java.util.Scanner;

public class day29Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
             //FOR CHOICE BETWEEN 1 TO 4
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Result = " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result = " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result = " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result = " + (num1 / num2));
                        } else {
                            System.out.println(" Division by zero not allowed!");
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Exiting... Thank you!");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}

