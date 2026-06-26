//Q1-----Write a program to Create student record 
//system using arrays and strings. 


import java.util.Scanner;

class day30Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Maximum 50 students
        int maxStudents = 50;
        int[] ids = new int[maxStudents];
        String[] names = new String[maxStudents];
        String[] courses = new String[maxStudents];
        double[] marks = new double[maxStudents];

        int count = 0; // number of students stored

        int choice;
        do {
            System.out.println("\n--- Student Record System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (count < maxStudents) {
                        //enter details of student
                        System.out.print("Enter Student ID: ");
                        ids[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        names[count] = sc.nextLine();

                        System.out.print("Enter Course: ");
                        courses[count] = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        marks[count] = sc.nextDouble();

                        count++;
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Storage full! Cannot add more students.");
                    }
                    break;

                case 2:
                    //if no record present 
                    if (count == 0) {
                        System.out.println("No student records available.");
                    } else {
                        //record of student
                        System.out.println("\n--- All Student Records ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("ID: " + ids[i] +", Name: " + names[i] + ", Course: " + courses[i] +
                                               ", Marks: " + marks[i]);
                        }
                    }
                    break;

                case 3:
                    //if user want to search specific record
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (ids[i] == searchId) {
                            System.out.println("Record Found!");
                            System.out.println("ID: " + ids[i] +
                                               ", Name: " + names[i] +
                                               ", Course: " + courses[i] +
                                               ", Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with ID " + searchId + " not found.");
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
