import java.util.Scanner;

public class YahtzeeDriver {
	/*
	1. Creates a new instance of the YahtzeeGame class
	2. Calls the playGame method on the Yahtzee object
	3. Asks user if they would like to play again
	4. When the user is done playing, prints the number of games played, min, max, and average score
	*/
	public static void main(String[] args) {
		boolean wantKeepGoing = true;
		Scanner s = new Scanner(System.in);
		int score;
		int gameCounter = 0;
		int lowScore = 0;
		int highScore = 1;
		int avgScore = 1;
		int runningTotal = 0;
		while (wantKeepGoing) {
			YahtzeeGame myGame = new YahtzeeGame();
			System.out.println("Welcome to Jack's APCSA Yahtzee Game!");
			score = myGame.playGame();
			gameCounter++;
			runningTotal += score;
			System.out.println("Would you like to play again? (y/n)");
			String uInput = s.nextLine();
			if (uInput.equals("n")) {
				wantKeepGoing = false;
			}
			if(score < lowScore) lowScore = score;
			else if(score > highScore) highScore = score;
		}
			//Score work


		avgScore = runningTotal / gameCounter;
		System.out.println("High score="+highScore);
		System.out.println("Low score="+lowScore);
		System.out.println("Average score="+avgScore);
	}
}
