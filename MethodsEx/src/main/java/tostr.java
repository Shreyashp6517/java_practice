class Car{
    String Com;
    String Model;
    int made_in;
    String Type;

    Car(String Com,String Model,int made_in,String Type)
    {
        this.Com=Com;
        this.Model=Model;
        this.made_in=made_in;
        this.Type=Type;
    }

    public String toString(){
        return "Company = "+Com+"\n"+"Model = "+Model+"\n"+"Manufacturing year = "+made_in+"\n"+"Car type = "+Type;
    }

}
public class tostr {
    public static void main(String[] args){
        Car c1 = new Car("Ford","Endevor",2020,"SVU");

        System.out.println(c1);
    }
}
