import java.util.*;
public class HashMapex {
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"India");
        map.put(2,"India");
        map.put(3,"India");
        map.put(4,"India");
        map.put(5,"India");
        map.put(6,"India");

        System.out.println(map);
        System.out.println(map.containsKey(3));
        map.remove(2);
        System.out.println(map);

        for(Map.Entry<Integer,String> ele: map.entrySet())
        {
            System.out.println(ele.getKey()+"=>"+ele.getValue());
//            System.out.println(ele.hashCode());
        }


    }
}
