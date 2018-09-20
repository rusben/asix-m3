import java.util.Scanner;

// Input: read a natural number n > 0
// Output: write the decomposition in prime factors

public class PrimeFactors {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in); 
      int n = in.nextInt();
      int d = 2; // variable to store de divisors
     
      // Divide n by divisors from 2 in ascending order 
      while (n != 1) {
      	if (n%d == 0) {  // Check if divisible
          System.out.println(d);
	  n = n/d;
	} else {
	  d = d + 1;
	}
      }
   }
}

