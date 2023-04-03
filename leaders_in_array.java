import java.util.*;
public class leaders_in_array{

    public static void leader(int arr[],int n){
        int curr_leader=arr[n-1];
        System.out.println("Current leader is"+curr_leader);

        for(int i=n-2;i>0;i--){
            if(curr_leader<arr[i]){
                curr_leader=arr[i];
                System.out.println("Current leader is"+curr_leader);
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        leader(arr, n);
    }
}