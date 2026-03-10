
import java.util.*;
public class ArrayListEx {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        for(Integer s:arr){
            System.out.print(s+" ");
        }
        System.out.println();


        arr.add(2,5);

        for(Integer s:arr){
            System.out.print(s+" ");
        }
        System.out.println();

        arr.set(3,6);
        for(Integer s:arr){
            System.out.print(s+" ");
        }
        System.out.println();

        arr.remove(4);
        for(Integer s:arr){
            System.out.print(s+" ");
        }
        System.out.println();

        System.out.println(arr.contains(5));
        System.out.println(arr.contains(3));
    }
}
