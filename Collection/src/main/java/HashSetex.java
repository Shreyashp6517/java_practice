import java.util.*;
public class HashSetex {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(3);
        System.out.println(set);
        System.out.println(set.size());

        set.remove(4);
        System.out.println(set);
        System.out.println(set.size());
        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(set.isEmpty());

        System.out.println(set.contains(3));
        System.out.println(set.contains(7));

    }
}
