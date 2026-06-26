//Class FuelCosts
//  main()
//      num gallons = 0
//      num fuelEfficiency = 0
//      num pricePerGallon = 0
//      num costTo100Miles = 0
//      num fullTankDistance = 0
//      boolean validInput
//
//      do
//          output "Enter gallons of gas in tank: "
//          if (input is decimal || integer)
//              input gallons
//              validInput = true
//          else
//              output "Invalid input! Please enter a numeric value."
//              validInput = false
//          endif
//      while (!validInput)
//
//      do
//          output "Enter fuel efficiency (miles per gallon): "
//          if (input is decimal || integer)
//              input fuelEfficiency
//              validInput = true
//          else
//              output "Invalid input! Please enter a numeric value."
//              validInput = false
//          endif
//      while (!validInput)
//
//      do
//          output "Enter price of gas per gallon: "
//          if (input is decimal || integer)
//              input pricePerGallon
//              validInput = true
//          else
//              output "Invalid input! Please enter a numeric value."
//              validInput = false
//          endif
//      while (!validInput)
//
//      costTo100Miles = (100 / fuelEfficiency) * pricePerGallon
//      fullTankDistance = gallons * fuelEfficiency
//
//      output "Cost to drive 100 miles: $" + costTo100Miles
//      output "Distance on full tank: " + fullTankDistance + " miles"
//  return
//EndClass

import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0.0;
        double fuelEfficiency = 0.0;
        double pricePerGallon = 0.0;
        double costTo100Miles = 0.0;
        double fullTankDistance = 0.0;
        boolean validInput = false;
        // Input gallons
        do {
            System.out.print("Enter gallons of gas in tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                in.nextLine();
                validInput = false;
            }
        } while (!validInput);
        // Input fuel efficiency
        do {
            System.out.print("Enter fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                in.nextLine();
                validInput = false;
            }
        } while (!validInput);
        // Input price per gallon
        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                in.nextLine();
                validInput = false;
            }
        } while (!validInput);
        // Calculate cost to drive 100 miles and distance on full tank
        costTo100Miles = (100.0 / fuelEfficiency) * pricePerGallon;
        fullTankDistance = gallons * fuelEfficiency;
        System.out.println("Cost to drive 100 miles: $" + costTo100Miles);
        System.out.println("Distance on full tank: " + fullTankDistance + " miles");
    }
}
