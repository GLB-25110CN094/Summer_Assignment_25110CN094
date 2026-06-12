//Q1---- java program to find missing number in array.



public class day16Q1 {
    public static void main(String[] args) {
        int arr[]= {1,2,4,5,6};
        int n=arr.length+1;
        int totalsum=n*(n+1)/2;
        int originalsum=0;
        for(int i=0;i<arr.length;i++){
            originalsum+=arr[i];
        }
        int missing=totalsum-originalsum;
        System.out.println("missing number is : "+missing);
    }
}
