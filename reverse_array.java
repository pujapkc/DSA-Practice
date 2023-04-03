import java.util.*;
public class reverse_array {

     //It has worse time complexity
    // public static void reverse(int arr[],int n){
    //     int arr1[]=new int[n];
    //     int j=n;
    //     for(int i=0;i<n;i++){
    //         arr1[j-1]=arr[i];
    //         j=j-1;
    //     }

    //     System.out.println("the reversed array is ");
    //     for(int i=0;i<n;i++){
    //         System.out.println(arr1[i]);
    //     }
    // }

    public static void reverse(int arr[],int n){
        int temp=0;
        int high=n-1;
        int low=0;
        
        while(low<high){
        for(int i=0;i<n;i++){
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
        System.out.println("the reversed array is ");
         for(int i=0;i<n;i++){
            System.out.println(arr[i]);
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
        reverse(arr, n);
    }
}
