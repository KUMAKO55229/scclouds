import java.util.ArrayList;

public class Primes {

    public static ArrayList<Integer> findPrimes(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("O número deve ser maior ou igual a 2.");
        }
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static ArrayList<Integer> findPrimesLinear(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("O número deve ser maior ou igual a 2.");
        }
        ArrayList<Integer> primes = new ArrayList<Integer>();
        boolean[] isComposite = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                primes.add(i);
                for (int j = i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        return primes;
    }

    public static ArrayList<Integer> findPrimesRecursive(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("O número deve ser maior ou igual a 2.");
        }
        ArrayList<Integer> primes = new ArrayList<Integer>();
        if (n == 2) {
            primes.add(2);
            return primes;
        }
        primes = findPrimesRecursive(n - 1);
        if (isPrime(n)) {
            primes.add(n);
        }
        return primes;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
