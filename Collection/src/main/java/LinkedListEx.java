import java.util.*;
public class LinkedListEx {
    public static void main(String[] args){
        LinkedList<Integer> li = new LinkedList<>();

        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);

        for(int i=0;i<li.size();i++)
        {
            System.out.print(li.get(i)+" ");
        }
        System.out.println();

        li.add(3,7);

        for(int i=0;i<li.size();i++)
        {
            System.out.print(li.get(i)+" ");
        }
        System.out.println();

        li.removeFirst();
        for(int i=0;i<li.size();i++)
        {
            System.out.print(li.get(i)+" ");
        }
        System.out.println();
        li.removeLast();
        for(int i=0;i<li.size();i++)
        {
            System.out.print(li.get(i)+" ");
        }
        System.out.println();

        System.out.println(li.peek());

        System.out.println(li.pollLast());
//        System.out.println(li.pop());

        for(int i=0;i<li.size();i++)
        {
            System.out.print(li.get(i)+" ");
        }
        System.out.println();


    }
}
