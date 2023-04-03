import java.util.*;
public class checksorted {


    public static boolean check(int arr[],int n){
        for(int i=1;i<n;i++){
                if(arr[i]<arr[i-1]){
                    return false;
                }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter the elements of array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        } 
        
        System.out.println(check(arr, 5));
    }
}
