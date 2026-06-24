//Q2-----Write a program to Create bank account 
//system. 


                                       //bank account management system


import java.util.*;

class Bank{
    //class bank
    int accountNumber;
    String name;
    double balance;
    //called when object is created
    Bank(int accountNumber,String name,double balance){
        this.accountNumber=accountNumber;
        this.name=name;
        this.balance= balance;
    }
    void display(){
        System.out.println(" accountNumber : "+accountNumber+",name : "+name+", blance : "+balance);
    }
}



public class day28Q2 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    ArrayList<Bank>accounts=new ArrayList<>();
    accounts.add(new Bank(10001, "pradeep",210000));
    accounts.add(new Bank(10002, "Prabhat",110000));
    accounts.add(new Bank(10003, "kamran",130000));
     int choice=0;
     while(choice!=5){
        //choices
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Display All Accounts");
            System.out.println("2. Create New Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        switch (choice) {
            case 1:
                //display details
                  for(int i=0;i<accounts.size();i++){
                        accounts.get(i).display();
                  }
             break;
            case 2:
                //enter new account
                System.out.println("Enter accountNumber :");
                int accNum=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter name : ");
                String holdername=sc.nextLine();
                System.out.println("Enter amount : ");
                double amount=sc.nextDouble();
                accounts.add(new Bank(accNum,holdername,amount));
                System.out.println("account add successfully");
                break;
            case 3:
                //deposite money
                 System.out.print("Enter Account Number to deposit: ");
                    int depAcc = sc.nextInt();
                    boolean depFound = false;
                    for ( Bank acc : accounts) {
                        if (acc.accountNumber == depAcc) {
                            System.out.print("Enter amount to deposit: ");
                            double amt = sc.nextDouble();
                            acc.balance += amt;
                            System.out.println("Deposited successfully! New Balance: " + acc.balance);
                            depFound = true;
                            break;
                        }
                    }
                    if (!depFound) {
                        System.out.println("Account not found!");
                    }
                    break;
                case 4:
                    //withdraw maoney
                    System.out.print("Enter Account Number to withdraw from: ");
                    int withdrawAcc = sc.nextInt();
                    boolean withdrawFound = false;
                    for (Bank acc : accounts) {
                        if (acc.accountNumber == withdrawAcc) {
                            System.out.print("Enter amount to withdraw: ");
                            double amt = sc.nextDouble();
                            if (amt <= acc.balance) {
                                acc.balance -= amt;
                                System.out.println("Withdrawn successfully! New Balance: " + acc.balance);
                            } else {
                                System.out.println("Insufficient balance!");
                            }
                            withdrawFound = true;
                            break;
                        }
                    }
                    if (!withdrawFound) {
                        System.out.println("Account not found!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                  System.out.println("Invalid choice! Try again.");
            break;
            }
        } 
    }
}
