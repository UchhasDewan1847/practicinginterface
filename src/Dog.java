public class Dog extends Animal{
    private int barks;

    public void bark(){
        System.out.println("barked ");
        barks++;
    }
    public void showBarks(){
        System.out.println("number of barks: "+barks);
    }

}
