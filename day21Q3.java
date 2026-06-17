//Q3----count number of vowel and consonant present in a string 


import java.util.Scanner;

public class day21Q3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        //enter string 
        System.out.println("enter a string :");
        String st = sc.nextLine();
        //convert uper case into lower case
        st=st.toLowerCase();
        int vowelCount=0;
        int consonantCount=0;
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            //character at index i
            if(ch>='a'  &&  ch<='z'){
                 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    //count vowel
                       vowelCount++;
                 }
                 else{
                    //count consonent
                    consonantCount++;
                 }
            }
        }
        System.out.println("number of vowel present in string is :"+vowelCount);
        System.out.println("number of consonant present in string is :"+consonantCount);
    }
}
