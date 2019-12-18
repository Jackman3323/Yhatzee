public class YahtzeeSortDice
{
	int first;
	int second;
	int third;
	int fourth;
	int fifth;

	/* constructor: initializes the private data by sorting the order of the dice */
	public YahtzeeSortDice(int a, int b, int c, int d, int e) {
		int[] array = new int[]{a,b,c,d,e};
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) { //Hehe THANKS CSP FOR BUBBLE SORT!!!
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;

					sorted = false;
				}
			}
			first = array[0];
			second = array[1];
			third = array[2];
			fourth = array[3];
			fifth = array[4];

		}
	}

	/* returns the minimum of the five numbers */
	public int getFirst()
	{
		return first;
	}

	/* returns the second smallest of the five number */
	public int getSecond()
	{
		return second;
	}

	/* returns the middle of the five numbers */
	public int getThird()
	{
		return third;
	}

	/* returns the second largest of the five numbers */
	public int getFourth()
	{
		return fourth;
	}

	/* returns the biggest of the five numbers */
	public int getFifth()
	{
		return fifth;
	}
}