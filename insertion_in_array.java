import java.util.*;
public class insertion_in_array {

    public static void insertion(int arr[],int n,int element,int cap,int pos){
        if(n==cap){
            System.out.println("The array is full");
        }

        for(int i=n-1;i>pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=element;
        System.out.println("The new array is");
        for(int i=0;i<n+1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to insert");
        int element=sc.nextInt();
        


        insertion(arr, n, element, 5, 3);
    }
}
