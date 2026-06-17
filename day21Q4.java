//Write a program to Convert lowercase to 
//upper case;

import java.util.*;

public class day21Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If character is lowercase (a-z), convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); // ASCII difference between lowercase and uppercase
            }

            result.append(ch);
        }

        System.out.println("Uppercase String: " + result.toString());
    }
}

