import java.util.*;
public class StackEx {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(94);
        st.push(63);
        st.push(24);
        st.push(64);
        st.push(43);

        System.out.println(st);

        System.out.println(st.pop());

        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st);

        System.out.println(st.empty());
        System.out.println(st);

        st.clear();
        System.out.println(st.empty());
        System.out.println(st);

    }
}
