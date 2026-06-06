/** Q1------ program to Print star pyramid. 
    * 
   *** 
  ***** 
 ******* 
*********  **/


public class day10Q1 {
    public static void main(String[] args) {
        int row=5;
        //for printing 5 rows
        for(int i=1;i<=row;i++){
            //for leaving space
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            //for printing star
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
           System.out.println();
        }
    }
}
