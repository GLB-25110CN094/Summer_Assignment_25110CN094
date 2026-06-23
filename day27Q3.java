//Q3-------SALARY MANAGMENT SYSTEM OF EMPLOYEE
                                      ///SALARY MANAGMENT SYSTEM OF EMPLOYEE


import java.util.*;

class EmployeeSalary {
    //empluyee class
    int id;
    String name;
    double basicSalary;
    double allowance;
    double deduction;
     //called when function called
    EmployeeSalary(int id, String name, double basicSalary, double allowance, double deduction) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.deduction = deduction;
    }
    //salary calculation
    double calculateSalary() {
        return basicSalary + allowance - deduction;
    }
    //function to display salary
    void display() {
        System.out.println("ID: " + id + ", Name: " + name +", Basic: " + basicSalary +", Allowance: " + allowance +
         ", Deduction: " + deduction +", Net Salary: " + calculateSalary());
    }
}

public class day27Q3{
    public static void main(String[] args) {
        System.out.println("welcome to our salary managment site");
        Scanner sc = new Scanner(System.in);
        ArrayList<EmployeeSalary> employees = new ArrayList<>();

        // Predefined data
        employees.add(new EmployeeSalary(101, "Amit", 30000, 5000, 2000));
        employees.add(new EmployeeSalary(102, "Priya", 25000, 4000, 1500));
        int choice=0;
        while (choice!=4) {
            System.out.println("\n--- Salary Management System ---");
            System.out.println("1. Show All Employees");
            System.out.println("2. Add New Employee");
            System.out.println("3. Calculate Salary of Employee");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    //give salary of employee
                    for (int i=0;i<employees.size();i++) {
                        employees.get(i).display();
                    }
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Basic Salary: ");
                    double basic = sc.nextDouble();
                    System.out.print("Enter Allowance: ");
                    double allowance = sc.nextDouble();
                    System.out.print("Enter Deduction: ");
                    double deduction = sc.nextDouble();

                    employees.add(new EmployeeSalary(id, name, basic, allowance, deduction));
                    System.out.println("Employee added successfully!");
                    break;

                case 3:
                    //calculation of net salary
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (EmployeeSalary e : employees) {
                        if (e.id == searchId) {
                            System.out.println("Net Salary of " + e.name + " = " + e.calculateSalary());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

