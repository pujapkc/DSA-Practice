import java.util.*;
public class removeduplicatesinsortedarray {


    public static int remove(int arr[],int n){
        int res=1;
        for(int i=1;i<n;i++){
            if(arr[res-1]!=arr[i]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
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
        int r=remove(arr,n);

        
        System.out.println("array after removal of duplicates");
        for(int i=0;i<r;i++){
            System.out.println(arr[i]);
        }
    }
}
