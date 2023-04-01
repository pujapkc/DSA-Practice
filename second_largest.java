import java.util.*;
public class second_largest {


    public static int secondlarge(int arr[],int n){
                int res=-1;
                int largest=0;
                for(int i=0;i<n;i++){
                    if(arr[i]>arr[largest]){
                       
                        res=largest;
                        largest=i;
                    }
                    else if(arr[i]!=arr[largest]){
                     if(res==-1||(arr[i]>arr[res])){
                           res=i;
                    }
                }

                }
                return res;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int r=secondlarge(arr, n);
        System.out.println("The second largest element is ="+arr[r]);
    }
}
