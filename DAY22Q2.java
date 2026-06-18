//Q2----Write a program to Count words in a 
//sentence.

import java.util.Scanner;

public class DAY22Q2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String word = "";
        
        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch != ' ') {
                word += ch;  // build the word
            } else {
                System.out.println(word); // print word when space found
                word = ""; // reset for next word
            }
        }
        
        // Print last word (since no space after it)
        if (!word.isEmpty()) {
            System.out.println(word);
        }
    }
}


    

