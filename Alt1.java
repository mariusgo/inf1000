/**
 * Alt1. First out of two ways of calculating the following:
 * (1) amount of rainfall during the summer of 2013 (May, 
 * June + July), (2) average rainfall for all rainy days 
 * during the summer, (3) of a normal rainfall of 81 mm, 
 * what's the percentage of this amount from July 2013.
 * 
 * In this class all calculations are done directly in the
 * main-method. See class Oblig1Alternativ2 for the same
 * calculations done with classes Month and Calculation.
 * 
 * @author Marius Olaussen
 */
public class Alt1 {
  public static void main(String[] args) {

    // Amount of rainfall per month in mm
    int rainfallMay = 89;
    int rainfallJune = 127;
    int rainfallJuly = 19;
    int rainfallTotal = rainfallMay + rainfallJune + rainfallJuly;

    // Aount of rainy days per month
    int rainyDaysMay = 22;
    int rainyDaysJune = 18;
    int rainyDaysJuly = 8;
    int rainyDaysTotal = rainyDaysMay + rainyDaysJune + rainyDaysJuly;

    // Calculation: average rainfall for day and month
    int averageDay = rainfallTotal / rainyDaysTotal;
    int averageMonth = rainfallTotal / 3;

    // Calculation: percentage of normal rainfall in mm
    int normalRainfall = 81;
    double percentJuly = ( (double) rainfallJuly * 100 ) / normalRainfall;
    percentJuly = (double) Math.round ( percentJuly * 100) / 100;

    // Print results to terminal
    System.out.println("During summer of '13 there was registered a rainfall of " + rainfallTotal + "mm in total.");
    System.out.println("Average rainfall per month: " + averageMonth + "mm.");
    System.out.println("Average rainfall per day: " + averageDay + "mm.");
    System.out.println("Rainfall in July '2013 was " + percentJuly + "% (of normal rainfall for July on average).");
  }
}
