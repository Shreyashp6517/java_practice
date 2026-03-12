import java.util.*;
public class TreeSetEx {
    public static void main(String[] args){
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(34);
        ts.add(4);
        ts.add(54);
        ts.add(13);
        ts.add(76);
        ts.add(33);
        ts.add(38);
        ts.add(27);
        ts.add(98);

        System.out.println(ts);

        System.out.println(ts.contains(54));

        System.out.println(ts.first());
        System.out.println(ts.last());

        System.out.println(ts.ceiling(60));

        System.out.println(ts.floor(32));


        System.out.println(ts);
        System.out.println(ts.pollFirst());

        System.out.println(ts.pollLast());

        System.out.println(ts);

        for(Integer i : ts)
        {
            System.out.println(i);
        }



    }
}
