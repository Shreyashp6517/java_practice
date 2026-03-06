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

public class Inheritance {
    public static void main(String[] args){
        Bike b1 = new Bike();
        b1.enginestart();
        b1.wheels(2);

        Moped by1 = new Moped();
        by1.enginestart();
        by1.wheels(2);
        by1.Hasmotor();
    }

}
