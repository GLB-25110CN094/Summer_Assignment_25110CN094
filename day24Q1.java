//Q1===Write a program to Check string rotation.

import java.util.Scanner;

public class day24Q1 {
    //CREATING  A FUNCTION WHICH CHECK A TWO STRING ARE ROTATE OF EACH OTHER
    public static boolean isRotation(String s1, String s2) {
        //IF LENGTH OF TWO STRING IS NOT EQUAL TO EACH OTHER
        if (s1.length() != s2.length()) {
            return false;
        }
         //S1 KI LENGTH KO STORE KAR RAHE
        int n = s1.length();
        // Check all possible rotations
        for (int i = 0; i < n; i++) {
            //METHOD JISSE SUBSTRING KO NIKAL RAHE 
            String rotated = s1.substring(i) + s1.substring(0, i);
            //CONDITION CHECK
            if (rotated.equals(s2)) {
                return true;
            }
        }
        //STRING ARE NOT ROTAATE OF EACH OTHER RETURN FALSE
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isRotation(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is NOT a rotation of " + str1);
        }

        sc.close();
    }
}
