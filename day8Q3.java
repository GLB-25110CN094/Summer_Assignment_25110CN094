//Q4---- java program to print repeated number pattern
   //A
   //AB
   //ABC
   //ABCD
   //ABCDE

public class day8Q3 {
    public static void main(String[] args) {
        int row=5;
        
        for(int i=1;i<=row;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                 System.out.print(ch);
                 ch++;
            }
            System.out.println();
        }
    }
}
