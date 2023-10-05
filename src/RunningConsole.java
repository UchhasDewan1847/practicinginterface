import java.util.Scanner;

public class RunningConsole {
    static Scanner scanner= new Scanner(System.in);
    static String s;
    static float x,y;
    static Tuple<Float> coordinate;
    static void runconsole(Cow cow,Dog dog){
        System.out.print("write your option here: ");
        s=scanner.next();
        label:
        while(true) {
            switch (s) {
                case "d":
                    getDestination();
                    System.out.println("distance covered : " + dog.walk(coordinate));
                    System.out.println("walks done : " + dog.walks);
                    break;
                case "D":
                    getDestination();
                    System.out.println("distance covered : " + dog.run(coordinate));
                    System.out.println("runs done : " + dog.runs);
                    break;
                case "C":
                    getDestination();
                    System.out.println("distance covered : " + cow.run(coordinate));
                    System.out.println("runs done : " + cow.runs);
                    break;
                case "c":
                    getDestination();
                    System.out.println("distance covered : " + cow.walk(coordinate));
                    System.out.println("walks done : " + cow.walks);
                    break;
                case "b":
                    dog.bark();
                    dog.showBarks();
                    break;
                case "m":
                    cow.milk();
                    cow.showMilkings();
                    break;
                case "q":
                    System.out.println("Thankyou");
                    break label;
                default:
                    System.out.println("wrong input");
                    break;
            }
            System.out.print("write your option here: ");
            s=scanner.next();
        }
    }
    public static void getDestination(){
        System.out.print("Enter the destination cordintate x : ");
        x=scanner.nextFloat();
        System.out.print("Enter the destination cordintate y : ");
        y=scanner.nextFloat();
        coordinate= new Tuple<>(x,y);
    }
}
