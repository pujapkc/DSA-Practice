import java.util.*;
public class deletion_in_array {

    public static int deletion(int arr[],int n,int element){
        int i;
        
    for( i=0;i<n;i++){
        if(arr[i]==element){
            break;
        }
        if(i==n){
            return n;
        }

    }
    for(int j=i;j<n-1;j++){
        arr[j]=arr[j+1];
    }
    return n-1;

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter the elements of array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }

        System.out.println("enter the element which you want to delete");
          int element=sc.nextInt();
          System.out.println("Array before deletion");
          for(int i=0;i<5;i++){
            System.out.println(arr[i]);
          }

          int n1=deletion(arr, 5, element);
          
          System.out.println("Array after deletion");
          for(int i=0;i<n1;i++){
            System.out.println(arr[i]);
          }
    }
}
