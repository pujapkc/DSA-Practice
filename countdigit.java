import java.util.*;
public class countdigit{
   static int count(int n){
         int res=0;
         while(n>0){
            n=n/10;
            res++;
         }
         return res;
   }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        sc.close();
        int s=count(n);
        System.out.println("The number of digit is "+s);
        
    }
}