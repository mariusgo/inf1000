/**
 * Objects of Calculation can calculate and remember sums
 * and percentages. No constructor needed for this 
 * assignment.
 */
public class Calculation {
  private int sum;
  private double percent;

  /**
   * Method that takes an integer as parameter and adds it
   * to the sum.
   */
  void sum(int s) {
    sum += s;
  }

  /**
   * Method that returns the sum.
   *
   * @return The sum
   */
  int getSum() { return sum; }

  /**
   * Method that calculates the average and returns it
   *
   * @param s Sum.
   * @param n Number of months
   * @return Average of s/n
   */
  int average(int s, int n) { return s/n; }

  /**
   * Method that calculates the percentage and returns it
   *
   * @param a In this assignment: amount of rainfall
   * @param nr In this assignment: normal rainfall
   * @return Percentage of amount of rainfall from normal rainfall
   */
  double percentage(int a, int nr) {
    percent = ((a * 100) / (double)nr);
    percent = Math.round(percent * 100);
    return percent / 100;
  }
}
