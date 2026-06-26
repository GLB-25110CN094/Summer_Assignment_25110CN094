//Q3----Write a program to Create mini employee 
//management system. 


                                       //bank account management system


import java.util.*;



class Emp{
    //employee class 
    int id;
    String name;
    String designation;
    double salary;
       
        Emp(int id, String name, String designation, double salary){
            //automaticaly called when object is created
              this.id=id;
              this.name=name;
              this.designation=designation;
              this.salary=salary;
        }
        void display() {
            //a function that display data
        System.out.println("ID: " + id + ", Name: " + name +
                           ", designation: " + designation + ", salary: " + salary);
        
        }
    }        
public class day30Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         ArrayList<Emp>employees = new ArrayList<>();
         //array list for storing data of student 
        employees.add(new Emp(101, "Rahul", "editor", 23456.0));
        employees.add(new Emp(102, "Priya", "manager", 78864.0));
        employees.add(new Emp(103, "Amit", "HR", 32344.3));
         int choice=0;
         //do while loop run until user choose 3
        do{
            System.out.println("--------Employee Management System-----------");
            System.out.println("1. display details");
            System.out.println("2. add new Employee details");
            System.out.println("3. Exit");
            System.out.print("choose one : ");
             choice=sc.nextInt();
         //user choice cases 
        switch (choice) {
            case 1:
                //display record
                    System.out.println("\n--- employee Records ---");
                    for (int i = 0; i < employees.size(); i++) {
                        employees.get(i).display();
                    }
                break;
            case 2:
                //add new record
                    System.out.print("Enter employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter designation: ");
                    String designation = sc.nextLine();

                    System.out.print("Enter salary: ");
                    double salary= sc.nextDouble();

                    employees.add(new Emp(id, name, designation, salary));
                    System.out.println("New employee added successfully!");
                    break;
            case 3: 
                //return from database
                   System.out.println("thankyou for visiting ");
                   break;
        
            default:
                //if user choose other then 1,2,3
                    System.out.println("Invalid choice! Try again."); 
                break;
            }
        }while(choice!=3);
    }        
}


