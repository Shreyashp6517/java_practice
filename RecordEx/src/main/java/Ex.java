public class Ex {
    public static void main(String[] args){
        Emp e1 = new Emp(1,"Shreyash","IT");

        System.out.println("Name="+e1.emp_name());
        System.out.println("ID="+e1.emp_id());
        System.out.println("Department="+e1.emp_dep());

        System.out.println(e1.toString());
    }
}
