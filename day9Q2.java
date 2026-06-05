//Q2---- java program to print reverse number triangle 

public class day9Q2 {
    public static void main(String[] args) {
        int row=5;
        //for number of rows
        for(int i=1;i<=row;i++){
            //for printing number 
            for(int j=1;j<=row+1-i;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
