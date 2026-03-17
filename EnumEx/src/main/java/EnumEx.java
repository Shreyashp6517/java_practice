
public class EnumEx {
    public static void main(String[] args){
//        Days today = Days.Monday;

//        System.out.println(today);

        for(Days now : Days.values())
        {
            switch (now){
                case Monday -> System.out.println("Today is Monday.");

                case Tuesday -> System.out.println("Today is Tuesday.");

                case Wednesday -> System.out.println("Today is Wednesday");

                case Thursday -> System.out.println("Today is Thursday.");

                case Friday -> System.out.println("Today is Friday.");

                case Saturday -> System.out.println("Today is Saturday.");


            }
        }

    }
}
