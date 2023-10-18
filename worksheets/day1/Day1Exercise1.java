public class Day1Exercise1 {
    public static void main(String[] args) {
        // This program sets i to 10, then the check of the loop condition
        // fails, and the program terminates.
        // One way to get more useful behaviour could be to write "int i = 0;"
        // instead of "int i = 10;": then the loop would print 1, 2, 3, 4, 5
        // and exit.
        // Alternatively: the author's intention from the title "Ende homage"
        // (hinting at author Michael Ende's book "The neverending story")
        // might have been to make the loop run forever.
        // By changing "i < 5" to "i > 5" we could ensure that the program
        // will run very long indeed (then i == 10, 11, 12, ... all make the
        // loop condition true; only when we exceed the maximum value that can
        // be stored in an int and get a /negative/ number for i will the loop
        // exit -- more on this limitation of int later).
        int i = 10;
        while (i < 5) {
            i++;
            System.out.println(i);
        }
    }
}
