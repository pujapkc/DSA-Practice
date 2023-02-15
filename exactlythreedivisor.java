import java.util.*;
public class exactlythreedivisor {

    public static void exactlythree(int n){
        for(int i=2;i*i<n;i++){
            if(isPrime(i)){
                  if(i*i<=n){
                      System.out.println("Number with 3 divisor is: "+i*i);
                  }
            }
        }
    }

    public static boolean isPrime(int x){
        if(x==1){
            return false;
        }
        for(int i=2;i*i<x;i++){
               if(x%i==0){
                return false;
               }
        }
        return true;

    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        exactlythree(n);
        
    }
}
