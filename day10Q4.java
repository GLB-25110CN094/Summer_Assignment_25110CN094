/*Write a program to Print character pyramid. 
    A 
   ABA 
  ABCBA 
 ABCDCBA 
ABCDEDCBA */



public class day10Q4 {
    public static void main(String[] args) {
         int row=5;
        for(int i=1;i<=row;i++){
            char ch='A';
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(ch);
                ch++;
            }
            ch-=2;
            for(int s=i-1;s>=1;s--){
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }
}
