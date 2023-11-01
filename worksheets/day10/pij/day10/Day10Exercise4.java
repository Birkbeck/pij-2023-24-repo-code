package pij.day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day10Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int ITERATIONS = 3;   // 10;
        int runningTotal = 0;
        int i = 0;
        while (i < ITERATIONS) {
            System.out.print("Please enter an integer: ");
            //String nextNumber;
            if (scan.hasNext()) {
                if (scan.hasNextInt()) {
                /*
                nextNumber = scan.next();
                runningTotal += Integer.parseInt(nextNumber);
                */
                    runningTotal += scan.nextInt();
                    i++;
                } else {
                    /*} catch (NumberFormatException e) {*/
                    System.out.println("Could not parse your input to an int! Try again.");
                    scan.next();
                }
            }
        }
        double avg = (double) runningTotal / ITERATIONS;
        System.out.println("The average mean is: " + avg);
    }
}
