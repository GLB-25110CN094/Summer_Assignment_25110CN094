//Q3----- java program to print repeated character problem


public class day9Q3 {
    public static void main(String[] args) {
        int row = 5;
        char ch = 'A';
        //for printing number of rows
        for (int i = 1; i <= row; i++) {
            //for printing character
            for (int j = 1; j <=i; j++) {
                System.out.print(ch);
            }
            //for upgrading ch
            ch++;
            System.out.println();
        }
    }
}
