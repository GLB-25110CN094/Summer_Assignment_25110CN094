//Q3====finding largest word in sentence

import java.util.Scanner;

public class day24Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String longestWord = "";
        String currentWord = "";
        int maxLength = 0;
        int currentLength = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                currentWord += ch;   // build current word
                currentLength++;
            } else {
                // word finished, check length
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    longestWord = currentWord;
                }
                // reset for next word
                currentWord = "";
                currentLength = 0;
            }
        }

        // check last word (no space at end)
        if (currentLength > maxLength) {
            maxLength = currentLength;
            longestWord = currentWord;
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + maxLength);

        sc.close();
    }
}

