import java.util.Scanner;

public class day23Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        char maxChar = ' ';
        int maxCount = 0;

        // Outer loop: har character check karo
        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            // Inner loop: us character ki frequency count karo
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            // Agar frequency zyada hai toh update karo
            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Frequency: " + maxCount);

        sc.close();
    }
}


