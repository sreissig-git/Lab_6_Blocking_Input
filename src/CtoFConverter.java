//Class CtoFConverter
//  main()
//      num celsius = 0
//      num fahrenheit = 0
//      boolean validInput
//      do
//          output "Enter temperature in Celsius: "
//          input celsius
//          if (celsius == decimal || integer)
//              num fahrenheit = (celsius * 9/5) + 32
//              output celsius + "°C = " + fahrenheit + "°F"
//              validInput = true
//          else
//              output "Invalid input! Please enter a numeric value."
//              validInput = false
//          endif
//      while (!validInput)
//  return
//EndClass

import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        boolean validInput;
        do {
            System.out.println("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                validInput = true;
                // Convert to Fahrenheit using formula: F = (C * 9/5) + 32
                fahrenheit = (celsius * 9.0 / 5.0) + 32;
                System.out.println(celsius + "°C = " + fahrenheit + "°F");
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                in.nextLine();
                validInput = false;
            }
        } while (!validInput);
    }
}
// Freezing point of water is 32°F or 0°C. Boiling point of water is 212°F or 100°C.
