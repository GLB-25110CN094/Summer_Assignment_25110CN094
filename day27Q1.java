import java.util.*;



class Student{
    //student class 
    int id;
    String name;
    String course;
    double marks;
       
        Student(int id, String name, String course, double marks){
            //automaticaly called when object is created
              this.id=id;
              this.name=name;
              this.course=course;
              this.marks=marks;
        }
        void display() {
            //a function that display data
        System.out.println("ID: " + id + ", Name: " + name +
                           ", Course: " + course + ", Marks: " + marks);
        
        }
    }        
public class day27Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         ArrayList<Student> students = new ArrayList<>();
         //array list for storing data of student 
        students.add(new Student(101, "Rahul", "B.Tech", 85.5));
        students.add(new Student(102, "Priya", "MBA", 78.0));
        students.add(new Student(103, "Amit", "B.Sc", 92.3));
         int choice=0;
         //do while loop run until user choose 3
        do{
            System.out.println("--------student managment system-----------");
            System.out.println("1. display details");
            System.out.println("2. add new student details");
            System.out.println("3. Exit");
            System.out.print("choose one : ");
             choice=sc.nextInt();
         //user choice cases 
        switch (choice) {
            case 1:
                //display record
                    System.out.println("\n--- Student Records ---");
                    for (int i = 0; i < students.size(); i++) {
                        students.get(i).display();
                    }
                break;
            case 2:
                //add new record
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    students.add(new Student(id, name, course, marks));
                    System.out.println("New student added successfully!");
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
