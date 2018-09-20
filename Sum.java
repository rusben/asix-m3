import java.util.Scanner;

public class Sum {
   public static void main(String[] args) {
      // This program reads two numbers and writes their sum
      Scanner in = new Scanner(System.in); 
      int x = in.nextInt();
      int y = in.nextInt();
      int s = x + y;
      System.out.println(s);
   }
}

