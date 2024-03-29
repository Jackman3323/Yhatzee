public class YahtzeeScorecard {
	/* instance data given */
	private YahtzeeSortDice sortDie;
	private int ones;
	private int twos;
	private int threes;
	private int fours;
	private int fives;
	private int sixes;
	private int threeKind;
	private int fourKind;
	private int fiveKind;
	private int chance;
	private int fullHouse;
	private int smStraight;
	private int lgStraight;
	private boolean bonus;

	/* Sets up a new game.  Sets all instance data to incomplete (-1). Sets bonus to false */
	public YahtzeeScorecard() {

		ones = -1;
		twos = -1;
		threes = -1;
		fours = -1;
		fives = -1;
		sixes = -1;
		threeKind = -1;
		fourKind = -1;
		fiveKind = -1;
		chance = -1;
		fullHouse = -1;
		smStraight = -1;
		lgStraight = -1;
		bonus = false;
	}

	/* 1. If the field is already full, return false
	   2. Set data value ones equal to number of ones rolled multiplied by one.
	   3. Update the bonus (call updateBonus())
	   4. Return true   */
	public boolean markOnes(int die1, int die2, int die3, int die4, int die5) {
		int current = 1;
		int counter = 0;
		for (int i = 0; i < 5; i++) {
			switch (i) {
				case 0:
					if (die1 == current) counter++;
					break;
				case 1:
					if (die2 == current) counter++;
					break;
				case 2:
					if (die3 == current) counter++;
					break;
				case 3:
					if (die4 == current) counter++;
					break;
				case 4:
					if (die5 == current) counter++;
					break;
			}
		}
		this.ones = counter * 1;
		updateBonus();
		if (this.ones != -1) return false;
		else return true;
	}

	/* 1. If the field is already full, return false
	   2. Set data value twos equal to number of twos rolled multiplied by two.
	   3. Update the bonus (call updateBonus())
	   4. Return true   */
	public boolean markTwos(int die1, int die2, int die3, int die4, int die5)
	{
		int current = 2;
		int counter = 0;
		for (int i = 0; i < 5; i++) {
			switch (i) {
				case 0:
					if (die1 == current) counter++;
					break;
				case 1:
					if (die2 == current) counter++;
					break;
				case 2:
					if (die3 == current) counter++;
					break;
				case 3:
					if (die4 == current) counter++;
					break;
				case 4:
					if (die5 == current) counter++;
					break;
			}
		}
		this.ones = counter * current;
		updateBonus();
		if (this.twos != -1) return false;
		else return true;
	}

	/* 1. If the field is already full, return false
	   2. Set data value threes equal to number of threes rolled multiplied by three.
	   3. Update the bonus (call updateBonus())
	   4. Return true  */
	public boolean markThrees(int die1, int die2, int die3, int die4, int die5)
	{
		int current = 3;
		int counter = 0;
		for (int i = 0; i < 5; i++) {
			switch (i) {
				case 0:
					if (die1 == current) counter++;
					break;
				case 1:
					if (die2 == current) counter++;
					break;
				case 2:
					if (die3 == current) counter++;
					break;
				case 3:
					if (die4 == current) counter++;
					break;
				case 4:
					if (die5 == current) counter++;
					break;
			}
		}
		this.ones = counter * current;
		updateBonus();
		if (this.threes != -1) return false;
		else return true;
	}

	/* 1. If the field is already full, the method returns false
	   2. Sets data value fours equal to number of fours rolled multiplied by four.
	   3. Update the bonus (call updateBonus())
	   4. Returns true   */
	public boolean markFours(int die1, int die2, int die3, int die4, int die5)
	{
		int current = 4;
		int counter = 0;
		for (int i = 0; i < 5; i++) {
			switch (i) {
				case 0:
					if (die1 == current) counter++;
					break;
				case 1:
					if (die2 == current) counter++;
					break;
				case 2:
					if (die3 == current) counter++;
					break;
				case 3:
					if (die4 == current) counter++;
					break;
				case 4:
					if (die5 == current) counter++;
					break;
			}
		}
		this.ones = counter * current;
		updateBonus();
		if (this.fours != -1) return false;
		else return true;
	}

	/* 1. If the field is already full, the method returns false
	   2. Sets data value fives equal to number of fives rolled multiplied by five.
	   3. Update the bonus (call updateBonus())
	   4. Returns true   */
	public boolean markFives(int die1, int die2, int die3, int die4, int die5)
	{
		int current = 5;
		int counter = 0;
		for (int i = 0; i < 5; i++) {
			switch (i) {
				case 0:
					if (die1 == current) counter++;
					break;
				case 1:
					if (die2 == current) counter++;
					break;
				case 2:
					if (die3 == current) counter++;
					break;
				case 3:
					if (die4 == current) counter++;
					break;
				case 4:
					if (die5 == current) counter++;
					break;
			}
		}
		this.ones = counter * current;
		updateBonus();
		if (this.fives != -1) return false;
		else return true;
	}

	/* 1. If the field is already full, the method returns false
	   2. Sets data value sixes equal to number of sixes rolled multiplied by six.
	   3. Update the bonus (call updateBonus())
	   4. Returns true */
	public boolean markSixes(int die1, int die2, int die3, int die4, int die5)
	{
		int current = 6;
		int counter = 0;
		for (int i = 0; i < 5; i++) {
			switch (i) {
				case 0:
					if (die1 == current) counter++;
					break;
				case 1:
					if (die2 == current) counter++;
					break;
				case 2:
					if (die3 == current) counter++;
					break;
				case 3:
					if (die4 == current) counter++;
					break;
				case 4:
					if (die5 == current) counter++;
					break;
			}
		}
		this.ones = counter * current;
		updateBonus();
		if (this.sixes != -1) return false;
		else return true;
	}

	/* 	1. If the field is already full, return false
		2. Check to see if there are actually three of the same value.
		   If there are, set the data value threeKind to the value of all five dice.
		   If there aren't set the value to 0.
	   	   (Hint: use YahtzeeSortDice class!)
	   	4. Return true   */
	public boolean markThreeOfAKind(int die1, int die2, int die3, int die4, int die5)
	{
		sortDie = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		if(this.threeKind == -1)return false;
		if((sortDie.getFirst() == sortDie.getSecond() && sortDie.getFirst() == sortDie.getThird() )||(
				sortDie.getSecond() == sortDie.getThird() && sortDie.getSecond() == sortDie.getFourth())||(
				sortDie.getThird() == sortDie.getFourth() && sortDie.getThird() == sortDie.getFifth())){
			this.threeKind = die1 + die2 + die3 + die4 + die5;
		}
		else{
			this.threeKind = 0;
		}
		return true;
	}

	/* 	1. If the field is already full, return false
		2. Check to see if there are actually four of the same value.
		   If there are, set the data value fourKind to the value of all five dice.
		   If there aren't set the value to 0;
		   (Hint: use YahtzeeSortDice class!)
		4. Return true  */
	public boolean markFourOfAKind(int die1, int die2, int die3, int die4, int die5)
	{
		sortDie = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		if(this.fourKind == -1)return false;
		if((sortDie.getFirst() == sortDie.getSecond() && sortDie.getFirst() == sortDie.getThird() && sortDie.getFourth() == sortDie.getFirst())||(
				sortDie.getSecond() == sortDie.getThird() && sortDie.getSecond() == sortDie.getFourth() && sortDie.getFirst() == sortDie.getFifth())){
			this.fourKind = die1 + die2 + die3 + die4 + die5;
		}
		else{
			this.fourKind = 0;
		}
		return true;
	}

	/* 1. If the field is already full, return false
	   2. Check to see if there are actually three die with the same value, and two with another value.
	      If there are, set the data value fullHouse to 25.
	      If there aren't set the value to 0.
	      (Hint: Use YahtzeeSortedDice class!)
       3. Return true   */
	public boolean markFullHouse(int die1, int die2, int die3, int die4, int die5)
	{
		sortDie = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		if(this.fullHouse == -1)return false;
		if(((sortDie.getFirst() == sortDie.getSecond() && sortDie.getFirst() == sortDie.getThird() )||(
				sortDie.getSecond() == sortDie.getThird() && sortDie.getSecond() == sortDie.getFourth())||(
				sortDie.getThird() == sortDie.getFourth() && sortDie.getThird() == sortDie.getFifth()))&&
				(sortDie.getFirst() == sortDie.getSecond() || sortDie.getSecond() == sortDie.getThird()
				|| sortDie.getThird() == sortDie.getFourth() || sortDie.getFourth() == sortDie.getFifth())){
			this.fullHouse = 25;
		}
		else this.fullHouse = 0;
		return true;
	}

	/* 	1. If the field is already full, return false
		2. Check to see if there are actually four consecutive dice numbers.
		   If there are, set the data value smStraight to 30.
		   If there aren't set the value to 0.
		   (Hint: Use YahtzeeSortedDice class)
		4. Return true  */
	public boolean markSmallStraight(int die1, int die2, int die3, int die4, int die5)
	{
		sortDie = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		if(this.smStraight == -1)return false;
		if((sortDie.getFirst() == sortDie.getSecond()-1 && sortDie.getSecond()
				== sortDie.getThird() -1 && sortDie.getThird() == sortDie.getFourth()-1)||
				(sortDie.getSecond() == sortDie.getThird()-1 && sortDie.getThird()
				== sortDie.getFourth() -1 && sortDie.getFourth() == sortDie.getFifth()-1)){
			this.smStraight = 30;
		}
		else this.smStraight = 0;
		return true;
	}

	/* 	1. If the field is already full, return false
		2. Check to see if there are actually five consecutive dice numbers.
		   If there are, set the data value lgStraight to 40.
		   If there aren't set the value to 0;
		   (Hint: use YahtzeeSortDice class!)
		3. Return true  */
	public boolean markLargeStraight(int die1, int die2, int die3, int die4, int die5)
	{
		sortDie = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		if(this.lgStraight == -1)return false;
		if(sortDie.getFirst() == sortDie.getSecond()-1 && sortDie.getSecond()
				== sortDie.getThird() -1 && sortDie.getThird() == sortDie.getFourth()-1
				&& sortDie.getFourth() == sortDie.getFifth() -1){
			this.lgStraight = 40;
		}
		else this.lgStraight = 0;
		return true;
	}

	/* 1. If the field is already full, return false
	   2. Checks to see if there are actually five of the same value.  If there are, set the data value fiveKind to 50.  If there aren�t set the value to 0;
       3. Return true   */
	public boolean markYahtzee(int die1, int die2, int die3, int die4, int die5)
	{
		sortDie = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		if(this.fiveKind == -1)return false;
		if(sortDie.getFirst() == sortDie.getSecond() && sortDie.getFirst() == sortDie.getThird()
				&& sortDie.getFirst() == sortDie.getFourth() && sortDie.getFirst()==sortDie.getFifth()){
			this.fiveKind = 50;
		}
		else this.fiveKind = 0;
		return true;
	}

	/* 1. If the field is already full, return false
	   2. Set the data value chance to the value of all five dice.
	   3. Return true  */
	public boolean markChance(int die1, int die2, int die3, int die4, int die5)
	{
		sortDie = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		if(this.chance == -1)return false;
		else this.chance = die1 + die2 + die3 + die4 + die5;
		return true;
	}

	/* 	1. If the bonus has already been assigned, do nothing
		2. If the upper section's total is 63 or greater, set the data value bonus to true */
	private void updateBonus()
	{

		if(!this.bonus && getUpperTotal() >= 63){//bonus = false and meets bonus condition
			bonus = true;
		}

	}

	/* 	returns the upper total, remember incompletes (-1s) should not be factored in! */
	public int getUpperTotal()
	{
		int total = 0;
		for(int i=0;i<6;i++){//loop through all top fields
			switch (i){
				case 0:
					if(this.ones!=-1) total += this.ones;
					break;
				case 1:
					if(this.twos!=-1)total += this.twos;
					break;
				case 2:
					if(this.threes!=-1)total += this.threes;
					break;
				case 3:
					if(this.fours!=-1)total += this.fours;
					break;
				case 4:
					if(this.fives !=-1)total += this.fives;
					break;
				case 5:
					if(this.sixes !=-1)total+=this.sixes;
					break;
			}
		}
		return total;
	}

	/* 	returns the lower total, remember incompletes (-1s) should not be factored in! */
	public int getLowerTotal()
	{
		int total = 0;
		for(int i = 6;i<13;i++){
			switch(i){
				case 6:
					if(this.threeKind != -1) total += this.threeKind;
					break;
				case 7:
					if(this.fourKind != -1)total += this.fourKind;
					break;
				case 8:
					if(this.fullHouse != -1)total += this.fullHouse;
					break;
				case 9:
					if(this.smStraight != -1)total += this.fullHouse;
					break;
				case 10:
					if(this.lgStraight != -1)total += this.fiveKind;
					break;
				case 11:
					if(this.chance != -1)total+=this.chance;
					break;
			}
		}
		return total;
	}

	/* 	returns the grand total, remember incompletes (-1s) should not be factored in! */
	public int getGrandTotal()
	{
		return getUpperTotal() + getLowerTotal();
	}

	/*	Prints a scorecard with the current total, using "__" to mark uncompleted fields and a number to mark filled fields
		Sample:
		**********************************
		*  	    Yahtzee Score Card		 *
		*  					`		  	 *
		* 	Ones:				__		 *
		* 	Twos:				__		 *
		* 	Threes:				__		 *
		* 	Fours:				__		 *
		* 	Fives:				25		 *
		* 	Sixes:				__		 *
		*								 *
		*	Upper Bonus:		 0		 *
		* 	Upper Total:   		25		 *
		*								 *
		*	3 of Kind:			__		 *
		* 	4 of Kind:			__		 *
		* 	Full House:			25		 *
		* 	Sm Straight:		__		 *
		* 	Lg  Straight:		__		 *
		* 	Yahtzee:	  		 0		 *
		* 	Chance:				__		 *
		*								 *
		* 	Lower Total:		25		 *
		*								 *
		* 	Grand Total:		50		 *
		**********************************
		already implemented
	*/
	public void printScoreCard()
	{
		System.out.println();
		System.out.println("*********************************");
		System.out.println("*      Yahtzee Score Card       *");
		System.out.println("*                               *");
		System.out.print("*  Ones:\t\t");
		if(ones==-1)System.out.print("__");
		else System.out.print(ones);
		System.out.println("\t*");
		System.out.print("*  Twos:\t\t");
		if(twos==-1)System.out.print("__");
		else System.out.print(twos);
		System.out.println("\t*");
		System.out.print("*  Threes:\t\t");
		if(threes==-1)System.out.print("__");
		else System.out.print(threes);
		System.out.println("\t*");
		System.out.print("*  Fours:\t\t");
		if(fours==-1)System.out.print("__");
		else System.out.print(fours);
		System.out.println("\t*");
		System.out.print("*  Fives:\t\t");
		if(fives==-1)System.out.print("__");
		else System.out.print(fives);
		System.out.println("\t*");
		System.out.print("*  Sixes:\t\t");
		if(sixes==-1)System.out.print("__");
		else System.out.print(sixes);
		System.out.println("\t*");
		System.out.println("*\t\t\t\t*");
		System.out.print("*  Upper Bonus:\t\t");
		if(bonus)System.out.print("35");
		else System.out.print("0");
		System.out.println("\t*");
		System.out.print("*  Upper Total:\t\t");
		System.out.print(this.getUpperTotal());
		System.out.println("\t*");
		System.out.println("*                               *");
		System.out.print("*  3 of Kind:\t\t");
		if(threeKind==-1)System.out.print("__");
		else System.out.print(threeKind);
		System.out.println("\t*");
		System.out.print("*  4 of Kind:\t\t");
		if(fourKind==-1)System.out.print("__");
		else System.out.print(fourKind);
		System.out.println("\t*");
		System.out.print("*  Full House:\t\t");
		if(fullHouse==-1)System.out.print("__");
		else System.out.print(fullHouse);
		System.out.println("\t*");
		System.out.print("*  Sm Straight:\t\t");
		if(smStraight==-1)System.out.print("__");
		else System.out.print(smStraight);
		System.out.println("\t*");
		System.out.print("*  Lg Straight:\t\t");
		if(lgStraight==-1)System.out.print("__");
		else System.out.print(lgStraight);
		System.out.println("\t*");
		System.out.print("*  Yahtzee:\t\t");
		if(fiveKind==-1)System.out.print("__");
		else System.out.print(fiveKind);
		System.out.println("\t*");
		System.out.print("*  Chance:\t\t");
		if(chance==-1)System.out.print("__");
		else System.out.print(chance);
		System.out.println("\t*");
		System.out.println("*                               *");
		System.out.print("*  Lower Total:\t\t");
		System.out.print(this.getLowerTotal());
		System.out.println("\t*");
		System.out.println("*                               *");
		System.out.print("*  Grand Total:\t\t");
		System.out.print(this.getGrandTotal());
		System.out.println("\t*");
		System.out.println("**********************************");
		System.out.println();
	}


}