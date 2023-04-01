import java.util.*;
public class arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(20);
        arr.add(30);
        System.out.println("Arraylist after insertion");
        System.out.println(arr);

        arr.remove(1);
        System.out.println("arraylist after deletion");
        System.out.println(arr);

        

    }
}
