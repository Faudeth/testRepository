import java.util.*;

public class Week3CodingAssignment {

	public static void main(String[] args) {
		
// Question 1		
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93, 31};
// Question 1A		
		System.out.println(ages[ages.length-1]);
// Question 1B		
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];	
		}
// Question 1C		
		int ageAverage = sum / ages.length;
		System.out.println(ageAverage);
		
		System.out.println();

// Question 2		
		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
// Question 2A		
		int nameLengthTotal = 0;
		for (String name : names) {
			nameLengthTotal += name.length();	
		}
		int nameLengthAverage = nameLengthTotal / names.length;
		System.out.println(nameLengthAverage);
// Questions 2B		
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();

// Question 3
		// To access the last element of an array, you would put the name of the array, then in parentheses put the name of the array followed by
		// .length and -1 to indicate the final position.
// Question 4
		// To access the first element of an array, you would put the name of the array followed by [0], indicating the first position.
// Question 5
		int [] nameLength = new int[6];
		
		for (int n = 0; n < names.length; n++) {
			nameLength[n] += names[n].length();
			System.out.println(nameLength[n]);
		}
		
		System.out.println();
// Question 6
		int sumName = 0;
		for (int name : nameLength) {
			sumName += nameLength.length;
		}
		System.out.println(sumName);
		
		System.out.println();
		
		String w = "Hello";
		int n = 3;
		System.out.println(getWord(w, n));
		
		System.out.println();
		
		String firstName = "Jacob";
		String lastName = "Pool";
		String fullName = createFullName(firstName, lastName);
		System.out.println(fullName);
		
		System.out.println();
		
		int[] numbers100 = {56, 2, 31, 18};
		System.out.println(isGreaterThan100(numbers100));
		
		System.out.println();
		
		double[] numDouble = {13.5, 18.4, 10.6};
		System.out.println(getAverage(numDouble));
		
		System.out.println();
		
		double[] doubleOne = {51.3, 20.4, 84.3, 49.2, 38.5};
		double[] doubleTwo = {30.6, 10.4, 18.3, 19.4, 94.6};
		System.out.println(isAverageHigher(doubleOne, doubleTwo));
		
		System.out.println();
		
		boolean isHotOutside = true;
		double moneyInPocket = 9.13;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		System.out.println();
		
		String[] classroom = {"Jim", "Lucy", "Todd", "Sally"};
		String s = "Sam";
		System.out.println(isInClass(classroom, s));
		
	} //end main
// Question 7
		public static String getWord(String w, int n) { 
			String temp = w;
			for (int i = 1; i < n; i++) {
				temp += w;
			}
			return temp;
		}				
		
		
// Question 8		
		public static String createFullName(String x, String y) {
			
		return x + " " + y;
		}

// Question 9
		public static boolean isGreaterThan100(int[] numbers100) {
			int sum100 = 0;
			for (int number : numbers100) {
				sum100 += number;
			}	
			
			if (sum100 > 100) {
				return true;
			} else {
				return false;
			}
			
		}

// Question 10
		public static double getAverage(double[] numDouble) {
			double sum = 0;
			for (double number : numDouble) {
				sum += number;
			}
			return sum / numDouble.length;
		}
// Question 11
		public static boolean isAverageHigher(double[] doubleOne , double[] doubleTwo) {
			double sumOne = 0;
			double sumTwo = 0;
			double averageOne = 0;
			double averageTwo = 0;
			
			for (double numberOne : doubleOne) {
				sumOne += numberOne;
			averageOne = sumOne / doubleOne.length;
			}
			for (double numberTwo : doubleTwo) {
				sumTwo += numberTwo;
			averageTwo = sumTwo / doubleTwo.length;	
			}
			if (averageOne > averageTwo) {
				return true;
			} else {
				return false;
			}			
		}
// Question 12		
		public static boolean willBuyDrink(boolean x, double y) {
			if ( (x) && (y > 10.50) ) {
				return true;
			} else {
				return false;
			}
		}
// Question 13
		public static boolean isInClass(String[] classroom, String s) {
			for (int i = 0; i < classroom.length; i++) {
				if (s == classroom[i]) {
					return true;
				}
			} 
			return false;
			
		}
}
