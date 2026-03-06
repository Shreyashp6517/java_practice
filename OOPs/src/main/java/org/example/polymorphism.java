package org.example;

class Student{
    String name;
    int age;

    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public void printinfo(int age)
    {
        System.out.println(age);
    }

    public void printinfo(String name)
    {
        System.out.println(name);
    }

    public void printinfo(String name, int age){
        System.out.println(name+" "+age);
    }

}

public class polymorphism {
    public static void main(String args[]){
        Student s1=new Student("Harsh",24);

        s1.printinfo(s1.name);
        s1.printinfo(s1.age);
        s1.printinfo(s1.name, s1.age);
    }
}
