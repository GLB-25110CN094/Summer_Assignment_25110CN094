//Q4-----Write a program to Create marksheet 
//generation system. 
                                     //MARKSHEET MANAGEMENT SYSTEM


import java.util.*;                                  
class Marksheet{
    //class marksheet
    int rollno;
    String name;
    int[] marks;
    //called when object is created
    Marksheet(int rollno ,String name ,int[] marks){
               this.rollno=rollno;
               this.name=name;
               this.marks=marks;
    }
    //method for calculation of total marks of student
    int totalMark(){
           int sum=0;
           for(int i=0;i<marks.length;i++){
            sum+=marks[i];
           }
           return sum;
    }
    //method to calculate percentage
    int percentage(){
        return totalMark()/marks.length;
    }
    //method to calculate grade of student
    String grade(){
        int per=totalMark();
        if(per>=90){
            return "A";
        }
        else if(per>=80&&per<90){
            return "B";
        }
        else if(per>=70&&per<80){
            return "C";
        }
        else if(per>=60&&per<70){
            return "D";
        }
        else if(per>=50&&per<60){
            return "E";
        }
        else{
            return "fail";
        }
    }
    //method to display details of student
    void display() {
        System.out.println("rollno: " + rollno + ", Name: " + name +
                ", Total: " + totalMark() +
                ", Percentage: " + percentage() +
                ", Grade: " + grade());
    }
}


public class day27Q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //arraylist for storing data of student
       ArrayList<Marksheet> students=new ArrayList<>();
       //some data are 
       students.add(new Marksheet(1, "Amit", new int[]{87, 85, 70}));
       students.add(new Marksheet(2, "Amrita", new int[]{67, 57, 78}));
       students.add(new Marksheet(3, "yogita", new int[]{89, 89, 98}));

        int choice = 0;
        while (choice != 4) {
            System.out.println("\n--- Marksheet Generation System ---");
            System.out.println("1. Show All Students");
            System.out.println("2. Add New Student");
            System.out.println("3. Generate Marksheet of Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    //display record
                    for (int i = 0; i < students.size(); i++) {
                        students.get(i).display();
                    }
                    break;

                case 2:
                    //add new student record
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter number of subjects: ");
                    int n = sc.nextInt();
                    int[] marks = new int[n];
                    //enter marks of subject 
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter marks of subject " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                    }
                    //new student data
                    students.add(new Marksheet(id, name, marks));
                    System.out.println("Student added successfully!");
                    break;

                case 3:
                    //print marksheet
                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (Marksheet s : students) {
                        if (s.rollno == searchId) {
                            s.display();
                            found = true;
                            break;
                        }
                    }
                    //if record not found
                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    //if you want to return
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    //if choice is other then 1,2,3,4
                    System.out.println("Invalid choice!");
            }
        }
    }
}
