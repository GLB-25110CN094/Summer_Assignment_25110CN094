/* Q1---java program to Print reverse star pattern. 
***** 
**** 
*** 
** 
*  */


public class day9Q1{
    public static void main(String[] args) {
         int row=5;
         //for printing number of rows
         for(int i=1;i<=row;i++){
            //for printing stars
             for(int j=1;j<=row-i+1;j++){
                  System.out.print("*");
             }
             System.out.println();
         }
    }
}