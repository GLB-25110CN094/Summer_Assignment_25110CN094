
//Q2--- PROGRAME FOR LIBRARY MANAGEMENT SYSTEM

                                                     //LIBRARY MANAGEMENT
import java.util.Scanner;
import java.util.ArrayList;

class Library {
    //CLAAS BOOK THAT STORE DATA OF BOOKS
    int id;
    String title;
    String author;
    boolean isIssued;
    //CONSTRUCTOR FOR AUTOMATIC CALLING DURING OBJECT FORMATION
    Library(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false; // by default book is available
    }
     //DISPLAY RECORD OF BOOKS
    void display() {
        System.out.println("ID: " + id + ", Title: " + title +
                           ", Author: " + author +
                           ", Status: " + (isIssued ? "Issued" : "Available"));
    }
}

public class day30Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Library> books = new ArrayList<>();

        // Predefined books
        books.add(new Library(101, "Java Basics", "James Gosling"));
        books.add(new Library(102, "Data Structures", "Robert Lafore"));
        books.add(new Library(103, "Operating Systems", "Galvin"));

        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Display All Books");
            System.out.println("2. Add New Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    //PRINT BOOK DETAILS
                    System.out.println("\n--- Book List ---");
                    for (int i = 0; i < books.size(); i++) {
                        books.get(i).display();
                    }
                    break;

                case 2:
                    //NEW BOOK ADDITION
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    books.add(new Library(id, title, author));
                    System.out.println("New book added successfully!");
                    break;

                case 3:
                    //ISSUE BOOK
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    boolean foundIssue = false;
                    for (Library b : books) {
                        if (b.id == issueId && !b.isIssued) {
                            b.isIssued = true;
                            System.out.println("Book issued successfully!");
                            foundIssue = true;
                            break;
                        }
                    }
                    if (!foundIssue) {
                        System.out.println("Book not found or already issued!");
                    }
                    break;

                case 4:
                    //RETURN BOOK
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    boolean foundReturn = false;
                    for (Library b : books) {
                        if (b.id == returnId && b.isIssued) {
                            b.isIssued = false;
                            System.out.println("Book returned successfully!");
                            foundReturn = true;
                            break;
                        }
                    }
                    if (!foundReturn) {
                        System.out.println("Book not found or not issued!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}

