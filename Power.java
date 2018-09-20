import java.util.Scanner;

public class Power {
   public static void main(String[] args) {
      // This program reads two numbers and writes their sum
      Scanner in = new Scanner(System.in); 
      int x = in.nextInt();
      int y = in.nextInt();
      int i = 0;
      int p = 1;
      
      while (i < y) { // Repeat several times (y)
      	i = i + 1;
	p = p*x;
      }

      System.out.println(p);
   }
}

