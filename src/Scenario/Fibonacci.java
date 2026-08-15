package Scenario;

import static java.lang.Math.*;

public class Fibonacci {
    public static void main(String[] args) {
        int n=6;
        int fib= toIntExact(round(pow(1.618, n) / sqrt(5)));
        System.out.println(fib);
    }
}
