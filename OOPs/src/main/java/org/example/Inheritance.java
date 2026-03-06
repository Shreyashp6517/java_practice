package org.example;

class  Vehical{
    public void enginestart()
    {
        System.out.println("Engine is ON");
    }
}
// Single level Inheritance
class Bike extends Vehical{
    public void wheels(int w){
        System.out.println("No. of wheels "+w);
    }
}
//Multi level triangle

class Moped extends Bike{
    public void Hasmotor(){
        System.out.println("Yes");
    }
}

//hierarchical Inheritance

class Car  extends Vehical{
    public void wheels(int w)
    {
        System.out.println("No. of wheels "+w);
    }
}

// Hybrid Inheritance

class Maruti extends Car{
    public void power(int p)
    {
        System.out.println("It has "+ p+" bhp");
    }
}

public class Inheritance {
    public static void main(String[] args){
        Bike b1 = new Bike();
        b1.enginestart();
        b1.wheels(2);

        Moped by1 = new Moped();
        by1.enginestart();
        by1.wheels(2);
        by1.Hasmotor();

        Car c1 = new Car();
        c1.enginestart();
        c1.wheels(4);
        Maruti m1 =new Maruti();
        m1.enginestart();
        m1.wheels(4);
        m1.power(800);
    }

}
