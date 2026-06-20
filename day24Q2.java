//Q2====Write a program to Compress a string


import java.util.Scanner;

public class day24Q2 {
    public static String compress(String str) {
        StringBuilder result = new StringBuilder();
        int n = str.length();
         //LOOP FOR  EXCESSING ALL THE ELEMENT OF ARRAY
        for (int i = 0; i < n; i++) {
            char current = str.charAt(i);
            int count = 1;

            // Count consecutive same characters
            while (i + 1 < n && str.charAt(i + 1) == current) {
                count++;
                i++;
            }
              //CURRENT ME COUNT KO ADD KAR DO
            result.append(current).append(count);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        //OUTPUT
        String compressed = compress(input);
        System.out.println("Compressed string: " + compressed);

        sc.close();
    }
}

