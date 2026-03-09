package org.example;

abstract class Bankaccount{
    private int balance;

    Bankaccount(int initial){
        if(initial>=0){
            balance =initial;
        }
    }

    public void deposit(int amount){
        if(amount>0){
            balance += amount;
        }
    }

    public boolean withdraw(int amount){
        if(amount>0 && amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }

    public int getBalance(){
        return balance;
    }
    abstract void getAccountType();
}

class SavingAcc extends Bankaccount{
    SavingAcc(int initial){
        super(initial);
    }
    void getAccountType(){
        System.out.println("Savings Account.");
    }
}

class CurrentAcc extends Bankaccount{
    CurrentAcc(int initial){
        super(initial);
    }
    void getAccountType(){
        System.out.println("Current Account");
    }
}

public class Abstraction {
    public static void main(String[] args){
        Bankaccount acc1 = new SavingAcc(2000);
        Bankaccount acc2 = new CurrentAcc(4000);


        System.out.println(acc1.getBalance());
        acc1.deposit(500);
        System.out.println(acc1.getBalance());
        acc1.withdraw(800);
        System.out.println(acc1.getBalance());
        acc1.getAccountType();

        System.out.println("****************");

        System.out.println(acc2.getBalance());
        acc2.deposit(500);
        System.out.println(acc2.getBalance());
        acc2.withdraw(1200);
        System.out.println(acc2.getBalance());
        acc2.getAccountType();

    }

}
