// Q4---Write a program to Create inventory 
//management system. 

import java.util.*;
class Product{
    int id;
    //product class
    String name;
    int quantity;
    double price;
     //called when object is created
    Product(int id,String name, int quantity, double price){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    //display function
    void display(){
        System.out.println("id : "+id+",product name : "+name+",quantity : "+quantity+",price : "+price);
    }
}

public class day29Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //array list
        ArrayList<Product> products=new ArrayList<>();
        //predefined data
        products.add(new Product(101, "pen", 50, 10));
        products.add(new Product(102, "errasor", 55, 5));
        products.add(new Product(103, "box", 60, 30));
        int choice=0;
        while(choice!=5){
            //runs until user choose 5
            System.out.println("---------welcome to enventory menu----------");
            System.out.println("1.display record");
            System.err.println("2.add new record");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Update Product Quantity");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    //display record 
                    System.err.println("record :");
                     for (int i = 0; i < products.size(); i++) {
                        products.get(i).display();
                    }
                   break;
                case 2:
                    //enter new product 
                    System.err.print("Enter product id : ");
                    int pr=sc.nextInt();
                    sc.nextLine();
                    System.out.print("enter product name : ");
                    String pName=sc.nextLine();
                     System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    products.add(new Product(pr, pName, qty, price));
                    System.out.println("new product add successfuly");
                    break;
                case 3:
                    //search specific product
                    System.out.print("Enter Product ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    //loop run until id become same
                    for (int i = 0; i < products.size(); i++) {
                        if (products.get(i).id == searchId) {
                            System.out.println("Product found:");
                            products.get(i).display();
                            found = true;
                            break;
                        }
                    }
                    //if id is not found
                    if (!found) {
                        System.out.println("Product not found!");
                    }
                    break;
                case 4:
                    //increase our decrease quantity of product
                    System.out.print("Enter Product ID to update: ");
                    int updateId = sc.nextInt();
                    boolean updated = false;
                    for (int i = 0; i < products.size(); i++) {
                        if (products.get(i).id == updateId) {
                            System.out.print("Enter new quantity: ");
                            products.get(i).quantity = sc.nextInt();
                            System.out.println("Quantity updated!");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Product not found!");
                    }
                    break;
                case 5:
                    //if user wants to leave
                    System.out.println("Exiting system...");
                    break;
                default:
                    //if user put invalid choice   
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        }
    }
}
