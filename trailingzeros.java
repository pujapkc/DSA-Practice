import java.util.Scanner;

public class trailingzeros {

    static int trailing(int n){
    int res=0;
    for(int i=5;i<=n;i=i*5){
         res=res+(n/i);
         
    }
    return res;
}

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int s=trailing(n);
        System.out.println("The trailing zeros in factorial of "+n+" is "+s);
    }
}
