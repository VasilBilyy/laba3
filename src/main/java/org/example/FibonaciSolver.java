package org.example;

public class FibonaciSolver {
    public static long recursionExecute(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursionExecute(n - 1) + recursionExecute(n - 2);
        }
    }

    public static long cycleExecute(int n) {
        if (n <= 1) {
            return n;
        }

        long prev = 0;
        long current = 1;

        for (int i = 2; i <= n; i++) {
            long temp = current;
            current = prev + current;
            prev = temp;
        }

        return current;
    }
}
