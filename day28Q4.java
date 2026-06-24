//Q4----Write a program to Create contact 
//management system
                                        //contact management system
import java.util.Scanner;
import java.util.ArrayList;

class Contact {
    int id;
    String name;
    String phone;
    String email;

    Contact(int id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name +
                           ", Phone: " + phone + ", Email: " + email);
    }
}

public class day28Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        // Predefined contacts
        contacts.add(new Contact(1, "Rahul", "9876543210", "rahul@gmail.com"));
        contacts.add(new Contact(2, "Priya", "9123456780", "priya@yahoo.com"));

        int choice;
        do {
            System.out.println("\n--- Contact Menu ---");
            System.out.println("1. Display All Contacts");
            System.out.println("2. Add New Contact");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Delete Contact by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    //display all contact by loop
                    System.out.println("\n--- Contact List ---");
                    for (int i = 0; i < contacts.size(); i++) {
                        contacts.get(i).display();
                    }
                    break;

                case 2:
                    //enter contact
                    System.out.print("Enter Contact ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    //new object
                    contacts.add(new Contact(id, name, phone, email));
                    System.out.println("New contact added successfully!");
                    break;

                case 3:
                    //search for contact 
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < contacts.size(); i++) {
                        if (contacts.get(i).name.equalsIgnoreCase(searchName)) {
                            contacts.get(i).display();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Contact not found!");
                    }
                    break;

                case 4:
                    //delete contact
                    System.out.print("Enter Contact ID to delete: ");
                    int delId = sc.nextInt();
                    boolean deleted = false;
                      //process to delete
                    for (int i = 0; i < contacts.size(); i++) {
                        if (contacts.get(i).id == delId) {
                            contacts.remove(i);
                            System.out.println("Contact deleted successfully!");
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Contact not found!");
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
