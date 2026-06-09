//rite a program to Count even and odd 
//elements. 
import java.util.*;

public class day13Q4 {
    public static void main(String[] args) {
        int evenSum=0;
        int oddSum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter numbe rof element of the array : ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            if(arr[j]%2==0){
              evenSum+=arr[j];
            }
            else{
            oddSum+=arr[j];
            }
        }
       System.out.println("even sum is : "+evenSum+"\nodd sum is : "+oddSum);
    }
    
}
