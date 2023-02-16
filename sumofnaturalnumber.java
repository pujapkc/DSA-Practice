import java.util.Scanner;

public class sumofnaturalnumber {

    public static int sum(int n){
        
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        sc.close();
        int s=sum(n);
        System.out.println(s);
    }
}
