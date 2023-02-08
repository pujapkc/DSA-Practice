import java.util.*;
public class gcdusingrecursion {
   static int gcd(int a,int b){
    if(b==0){
        return a;
    }
    else{
    return gcd(b, a%b);
    }
   }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int a,b;
        System.out.println("Enter the value of a and b ");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        int s=gcd(a, b);
        System.out.println(" the gcd is "+s);

        
    }
}
