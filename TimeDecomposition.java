import java.util.Scanner;

// Input: read a natural number n > 0
// Output: write the decomposition in hours, minutes and seconds

public class TimeDecomposition {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in); 
      int n = in.nextInt();
      int h = n / 3600;
      int m = (n % 3600) / 60;
      // int s = n % 60;
       int s = ((n % 3600) % 60);


      System.out.println(h+" hours, "+m+" minutes and "+s+" seconds");
     
   }
}

