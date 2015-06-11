/**
 * Objects of Month know their name, amount of rainfall in 
 * mm and amount of rainy days.
 */
public class Month {
  private String name;
  private int amount; // in mm
  private int days; // rainy days

  /**
   * The constructor takes a String n (name) and two 
   * integers a (amount of rainfall) and d (amount of rainy
   * days).
   *
   * @param n Name of the month.
   * @param a Amount of rainfall in mm.
   * @param d Amount of rainy days
   */
  Month(String n, int a, int d) {
    name = n;
    amount = a;
    days = d;
  }
  
  /**
   * Method that returns the name of the Month object.
   *
   * @return The name of the month
   */
  public String getName() { return name; }

  /**
   * Method that returns the amount of rainfall for the Month object.
   *
   * @return The amount of rainfall for the month in mm
   */
  public int getAmount() { return amount; }

  /**
   * Method that returns the amount of rainy days for the Month object.
   *
   * @return The amount of rainy days in the month
   */
  public int getDays() { return days; }
}
