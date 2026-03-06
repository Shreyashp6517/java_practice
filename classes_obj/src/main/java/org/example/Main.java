package org.example;
import java.util.*;


class Pen{
    String color;
    String type;

    public Pen(String color, String type){
        this.color=color;
        this.type=type;
    }

    public void printcolor(){
        System.out.println(color);
    }
    public void printtype(){
        System.out.println(type);
    }
    public void printline(){
        System.out.println("------------------");
    }


}

public class Main {
    public static void main(String args[]) {
        Pen pen1 = new Pen("red","ballpoint");
        pen1.printcolor();
        pen1.printtype();

        pen1.printline();

        Pen pen2 = new Pen("blue","Inkpen");

        pen2.printcolor();
        pen2.printtype();

        pen2.printline();

        }
    }

