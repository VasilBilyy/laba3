package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int N = 10;


        long factorialRecursionResult = FactorialSolver.recursionExecute(N);
        long factorialCycleResult = FactorialSolver.cycleExecute(N);
        assert factorialRecursionResult == factorialCycleResult : "Different values";
        System.out.println("Результат підрахунку факторіалу рекурсією: " + factorialRecursionResult);

        long fibonaciRecursionResult = FibonaciSolver.recursionExecute(N);
        long fibonaciCycleResult = FibonaciSolver.cycleExecute(N);
        assert fibonaciRecursionResult == fibonaciCycleResult : "Different values";
        System.out.println("Результат підрахунку числа Фінобачі: " + fibonaciRecursionResult);

        int a = 12345;
        int digitSumResult = DigitSumCalculator.execute(a);
        System.out.println("сума цифр числа '" + a + "': " + digitSumResult);

        int sumResult = SumWithoutPlus.execute(5, 7);
        System.out.println("Сума: " + sumResult);
    }
}