import java.util.*;
public class searchinArray{

    public static void linearsearch(int arr[],int n,int element){
              for(int i=0;i<n;i++){
                if(arr[i]==element){
                    System.out.println("The element"+element+"is present in the array");
                }
                else{
                    System.out.println("The element is not present in the array");
                }
              }
    }
     public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("enter the element to search");
        int element=sc.nextInt();
        linearsearch(arr,n,element);
     }
     
}