//Write a program to Find duplicates in array. 


import java.util.Scanner;

public class day14Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int isduplicate = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    isduplicate=1;
                    System.out.println("duplicate value is present and value is : "+arr[i]);
                    break;
                }
            }
        }
        if(isduplicate==0){
            System.out.println(" there is no duplicate value");
        }
    }
    
}
