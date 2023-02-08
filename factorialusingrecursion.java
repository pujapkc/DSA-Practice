import java.util.*;
public class factorialusingrecursion {
static int fact(int n){
    if(n==0){
        return 1;
    }
    return n*fact(n-1);
}




    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the number");
        n=sc.nextInt();
        sc.close();
        int s=fact(n);
        System.out.println("The factorial is "+s);
        
    }
}
