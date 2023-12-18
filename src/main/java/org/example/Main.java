package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int N = 5;


        long factorialRecursionResult = FactorialSolver.recursionExecute(N);
        long factorialCycleResult = FactorialSolver.cycleExecute(N);
        assert factorialRecursionResult == factorialCycleResult : "Different values";
        System.out.println("Результат підрахунку факторіалу рекурсією: " + factorialRecursionResult);

    }
}