public class ShowingOptions {
    static void showoptions(Cow cow,Dog dog){
        float a=dog.currenLocation.getcordx();
        float b=dog.currenLocation.getcordy();
        float x=cow.currenLocation.getcordx();
        float y=cow.currenLocation.getcordy();
        System.out.println("The current Location of the Cow is x:"+x+" y:"+y);
        System.out.println("The current Location of the Dog is x:"+a+" y:"+b);
        System.out.println("Press 'd' to make the Dog walk");
        System.out.println("Press 'D' to make the Dog run");
        System.out.println("Press 'c' to make the Cow walk");
        System.out.println("Press 'C' to make the Cow run");
        System.out.println("Press 'b' to make the Dog bark");
        System.out.println("Press 'm' to milk the Cow");
        System.out.println("Press q to quit ");
    }
}
