//Write a program to Create menu-driven array 
//operations system


import java.util.Scanner;

public class day29Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input loop: runs n times
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   // each time loop runs, one element is stored
        }

        int choice = 0;
        // Menu loop: keeps running until user chooses Exit (6)
        while (choice != 6) {
            System.out.println("\n--- Array Menu ---");
            System.out.println("1. Display Array");
            System.out.println("2. Search Element");
            System.out.println("3. Insert Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Reverse Array");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Display
                    // Loop goes from 0 to n-1 and prints each element
                    System.out.println("Array Elements:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2: // Search
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;
                    // Loop checks each element one by one
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at position " + (i + 1));
                            found = true;
                            break; // stop loop once found
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found!");
                    }
                    break;

                case 3: // Insert
                    System.out.print("Enter position (1 to " + (n + 1) + "): ");
                    int pos = sc.nextInt();
                    System.out.print("Enter element to insert: ");
                    int elem = sc.nextInt();

                    if (pos < 1 || pos > n + 1) {
                        System.out.println("Invalid position!");
                    } else {
                        int[] newArr = new int[n + 1];
                        // First loop copies old elements before position
                        for (int i = 0; i < pos - 1; i++) {
                            newArr[i] = arr[i];
                        }
                        // Insert element at given position
                        newArr[pos - 1] = elem;
                        // Second loop copies remaining elements
                        for (int i = pos; i <= n; i++) {
                            newArr[i] = arr[i - 1];
                        }
                        //STORING Value new array in original arr
                        arr = newArr;
                        n++;
                        System.out.println("Element inserted successfully!");
                    }
                    break;

                case 4: // Delete
                    System.out.print("Enter position (1 to " + n + "): ");
                    int delPos = sc.nextInt();

                    if (delPos < 1 || delPos > n) {
                        System.out.println("Invalid position!");
                    } else {
                        int[] newArr = new int[n - 1];
                        // First loop copies elements before delete position
                        for (int i = 0; i < delPos - 1; i++) {
                            newArr[i] = arr[i];
                        }
                        // Second loop shifts elements after delete position
                        for (int i = delPos; i < n; i++) {
                            newArr[i - 1] = arr[i];
                        }
                        arr = newArr;
                        n--;
                        System.out.println("Element deleted successfully!");
                    }
                    break;

                case 5: // Reverse
                    System.out.println("Reversed Array:");
                    // Loop runs backwards from n-1 to 0
                    for (int i = n - 1; i >= 0; i--) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
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

