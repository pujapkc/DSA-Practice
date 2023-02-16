import java.util.Scanner;

public class checkstringpalindrome {

    public static boolean check(String str,int start,int end){
        if(start>=end){
            return true;
        }
        return(str.charAt(start)==str.charAt(end)&& check(str, start+1, end-1));
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        sc.close();
        boolean s=check(str, 0, str.length()-1);
        if(s==true){
            System.out.println("The string is palindrome");
        }
        else{
            System.out.println("The string is not palindrome");
        }

    }
}
