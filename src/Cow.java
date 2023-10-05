public class Cow extends Animal{

    private int milkings;

    public void milk(){
        System.out.println("milked ");
        milkings++;
    }
    public void showMilkings(){
        System.out.println("number of milkings: "+milkings);
    }
}
