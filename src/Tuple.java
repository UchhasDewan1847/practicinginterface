public class Tuple<T> {
    protected T[] cord;
    public Tuple(T x, T y) {
        this.cord = (T[]) new Object[2];
        this.cord[0] = x;
        this.cord[1] = y;
    }
     public T getcordx(){
        return cord[0];
     }
     public T getcordy(){
        return cord[1];
     }
}
