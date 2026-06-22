//Write a program to Create quiz application


import java.util.Scanner;

public class day26Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0; // to keep track of correct answers

        System.out.println("Welcome to the Quiz Application!");
        System.out.println("Answer the following questions:\n");

        // Question 1
        System.out.println("Q1: What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");
        System.out.print("Enter your choice (1-4): ");
        int ans1 = sc.nextInt();
        if (ans1 == 2) {
            System.out.println("✅ Correct!");
            score++;
        } else {
            System.out.println("❌ Wrong! Correct answer is Delhi.");
        }

        // Question 2
        System.out.println("\nQ2: Which language is used for Android app development?");
        System.out.println("1. Python");
        System.out.println("2. Java");
        System.out.println("3. C++");
        System.out.println("4. Swift");
        System.out.print("Enter your choice (1-4): ");
        int ans2 = sc.nextInt();
        if (ans2 == 2) {
            System.out.println("✅ Correct!");
            score++;
        } else {
            System.out.println("❌ Wrong! Correct answer is Java.");
        }

        // Question 3
        System.out.println("\nQ3: Who is known as the Father of the Nation in India?");
        System.out.println("1. Jawaharlal Nehru");
        System.out.println("2. Mahatma Gandhi");
        System.out.println("3. B. R. Ambedkar");
        System.out.println("4. Subhash Chandra Bose");
        System.out.print("Enter your choice (1-4): ");
        int ans3 = sc.nextInt();
        if (ans3 == 2) {
            System.out.println("✅ Correct!");
            score++;
        } else {
            System.out.println("❌ Wrong! Correct answer is Mahatma Gandhi.");
        }

        // Final Score
        System.out.println("\n🎯 Your final score is: " + score + " out of 3");

        sc.close();
    }
}

