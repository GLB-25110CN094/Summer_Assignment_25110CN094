//Q2----java program to print  number triangle
    //1
    //12
    //123
    //1234
    //12345

public class day8Q2 {
   public static void main(String[] args) {
    int row=5;
    //for number of rows
    for(int i=1;i<=row;i++){
    // for  number in row
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        // for next line
        System.out.println(" ");
    }
   } 
}
