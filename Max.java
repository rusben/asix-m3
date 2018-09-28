import java.util.Scanner;

public class Max {
   public static void main(String[] args) {
      // This program reads two numbers and writes their sum
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      int y = in.nextInt();

      // Write here your code:
      if (x < y) {
        System.out.println("The maximum between y="+y+" and x="+x+" is: y="+y);
      } else if (x > y) {
        System.out.println("The maximum between y="+y+" and x="+x+" is: x="+x);
      } else {
        System.out.println("x and y have the same value:"+x);
      }
    //  System.out.println("Tha maximum between");
   }
}
