import java.util.Scanner;
import java.util.StringTokenizer;

public class YahtzeeGame {
	/* instance data should include the five yahtzee dice, a scoreboard, and a CONSTANT (static final) variable NUM_SIDES
	which should be set to six (the number of sides on a yahtzee die) */
	static final int NUM_SIDES = 6;
	private YahtzeeDie die1, die2, die3, die4, die5;
	private YahtzeeScorecard scorecard;


	/* initializes the dice and scoreboard */
	public YahtzeeGame() {
		die1 = new YahtzeeDie(NUM_SIDES);
		die2 = new YahtzeeDie(NUM_SIDES);
		die3 = new YahtzeeDie(NUM_SIDES);
		die4 = new YahtzeeDie(NUM_SIDES);
		die5 = new YahtzeeDie(NUM_SIDES);
		scorecard = new YahtzeeScorecard();
	}

	/* check to see if the game is over, and while the game is not over call the method takeTurn()
	once the game ends (hint: there are 13 turns in a game of Yahtzee), the method should print a
	final scorecard and return the grand total */
	public int playGame() {
		for (int i = 0; i < 13; i++) {
			takeTurn();
		}
		scorecard.printScoreCard();
		return scorecard.getGrandTotal();
	}

	/* 	1. call rollDice()
		2. call printDice()
		3. Ask the user if they are satisfied with their roll, or if they would like to roll again.
		   If they are not satisfied continue, otherwise call markScore()
		4. call chooseFrozen()
		5. call rollDice()
		6. call printDice()
		7. Ask the user if they are satisfied with their roll, or if they would like to roll again.
		   If they are not satisfied continue, otherwise call markScore()
		8. call chooseFrozen()
		9. call rollDice()
		10. call printDice()
		11. call markScore()
	*/
	private void takeTurn() {
		Scanner scan = new Scanner(System.in);
		rollDice();
		printDice();
		System.out.println("Are you satisfied with your roll(s)? Or would you like to roll again(r)?(s/r):");
		String uInput = scan.nextLine();
		if (uInput.equals("s")) {
			markScore();
		} else {
			chooseFrozen();
			rollDice();
			printDice();
			System.out.println("Are you satisfied with your roll(s)? Or would you like to roll again(r)?(s/r):");
			String uInput2 = scan.nextLine();
			if (uInput2.equals("s")) {
				markScore();
			} else {
				chooseFrozen();
				rollDice();
				printDice();
				markScore();
			}
		}
	}


	/* Rolls all unfrozen dice.  Also resets all dice to the unfrozen state after the roll */
	private void rollDice() {
		for (int i = 0; i < 5; i++) {//loops to roll each die
			switch (i) { //Rolls die if they arent frozen
				case 0:
					if (!die1.isFrozen()) die1.rollDie();
					break;
				case 1:
					if (!die2.isFrozen()) die2.rollDie();
					break;
				case 2:
					if (!die3.isFrozen()) die3.rollDie();
					break;
				case 3:
					if (!die4.isFrozen()) die4.rollDie();
					break;
				case 4:
					if (!die5.isFrozen()) die5.rollDie();
					break;
			}
		}
		die1.unfreezeDie();
		die2.unfreezeDie();
		die3.unfreezeDie();
		die4.unfreezeDie();
		die5.unfreezeDie();
	}

	/* Asks the user which dice should be frozen 1-5 (should be read in in one line) */
	private void chooseFrozen() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which die would you like to freeze? (1-5, separate with a space): ");
		String uInput = scan.nextLine();
		StringTokenizer st = new StringTokenizer(uInput);
		int i = 0;
		while (st.hasMoreTokens()) {//start at 0, increase per iteration, go until have iterated same amnt as num of tokens in input

			String currentToken = st.nextToken();
			try {
				int currentDie = Integer.parseInt(currentToken);

				switch (currentDie) {
					case 1:
						die1.freezeDie();

						break;

					case 2:
						die2.freezeDie();

						break;
					case 3:
						die3.freezeDie();

						break;
					case 4:
						die4.freezeDie();

						break;
					case 5:
						die5.freezeDie();

						break;
				}
			} catch (NumberFormatException nfe) {
				System.out.println("You entered something wrong. Whatever you were trying to freeze by saying \""
						+ currentToken + "\" was not frozen.");
			}
			i++;
		}
	}

	/* Should print the value of all five dice separated by a tab (\t) to the console */
	private void printDice() {
		System.out.println(die1.getValue() + "\t" + die2.getValue() + "\t" +
				die3.getValue() + "\t" + die4.getValue() + "\t" + die5.getValue());
	}

	/* 1. Print a scoreboard
	   2. Ask the user where they would like to mark their score.
	   3. Call appropriate function
	   4. If false is returned the user entered an invalid number, so ask the user to try again	*/
	private void markScore() {
		Scanner scan = new Scanner(System.in);
		scorecard.printScoreCard();
		System.out.print("Where would you like to place your score? \n1. Ones\t7. " +
				"3 of Kind\n2. Twos  \t8. 4 of Kind\n3. Threes\t9. Full House\n4. Fours\t10. " +
				"Sm Straight\n5. Fives\t11.Lg Straight\n6. Sixes\t12.Yahtzee\n\t13. Chance\nEnter 1-13:");

		boolean done = false;
		while (!done) {
			int uInput = scan.nextInt();
			switch (uInput) {
				case 1:
					if (!scorecard.markOnes(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
						System.out.println("You already did that!! Stop cheating and enter something you haven't already done: ");
					}
					else{
						done = true;
					}
					break;
				case 2:
					if (!scorecard.markTwos(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
						System.out.println("You already did that!! Stop cheating and enter something you haven't already done: ");
					}
					else{
						done = true;
					}
					break;
				case 3:
					if (!scorecard.markThrees(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
						System.out.println("You already did that!! Stop cheating and enter something you haven't already done: ");
					}
					else{
						done = true;
					}
					break;
				case 4:
					if (!scorecard.markFours(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
						System.out.println("You already did that!! Stop cheating and enter something you haven't already done: ");
					}
					else{
						done = true;
					}
					break;
				case 5:
					if (!scorecard.markFives(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
						System.out.println("You already did that!! Stop cheating and enter something you haven't already done: ");
					}
					else{
						done = true;
					}
					break;
				case 6:
					if (!scorecard.markSixes(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
						System.out.println("You already did that!! Stop cheating and enter something you haven't already done: ");
					}
					else{
						done = true;
					}
					break;
				case 7:
					if (!scorecard.markThreeOfAKind(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
						System.out.println("You already did that!! Stop cheating and enter something you haven't already done: ");
					}
					else{
						done = true;
					}
					break;
				case 8:
					if (!scorecard.markFourOfAKind(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
						System.out.println("You already did that!! Stop cheating and enter something you haven't already done: ");
					}
					else{
						done = true;
					}
					break;
				case 9:
					if (!scorecard.markFullHouse(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
						System.out.println("You already did that!! Stop cheating and enter something you haven't already done: ");
					}
					else{
						done = true;
					}
					break;
				case 10:
					if (!scorecard.markSmallStraight(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
						System.out.println("You already did that!! Stop cheating and enter something you haven't already done: ");
					}
					else{
						done = true;
					}
					break;
				case 11:
					if (!scorecard.markLargeStraight(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
						System.out.println("You already did that!! Stop cheating and enter something you haven't already done: ");
					}
					else{
						done = true;
					}
					break;
				case 12:
					if (!scorecard.markYahtzee(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
						System.out.println("You already did that!! Stop cheating and enter something you haven't already done: ");
					}
					else{
						done = true;
					}
					break;
				case 13:
					if (!scorecard.markChance(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
						System.out.println("You already did that!! Stop cheating and enter something you haven't already done: ");
					}
					else{
						done = true;
					}
					break;
			}
		}
	}
}