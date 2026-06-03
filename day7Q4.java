// Q4--- java program to recursive reverse number


public class day7Q4 {
    
    public static int reverse(int n, int rev) {
        if (n == 0) { // Base case
            return rev;
        }
        rev = (rev * 10) + (n % 10);
        return reverse(n / 10, rev); 
    }
    
    public static void main(String[] args) {
        int num = 54321;
        System.out.println("Reverse of " + num + " is: " + reverse(num, 0));
    }

}
