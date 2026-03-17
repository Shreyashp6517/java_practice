import java.util.*;

public class IteratorEx {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);

        System.out.println("Orignal list -> "+arr);

        Iterator<Integer> it = arr.iterator();

        while(it.hasNext()){
            Integer i = it.next();

            if( i %2 ==0){
                it.remove();
            }
        }

        System.out.println("Modifide list-> "+arr);
    }
}