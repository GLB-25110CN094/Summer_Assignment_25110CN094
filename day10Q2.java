/*Write a program to Print number pyramid. 
    1 
   121 
  12321 
 1234321 
123454321  */


public class day10Q2 {
    public static void main(String[] args) {
          int row=5;
        //for printing 5 rows
        for(int i=1;i<=row;i++){
            //for leaving space
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            //for printing star
            for(int k=1;k<=(2*row)-(2*i-1);k++){
                System.out.print("*");
            }
           System.out.println();
        }
    
    }
    
}