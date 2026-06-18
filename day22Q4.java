//Write a program to Remove spaces from 
//string. 

import java.util.Scanner;

public class day22Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char ch=' ';
        //new string that not contain space 
        String newString="";
        //removing space from new string
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
               newString+=str.charAt(i);
            }
        }
        System.err.println("new string without space is : "+newString);

    }
}
