package pij.day16;

// UnsafeClass is an ''anti-example'' with much bad practice to avoid
import java.util.List;
public class UnsafeClass { // allows subclasses that override methods
    private List<String> entries; // can be replaced (by accident)
    private double value;         // by methods
    public UnsafeClass(List<String> entries, double value) {
        this.entries = entries; // aliasing; problematic even
        this.value = value;     // without multiple threads
    }
    public void setValue(double value) { // possible race condition
        this.value = value;              // for calls to mutator
    }
    public List<String> getEntries() {
        return this.entries; // aliasing
    }
}
