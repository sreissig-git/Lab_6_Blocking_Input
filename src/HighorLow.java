//Class GuessingGame
//  main()
//      num randomNumber = 0
//      num guess = 0
//      boolean validInput
//
//      randomNumber = random int between 1 and 10 inclusive
//
//      do
//          output "Guess a number between 1 and 10: "
//          if (input is integer AND input >= 1 AND input <= 10)
//              input guess
//              validInput = true
//          else
//              output "Invalid input! Please enter an integer between 1 and 10."
//              validInput = false
//          endif
//      while (!validInput)
//
//      output "The random number was: " + randomNumber
//      if (guess == randomNumber)
//          output "You got it! That's correct!"
//      else if (guess < randomNumber)
//          output "Your guess was too low."
//      else
//          output "Your guess was too high."
//      endif
//  return
//EndClass

import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int randomNumber = 0;
        int guess = 0;
        boolean validInput = false;

        // Generate random number between 1 and 10 inclusive
        randomNumber = generator.nextInt(10) + 1;

        do {
            System.out.println("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                int input = in.nextInt();
                if (input >= 1 && input <= 10) {
                    guess = input;
                    validInput = true;
                } else {
                    System.out.println("Invalid input! Please enter an integer between 1 and 10.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input! Please enter an integer between 1 and 10.");
                in.nextLine();
                validInput = false;
            }
        } while (!validInput);

        // Show random number and compare to guess
        System.out.println("The random number was: " + randomNumber);
        if (guess == randomNumber) {
            System.out.println("You got it! That's correct!");
        } else if (guess < randomNumber) {
            System.out.println("Your guess was too low.");
        } else {
            System.out.println("Your guess was too high.");
        }
    }
}

