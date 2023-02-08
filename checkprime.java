import java.util.*;
public class checkprime {
     static boolean check(int n){
        if(n==1){
            return false;
        }
        else{
            for(int i=2;i*i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
     }


    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     sc.close();
     boolean s=check(n);
     System.out.println(s);   
    }
}
