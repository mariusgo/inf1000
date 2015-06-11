/**
 * Alt2. Second out of two ways of calculating the 
 * following: (1) amount of rainfall during the summer of 
 * 2013 (May, June + July), (2) average rainfall for all 
 * rainy days during the summer, (3) of a normal rainfall 
 * of 81 mm, what's the percentage of this amount from July 
 * 2013.
 * 
 * In this class three Month class objects (May, June and
 * July) is created. All necessary class values are assigned
 * and then used to do the same calculations as in class 
 * Alt1. But instead of doing it directly in the main 
 * method, all calculations are done in a set of 
 * Calculation class objects.
 * 
 * @author      Marius Olaussen
 */
public class Alt2 {
  
  /**
   * All calculations are done directly in the main method.
   * 
   * @param args Empty String-array from command prompt.
   */
  public static void main(String[] args) {
    // Months
    Month m1 = new Month("May", 89, 22);
    Month m2 = new Month("June", 127, 18);
    Month m3 = new Month("July", 19, 8);

    // General variables
    int nrMonths = 3; // Number of months
    int normalRainfall = 81; // in mm

    // Calculation #1: Sum amount of rainfall for May, June and July
    Calculation c1 = new Calculation();
    c1.sum(m1.getAmount());
    c1.sum(m2.getAmount());
    c1.sum(m3.getAmount());

    // Calculation #2: Sum amount of rainy days of May, June and July
    Calculation c2 = new Calculation();
    c2.sum(m1.getDays());
    c2.sum(m2.getDays());
    c2.sum(m3.getDays());

    // Calculation #3: Average rainfall in mm per month
    Calculation c3 = new Calculation();
    int averageMonth = c3.average(c1.getSum(), nrMonths);

    // Calculation #4: Average rainfall in mm per day
    Calculation c4 = new Calculation();
    int averageDay = c4.average(c1.getSum(), c2.getSum());

    // Calculation #5: Percentage of normal rainfall in mm for the month of July
    Calculation c5 = new Calculation();
    double percentNRJuly = c5.percentage(m3.getAmount(), normalRainfall);

    // Print results to terminal
    System.out.println("\n--------------------------------------------------------");
    System.out.println(" Rainfall in " + m1.getName() + ", " + m2.getName() + " and " + m3.getName() + " '13 for Blindern, Oslo");
    System.out.println("--------------------------------------------------------");
    System.out.println(" Rainfall in total:\t\t\t\t  " + c1.getSum() + " mm");
    System.out.println(" Average rainfall per month:\t\t\t   " + averageMonth + " mm");
    System.out.println(" Average rainfall per day:\t\t\t    " + averageDay + " mm");
    System.out.println(" Percentage of normal rainfall for " + m3.getName() + ":\t" + percentNRJuly + " %");
    System.out.println("\n--------------------------------------------------------");
  }
}
