import java.util.Arrays;
import java.util.Scanner;

public class day23Q3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter  String one:");
        String str1 = sc.next();
        System.out.println("enter  String two:");
        String str2 = sc.next();
        //if length of both string are not equal
        if(str1.length()!=str2.length()){
            System.err.println("it is not anagram as length are not equal");
        }
        //convert rting arr into string
        else{
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        //sort both array
            Arrays.sort(arr1);
            Arrays.sort(arr2);
        //check the condition
        if (Arrays.equals(arr1, arr2)) {
                System.out.println("Strings are Anagram ");
            } 
            else {
                System.out.println("Strings are NOT Anagram ");
            }
        } 
    }
}
