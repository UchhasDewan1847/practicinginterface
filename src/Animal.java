public abstract class Animal implements AnimalMovable{
    protected Tuple<Float> currenLocation;
    protected int runs,walks;
    protected void setLocation(float x, float y){
        currenLocation= new Tuple<Float>(x,y);
    }
    @Override
    public float walk(Tuple endingpoint) {
        System.out.println("end of walking");
        walks++;
        return move(currenLocation,endingpoint);
    }

    @Override
    public float run(Tuple endingpoint) {
        System.out.println("end of running");
        runs++;
        return move(currenLocation,endingpoint);
    }
    protected float move(Tuple startingpoint, Tuple endingpoint){
        float x= (float)endingpoint.getcordx();
        float y= (float)endingpoint.getcordy();
        float xi= (float)startingpoint.getcordx();
        float yi= (float)startingpoint.getcordy();
        setLocation(x,y);
        return (float)Math.sqrt(Math.pow(x-xi,2)+Math.pow(y-yi,2));

    }
}
