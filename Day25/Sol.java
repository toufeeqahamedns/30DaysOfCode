import java.util.*;

public class Sol {
    /**
    *   Improved O( n^(1/2)) ) Algorithm
    *    Checks if n is divisible by 2 or any odd number from 3 to sqrt(n).
    *    The only way to improve on this is to check if n is divisible by KNOWN PRIMES from 2 to sqrt(n).
    *
    *   @param n An integer to be checked for primality.
    *   @return true if n is prime, false if n is not prime.
    **/
    //public static boolean isPrime(int n){
        // check lower boundaries on primality
        // if( n == 2 ){ 
        //     return true;
        // } // 1 is not prime, even numbers > 2 are not prime
        // else if( n == 1 || (n & 1) == 0){
        //     return false;
        // }

        // // Check for primality using odd numbers from 3 to sqrt(n)
        // for(int i = 3; i <= Math.sqrt(n); i += 2){
        //     // n is not prime if it is evenly divisible by some 'i' in this range
        //     if( n % i == 0 ){ 
        //         return false;
        //     }
        // }
        // // n is prime
        // return true;
    //}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for(int i = 0; i < testCases; i++){
            int n = scan.nextInt();
            if( n == 2 ){ 
                System.out.println("Prime");
            } // 1 is not prime, even numbers > 2 are not prime
            else if( n == 1 || (n & 1) == 0){
                System.out.println("Not Prime");
            } else {
                // Check for primality using odd numbers from 3 to sqrt(n)
            for(int j = 3; j <= Math.sqrt(n); j += 2){
                // n is not prime if it is evenly divisible by some 'i' in this range
                if( n % j == 0 ){ 
                    System.out.println("Not Prime");
                }
            }
            // n is prime
            System.out.println("Prime");
        }
    
            
        }
        scan.close();
    }
}