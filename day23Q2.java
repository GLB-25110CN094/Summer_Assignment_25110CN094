import java.util.Scanner;

public class day23Q2 {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("enter a String");
        String str = sc.nextLine();
        //String ko array me change kar diya
         char[] arr = str.toCharArray();
        boolean found = false;
        //loop compair kiya 
        for (int i = 0; i < arr.length; i++) {
            boolean repeat = false;
           //first repeat pr true ho gaya
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    repeat = true;
                    break;
                }
            }
              //first repeat ko print kar diya
            if (repeat) {
                System.out.println("First repeating character: " + arr[i]);
                found = true;
                break;
            }
        }
        //agar koi repeat na mile to 
        if (!found) {
            System.out.println("there is no repeating  character found.");
        }
    }
}
