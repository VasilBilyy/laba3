package org.example;

public class SumWithoutPlus {
    public static int execute(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return execute(a - 1, b + 1);
        }
    }
}
