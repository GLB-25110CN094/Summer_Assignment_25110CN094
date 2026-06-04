//Q1-----java program to print half pyramid pattern

public class day8Q1 {
    public static void main(String[] args) {
        int row=5;
        //to print rows
        for(int i=1;i<=row;i++){
            // to print number of stars in a line
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // for changing the line
            System.out.println(" ");
        }
    }
}
