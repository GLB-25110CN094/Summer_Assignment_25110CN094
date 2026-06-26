//Q4----Write a program to Develop complete mini 
//project using arrays, strings and functions.
                                                  //Cricket player states

import java.util.Scanner;

class Player {
    int id;
    String name;
    int runs;
    int balls;
    int wickets;

    // Constructor
    Player(int id, String name, int runs, int balls, int wickets) {
        this.id = id;
        this.name = name;
        this.runs = runs;
        this.balls = balls;
        this.wickets = wickets;
    }

    // Display function
    void display() {
        System.out.println("ID: " + id + ", Name: " + name +
                           ", Runs: " + runs + ", Balls: " + balls +
                           ", Wickets: " + wickets);
    }
}

public class day30Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player[] team = new Player[11]; // max 11 players
        int count = 0;

        //  Preloaded records
        team[count++] = new Player(1, "Virat", 85, 60, 0);
        team[count++] = new Player(2, "Rohit", 72, 55, 0);
        team[count++] = new Player(3, "Bhuvi", 15, 10, 2);

        int choice;
        do {
            System.out.println("\n--- Cricket Score Card ---");
            System.out.println("1. Add Player");
            System.out.println("2. Display All Players");
            System.out.println("3. Search Player by ID");
            System.out.println("4. Update Runs");
            System.out.println("5. Delete Player");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    //add new record
                    System.out.print("Enter Player ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Runs: ");
                    int runs = sc.nextInt();
                    System.out.print("Enter Balls: ");
                    int balls = sc.nextInt();
                    System.out.print("Enter Wickets: ");
                    int wickets = sc.nextInt();
                    //increase count
                    team[count++] = new Player(id, name, runs, balls, wickets);
                    System.out.println("✅ Player added!");
                    break;

                case 2:
                    //display record 
                    if (count == 0) {
                        System.out.println("No players yet.");
                    } else {
                        System.out.println("\n--- Team Score Card ---");
                        for (int i = 0; i < count; i++) {
                            team[i].display();
                        }
                    }
                    break;

                case 3:
                    //search new record
                    System.out.print("Enter Player ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (team[i].id == searchId) {
                            team[i].display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Player not found.");
                    break;

                case 4:
                    //update run 
                    System.out.print("Enter Player ID to update runs: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter new runs: ");
                    int newRuns = sc.nextInt();
                    boolean updated = false;
                    for (int i = 0; i < count; i++) {
                        if (team[i].id == updateId) {
                            team[i].runs = newRuns;
                            System.out.println("Runs updated!");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) System.out.println("Player not found.");
                    break;

                case 5:
                    //delete record
                    System.out.print("Enter Player ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean deleted = false;
                    for (int i = 0; i < count; i++) {
                        if (team[i].id == deleteId) {
                            for (int j = i; j < count - 1; j++) {
                                team[j] = team[j + 1];
                            }
                            team[count - 1] = null;
                            count--;
                            System.out.println("Player deleted!");
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) System.out.println("Player not found.");
                    break;

                case 6:
                    //exite
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();
    }
}
