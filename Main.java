import java.util.Scanner;

/**
 * Calculates the slope of a line given 2 points
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // asks user for first x coordinate
    System.out.println("Please enter in the x coordinate of the first point");

    // declares and initializes first x coordinate variable
    double x1 = input.nextDouble();

    // asks user for first y coordinate
    System.out.println("Please enter in the y coordinate of the first point");

    // declares and initializes first y coordinate variable
    double y1 = input.nextDouble();

    // asks user for second x coordinate
    System.out.println("Please enter in the x coordinate of the second point");

    // declares and initializes second x coordinate variable
    double x2 = input.nextDouble();

    // asks user for second y coordinate
    System.out.println("Please enter in the y coordinate of the second point");

    // declares and initializes second y coordinate variable
    double y2 = input.nextDouble();

    // top half of slope equation
    double yTop = y2 - y1;

    // bottom half of slope equation
    double xBot = x2 - x1;

    // calculating the slope
    double slope = yTop / xBot;

    // displays slope to the user
    System.out.println("The slope of your line would be " + slope + ".");
    
  }
}
