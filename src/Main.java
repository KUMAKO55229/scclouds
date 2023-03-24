import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 10;

        // chamando a função recursiva
        int fibonacciRecursivo = Fibonacci.recursiveFibonacci(n);
        System.out.println("O valor de Fibonacci para n=" + n + " usando a abordagem recursiva é: " + fibonacciRecursivo);

        // chamando a função linear
        int fibonacciLinear = Fibonacci.linearFibonacci(n);
        System.out.println("O valor de Fibonacci para n=" + n + " usando a abordagem linear é: " + fibonacciLinear);

        // chamando a função genérica
        int fibonacciGenerico = Fibonacci.fibonacci(n);
        System.out.println("O valor de Fibonacci para n=" + n + " usando a abordagem genérica é: " + fibonacciGenerico);

        System.out.print("A seguir todos os números primos até "+10+ " usando a abordagem genérica \n");
        //Chamando o metodo findPrimes
        ArrayList<Integer> primes = Primes.findPrimes(n);
        System.out.println(primes); // output: [2, 3, 5, 7]

        System.out.print("A seguir todos os números primos até "+10+ " usando a abordagem linear \n ");
        // Chamando o metodo findPrimesLinear
        ArrayList<Integer> primesLinear = Primes.findPrimesLinear(n);
        System.out.println(primesLinear); // output: [2, 3, 5, 7]

        System.out.print("A seguir todos os números primos até "+10+ " usando a abordagem recursiva \n");
        // Chamando o metodo findPrimesRecursive
        ArrayList<Integer> primesRecursive = Primes.findPrimesRecursive(n);
        System.out.println(primes); // output: [2, 3, 5, 7]
    }


}




