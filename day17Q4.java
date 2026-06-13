//Q4 java program to rind common element of two input array


import java.util.Scanner;

public class day17Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array 1: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.print("Enter size of array 2: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
            //enter two array ---- user input 
        System.out.println("Enter " + n + " elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter " + m + " elements of second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
         // common element 

        System.out.println("Common elements of two arrays are:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    // check if already printed
                    boolean printed = false;
                    for (int k = 0; k < i; k++) {
                        if (arr1[k] == arr1[i]) {
                            printed = true;
                            break;
                        }
                    }
                    if (!printed) {
                        System.out.print(arr1[i] + " ");
                    }
                }
            }
        }
    }
}
