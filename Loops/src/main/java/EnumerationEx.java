import java.util.*;
public class EnumerationEx {
    public static  void main(String[] args){
        Hashtable<Integer,Integer> mp = new Hashtable<>();
        mp.put(1,32);
        mp.put(2,76);
        mp.put(3,4);
        mp.put(4,322);
        mp.put(5,754);
        mp.put(6,3);
        mp.put(7,372);
        mp.put(8,332);



        Enumeration<Integer> i = mp.keys();

        while(i.hasMoreElements())
        {
            Integer key = i.nextElement();
            System.out.println(key+"->"+mp.get(key));
        }

        Vector<Integer> vec = new Vector<>();
        vec.add(76456);
        vec.add(2343);
        vec.add(53);
        vec.add(731);
        vec.add(63);
        vec.add(43);
        vec.add(7);

        Enumeration<Integer> j = vec.elements();

        while(j.hasMoreElements())
        {
            System.out.println(j.nextElement());
        }
    }

}
