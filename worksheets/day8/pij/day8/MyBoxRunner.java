package pij.day8;

public class MyBoxRunner {
    public static void main(String[] args) {
        MyBox<String> box = new MyBox<>("Hello");
        String s = box.getData();
        System.out.println(s);
    }
}
