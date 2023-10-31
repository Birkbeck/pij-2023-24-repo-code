package pij.day8;

public class MyBox<T> {
    private T data;

    public MyBox(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
