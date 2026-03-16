import java.lang.Object;
import java.util.*;


class Student {
    int id;
    String name;
    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public boolean equals(Object obj)
    {
        Student s = (Student)obj;
        return this.id==s.id;
    }

    public int hashCode(){
        return Objects.hash(id);
    }
}

public class HashCodeEx {
    public static void main(String[] args){
        HashSet<Student> set =new HashSet<>();
        Student s1 =new Student(1,"Shreyash");
        Student s2 =new Student(1,"Shreyash");

        System.out.println(set.add(s1));
        System.out.println(set.add(s2));

        System.out.println(set.size());
    }
}
