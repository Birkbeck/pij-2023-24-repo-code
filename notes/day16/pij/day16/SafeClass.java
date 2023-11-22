package pij.day16;

import java.util.ArrayList;          // Safeclass is an immutable
import java.util.List;               // class: thread-safe!
public final class SafeClass { // final class: no subclasses!
    private final List<String> entries; // final fields: will not
    private final double value;         // be replaced!
    public SafeClass(List<String> entries, double value) {
        this.entries = new ArrayList<>(entries); // defensive copy
        this.value = value;
    }

    // no mutator!

    public List<String> getEntries() {
        return new ArrayList<>(this.entries); // defensive copy
    }
}
