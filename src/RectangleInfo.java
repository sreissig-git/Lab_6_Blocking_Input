//Class Rectangle
//  main()
//      num width = 0
//      num height = 0
//      num area = 0
//      num perimeter = 0
//      num diagonal = 0
//      boolean validInput
//
//      do
//          output "Enter width of rectangle: "
//          if (input is decimal || integer)
//              input width
//              validInput = true
//          else
//              output "Invalid input! Please enter a numeric value."
//              validInput = false
//          endif
//      while (!validInput)
//
//      do
//          output "Enter height of rectangle: "
//          if (input is decimal || integer)
//              input height
//              validInput = true
//          else
//              output "Invalid input! Please enter a numeric value."
//              validInput = false
//          endif
//      while (!validInput)
//
//      area = width * height
//      perimeter = 2 * (width + height)
//      diagonal = sqrt(width^2 + height^2)
//
//      output "Area: " + area
//      output "Perimeter: " + perimeter
//      output "Diagonal: " + diagonal
//  return
//EndClass

import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;
        boolean validInput = false;
        // Input width
        do {
            System.out.println("Enter width of rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                in.nextLine();
                validInput = false;
            }
        } while (!validInput);
        // Input height
        do {
            System.out.println("Enter height of rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                in.nextLine();
                validInput = false;
            }
        } while (!validInput);
        // Calculate area and perimeter
        area = width * height;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt((width * width) + (height * height));
        // Print results
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}




