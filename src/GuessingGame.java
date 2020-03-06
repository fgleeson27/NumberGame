import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		Random rand = new Random();
		int randomNumber = 1 + rand.nextInt(25);
		int numberOfTries = 0;
		Scanner input = new Scanner (System.in);
		int guess;
		boolean win = false;

		while (win == false) {

			// Takes user input
			System.out.println("Guess a number between 0 and 25: ");
			guess = input.nextInt();
			numberOfTries++;

			//Prints "You Win" if user guesses correctly
			if (guess == randomNumber) {
				win = true;
				System.out.println("You Win!");
			}

			//	Prints "You lose, the number was " and then prints the random number
			else if (guess != randomNumber) {
				System.out.println("You lose, the number was " + randomNumber);
			}
		}


	}
}

