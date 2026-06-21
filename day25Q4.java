//Q4------sort string word by length
import java.util.*;
public class day25Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // Split into words (basic split by space)
        String[] words = sentence.split(" ");

        // Bubble sort by length (manual logic)
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    // swap
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        // Display sorted words
        System.out.println("Words sorted by length:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}


