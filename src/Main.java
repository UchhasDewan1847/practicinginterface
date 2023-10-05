import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cow cow =new Cow();
        cow.setLocation(2.3F,8.8F);
        Dog dog = new Dog();
        dog.setLocation(5.9F,3.4F);
        ShowingOptions.showoptions(cow,dog);
        RunningConsole.runconsole(cow,dog);
        System.out.println("Thank you for using the application");
    }
}