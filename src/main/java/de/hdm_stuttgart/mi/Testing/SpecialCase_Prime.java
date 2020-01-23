package de.hdm_stuttgart.mi.Testing;

public class SpecialCase_Prime {


    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));

    }

    /**
     * Test, whether a given number is prime.
     * @param candidate The number to be assessed
     * @return true if candidate is prime, false otherwise
     * <dl>
     *   <dt>Precondition:</dt>
     *   <dd>2 &lt;= candidate</dd>
     * </dl>
     **/
    private static boolean isPrime(final long candidate) {
        for (long i = 2; i * i < candidate; i++) { // Just test up to square
            if (0 == candidate % i) {                 // root of candidate.
                return false;
            }
        }
        return true;
    }
}
