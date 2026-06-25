//Write a program to Create menu-driven 
//string operations system
                                                  

import java.util.Scanner;

public class day29Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice = 0;
        // Menu loop: keeps running until user chooses Exit (6)
        while (choice != 6) {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Display String");
            System.out.println("2. Find Length");
            System.out.println("3. Reverse String");
            System.out.println("4. Count Vowels and Consonants");
            System.out.println("5. Convert to Uppercase/Lowercase");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // Display
                    System.out.println("String is: " + str);
                    break;

                case 2: // Length
                    System.out.println("Length of string = " + str.length());
                    break;

                case 3: // Reverse
                    System.out.print("Reversed string = ");
                    // Loop runs backward from last character to first
                    for (int i = str.length() - 1; i >= 0; i--) {
                        System.out.print(str.charAt(i));
                    }
                    System.out.println();
                    break;

                case 4: // Count vowels and consonants
                    int vowels = 0, consonants = 0;
                    // Loop checks each character one by one
                    for (int i = 0; i < str.length(); i++) {
                        char ch = Character.toLowerCase(str.charAt(i));
                        if (ch >= 'a' && ch <= 'z') {
                            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                                vowels++;
                            } else {
                                consonants++;
                            }
                        }
                    }
                    System.out.println("Vowels = " + vowels + ", Consonants = " + consonants);
                    break;

                case 5: // Uppercase/Lowercase
                    System.out.println("Uppercase: " + str.toUpperCase());
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;

                case 6: // Exit
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}

