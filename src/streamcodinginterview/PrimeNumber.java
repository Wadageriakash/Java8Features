package streamcodinginterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);

        // Filter prime numbers correctly
        List<Integer> primenum = num.stream()
                                    .filter(PrimeNumber::isPrime) // Corrected method reference
                                    .collect(Collectors.toList());
        System.out.println("Prime numbers = " + primenum);

        // Check if any number is prime
        boolean containsPrime = num.stream().anyMatch(PrimeNumber::isPrime);
        System.out.println("List contains a prime number: " + containsPrime);
    }

    // Corrected prime check function (static)
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
