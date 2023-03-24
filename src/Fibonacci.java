public class Fibonacci {
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser maior ou igual a zero.");
        }
        if (n <= 1) {
            return n;
        }
        int lastFib = 0;
        int currentFib = 1;
        for (int i = 1; i < n; i++) {
            int NextFib = lastFib + currentFib;
            lastFib = currentFib;
            currentFib = NextFib;
        }
        return currentFib;
    }

    public static int recursiveFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser maior ou igual a zero.");
        }
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static int linearFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser maior ou igual a zero.");
        }
        int lastFib = 0;
        int currentFib = 1;
        for (int i = 1; i <= n; i++) {
            int nextFib = lastFib + currentFib;
            lastFib = currentFib;
            currentFib = nextFib;
        }
        return lastFib;
    }
}
