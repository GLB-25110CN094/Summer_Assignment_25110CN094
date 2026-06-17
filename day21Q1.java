//Q1---counting length of string without  using function
import java.util.*;

public class day21Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //enter string 
        System.out.println("enter a string :");
        String st = sc.nextLine();
        int count=0;
        for(int i=0;i<st.length();i++){
           count++;
        }
        System.out.println("length of string is : "+count);
    }
}
