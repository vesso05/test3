package IntroducingJava;
import java.util.*;
import java.util.stream.IntStream;

public class Intro {


    /**
     * Finds the greatest common divisor of two numbers.
     * @param a integer entered by the user
     * @param b integer entered by the user
     * @return the greatest common divisor of both
     */
  public static int gcd(int a, int b)
  {
      while (a != b)
      {
          if (a > b)
          {
              a -= b;
          }
           else
          {
              b -= a;
          }
      }
      return a;

  }


  /**
     * Find the least common multiple of two numbers.
     * @param a integer entered by the user
     * @param b integer entered by the user
     * @return least common multiple of both
     */
    private static int lcm(int a, int b)

    {
        return a * (b / gcd(a, b));
    }








}
