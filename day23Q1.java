 //Q1---Write a program to Find first non-repeating 
//character
 
 import java.util.*;


public class day23Q1 {
   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a String");
        String str = sc.nextLine();
        //string change to array
        char[] arr = str.toCharArray();
        boolean found = false;
        //loop work and cjheck if repeated value find return
        for (int i = 0; i < arr.length; i++) {
            boolean repeat = false;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    repeat = true;
                    break;
                }
            }
            //print first non repeated value
            if (!repeat) {
                System.out.println("First non-repeating character: " + arr[i]);
                found = true;
                break;
            }
        }
             // if non repeated value not found
        if (!found) {
            System.out.println("No non-repeating character found.");
        }
    }
}

