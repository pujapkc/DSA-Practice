import java.util.Scanner;

public class print1ton {

    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        sc.close();
        print(n);
    }
}
