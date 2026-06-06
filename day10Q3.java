/*Q3 ---Write a program to Print number pyramid. 
    1 
   121 
  12321 
 1234321 
123454321   */

public class day10Q3 {
    public static void main(String[] args) {
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int s=i-1;s>=1;s--){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
