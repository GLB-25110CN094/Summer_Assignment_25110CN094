///Q2----Write a program to Find common characters 
///in strings
import java.util.Scanner;

public class day25Q2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.println("Common characters:");
        // Loop through first string
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            // Check if character exists in second string
            for (int j = 0; j < s2.length(); j++) {
                if (c == s2.charAt(j)) {
                    System.out.print(c + " ");
                    break; // avoid printing duplicates for same character
                }
            }
        }
    }
}
