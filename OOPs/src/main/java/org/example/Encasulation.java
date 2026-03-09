package org.example;

class Account{
    public String name;
    protected String email;
    private String password;

    public void setpass(String password)
    {
        this.password=password;
    }
    public String getpass(){
        return this.password;
    }


}

public class Encasulation {
    public static void main(String args[]){
        Account acc1 = new Account();
        acc1.name="Shreyash";
        acc1.email = "shreyash@gmail.com";
        acc1.setpass("shrepass");


        System.out.println(acc1.name);
        System.out.println(acc1.email);
        System.out.println(acc1.getpass());
    }
}
