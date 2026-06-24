//Q3---------Write a program to Create ticket booking 
//system.  
                                 //ticket management system

import java.util.Scanner;

class Ticket {
    int ticketId;
    String passengerName;
    boolean isBooked;

    Ticket(int ticketId) {
        this.ticketId = ticketId;
        this.passengerName = "";
        this.isBooked = false;
    }

    void display() {
        System.out.println("Ticket ID: " + ticketId +
                           ", Status: " + (isBooked ? "Booked by " + passengerName : "Available"));
    }
}

public class day28Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Predefined tickets (like seats in a bus/train)
        Ticket[] tickets = new Ticket[5];
        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = new Ticket(i + 1); // Ticket IDs: 1 to 5
        }

        int choice;
        do {
            System.out.println("\n--- Ticket Booking Menu ---");
            System.out.println("1. Display All Tickets");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Ticket List ---");
                    for (int i = 0; i < tickets.length; i++) {
                        tickets[i].display();
                    }
                    break;

                case 2:
                    System.out.print("Enter Ticket ID to book: ");
                    int bookId = sc.nextInt();
                    sc.nextLine(); // consume newline
                    boolean booked = false;

                    for (int i = 0; i < tickets.length; i++) {
                        if (tickets[i].ticketId == bookId && !tickets[i].isBooked) {
                            System.out.print("Enter Passenger Name: ");
                            String name = sc.nextLine();
                            tickets[i].passengerName = name;
                            tickets[i].isBooked = true;
                            System.out.println("Ticket booked successfully for " + name);
                            booked = true;
                            break;
                        }
                    }
                    if (!booked) {
                        System.out.println("Ticket not found or already booked!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Ticket ID to cancel: ");
                    int cancelId = sc.nextInt();
                    boolean cancelled = false;

                    for (int i = 0; i < tickets.length; i++) {
                        if (tickets[i].ticketId == cancelId && tickets[i].isBooked) {
                            System.out.println("Ticket cancelled for " + tickets[i].passengerName);
                            tickets[i].passengerName = "";
                            tickets[i].isBooked = false;
                            cancelled = true;
                            break;
                        }
                    }
                    if (!cancelled) {
                        System.out.println("Ticket not found or not booked!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}

