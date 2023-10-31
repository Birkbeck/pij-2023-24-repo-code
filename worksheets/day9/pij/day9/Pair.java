package pij.day9;

public class Pair<X, Y> {

    private final X x;
    private final Y y;

    public Pair(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    //public Pair(Pair<X, Y> other) {
    public Pair(Pair<? extends X, ? extends Y> other) {
        //this.x = other.x;
        //this.y = other.y;
        this(other.x, other.y);
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    public Pair<Y, X> swap() {
        return new Pair<>(y, x);
    }
}
