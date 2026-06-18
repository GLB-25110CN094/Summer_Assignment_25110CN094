import java.util.Scanner;

public class day22Q1 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String st = sc.nextLine();
        String rev="";
        //REVERSE STRING
        System.out.println("string in reverse order is :");
        for(int i=st.length()-1;i>=0;i--){
             rev=rev+st.charAt(i);    
        }    
        //CONDITION TO CHECK REVERSE STRING
        System.out.println("reverse string is :"+rev);
        if(st.equals(rev)){
            System.out.println("palindrom string ");
        }
        else{ 
            System.out.println("non palindrom string");}
    }
}