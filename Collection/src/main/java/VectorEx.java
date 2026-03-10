import java.util.*;
public class VectorEx {
    public static void main(String[] args){
        Vector<Integer> vec = new Vector<>();
        vec.add(12);
        vec.add(24);
        vec.add(65);
        vec.add(11);
        vec.add(28);
        vec.add(64);

        System.out.println(vec);

        vec.remove(3);
        System.out.println(vec);

        for(Integer i:vec)
        {
            System.out.println(i);
        }
        System.out.println(vec.capacity());
        Collections.sort(vec);
        System.out.println(vec);
        Collections.sort(vec,Collections.reverseOrder());
        System.out.println(vec);
    }
}
