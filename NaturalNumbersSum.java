package tdd;

public class NaturalNumbersSum {
    public static void main(String[] args) {
      int num = 10;
      int sum = 0;
      for (int count = 1; count <= num; count++)
      {
          sum += count;
      }
      System.out.printf("The Sum of the first 10 natural numbers is %d", sum);
    }
}
