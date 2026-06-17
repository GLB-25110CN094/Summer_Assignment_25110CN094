import java.util.Scanner;

public class day21Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //enter string 
        System.out.println("enter a string :");
        String st = sc.nextLine();
        //string in reverse order 
        System.out.println("string in reverse order is :");
        for(int i=st.length()-1;i>=0;i--){
            System.out.print(st.charAt(i));
        }
    }
}
