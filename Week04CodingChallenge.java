package week04;

import java.util.Scanner;

public class Week04CodingChallenge {
	
//Methods	
	
	public static String concatWord(String word, int n) {
		String concat = "";
		for (int i = 0; i < n; i++) {
			concat += word;
		}
		return concat;
	}
	
	public static String fullName(String first, String last) {
		String full = first + " " + last;
		return full;
		
	}	
		
	public static boolean overHundred(int[] ages) {
		boolean result = false;
		int ageTotal = 0;
		for (int i = 0; i < ages.length; i++) {
			ageTotal += ages[i];
		}
		if (ageTotal > 100) {
			result = true;
		}
		return result;
	}
	
	public static double doubleAverage(double[] dubs) {
		double dubSum = 0;
		double dubAve = 0;
		for (int i = 0; i < dubs.length; i++) {
			dubSum += dubs[i];
			dubAve = dubSum / dubs.length;
		}
		return dubAve;
	}
	
	public static boolean dubsCompare(double dubs, double newDubs) {
		if (dubs > newDubs) {
			return true;
		} else {
			return false;
		}
	}
		
	public static boolean willBuyDrink(boolean hot, double cash) {
		if (hot == true && cash > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String keepShirt(double like, int holes) {
		String shirtResult = "";
		if (like >= 7.5 && holes < 2) {
			shirtResult = "Yeah, there's a few good years left in 'er!";
		} else if (like >= 7.5 && holes >=2){
			shirtResult = "She's had a good run, but it's time to retire.";
		} else if (like < 7.5 && holes < 2) {
			shirtResult = "Have you ever even worn this hideous thing?";
		} else if (like < 5 && holes >= 2) {
			shirtResult = "Hey, there's my grease rag!";
		} else {
			shirtResult = "Is there anything else?";
		}
		return shirtResult;
		//This method checks two values input by the user: how much the user
		//likes a particular shirt on a scale of 1 to 10, and how may holes the
		//shirt has in it. It returns several results based on the value of the
		//input. I wrote this code because I have lots of shirts that I don't
		//necessarily like, and lots that I love but are very worn, but I have a
		//hard time getting rid of any of them.  This is meant to help out.
	}

//Body	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

//Question 1
		
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		
		ages[ages.length - 1] -= ages[0];
		
		System.out.println("1.");
		
		System.out.println("a) Last element minus first element equals " + ages[ages.length - 1]);
		
		//the assignment asks for me to add an age to the array, but
		//you cannot add an element to an array. I will create a
		//new array, ages2, that has all the original values plus a 
		//new age.
		
		int[] ages2 = { 3, 9, 23, 64, 2, 8, 28, 93, 55 };
		
		ages2[ages2.length - 1] -= ages2[0];

		System.out.println("b) New last element minus first element equals " + ages2[ages2.length - 1]);
		
		int total = 0;
		int average = 0;
		for (int i = 0; i < ages.length; i++) {
			total += ages[i];	
		}
		
		average = total / ages.length;
		
		System.out.println("c) The average age is " + average);
		
//Question 2
		
		System.out.println("2.");
		
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		
		int nameLength = 0;
		int nameAverage = 0;
		
		for (int j = 0; j < names.length; j++) {
			nameLength += names[j].length();
		}
		
		nameAverage = nameLength / names.length;
		
		System.out.println("a) The average length of names is " + nameAverage);
		
		String longName = "";
		
		for (int m = 0; m < names.length; m ++) {
			longName += (names[m] + " ");
		}
		
		System.out.println("b) " + longName);
		
//Question 3
		
		System.out.println("3. To access the last element in an array (arrayName) you type ");
		System.out.println("   the array name, then in square brackets the array name and");
		System.out.println("   .length with a minus one because the array starts at 0:");
		System.out.println("       arrayName[arrayName.length - 1]");
		
//Question 4
		
		System.out.println("4. To access the first element in that array, you type the array");
		System.out.println("   name with a '0' in square brackets, which means the first element");
		System.out.println("       arrayName[0]");
		
//Question 5
		
		System.out.println("5. ");
		
		int[] nameLengths = new int[names.length];
		
		for (int n = 0; n < nameLengths.length; n++) {
			nameLengths[n] = names[n].length();
			System.out.print(nameLengths[n] + " ");
		}
		System.out.println("");

		
//Question 6
		
		int nameLengthsSum = 0;
		for (int g = 0; g < nameLengths.length; g++) {
			nameLengthsSum += nameLengths[g];
		}
		
		System.out.println("6. nameLengthsSum = " + nameLengthsSum);
		
//Question 7
		
		System.out.println("7. Please enter a word.");
		String word = sc.next();
		System.out.println("Please enter the number (1-10) of times you want the word to concatinate.");
		int n = sc.nextInt();
			if (n <= 1 || n > 10) {
				System.out.println("Invalid number, for shame.");
			} else {
				System.out.println("The new string is " + concatWord(word, n));
			}
			
//Question 8
			
		System.out.println("8. Please enter a first name.");
		String firstName = sc.next();
		
		System.out.println("Please enter a last name.");
		String lastName = sc.next();
		
		System.out.println("The full name is " + fullName(firstName, lastName));
		
//Question 9
		
		System.out.println("9. T/F: All the ages in ages[] total more than 100. " + overHundred(ages));
		
		//Question 10
		
		double[] dubs = { 55, 87, 3, 14, 99, 43.3, 9.45, 16, 2.45 };

		System.out.println("10. The array dubs contains the doubles 55, 87, 3, 14, 99, 43.3, 9.45, 16, and 2.45.");
		System.out.println("    The average of the values in the array dubs is " + doubleAverage(dubs));

		//Question 11
		
		double[] newDubs = { 88, 14, 106, 25.5, 31, 94, 20, 66 };
	
		System.out.println("11. The array newDubs contains the doubles 88, 3.14, 106, 25.5, 31, 94, 20, and 66.");
		System.out.println("    The average of the values in the array newDubs is " + doubleAverage(newDubs));
		System.out.println("    It is " + dubsCompare(doubleAverage(dubs), doubleAverage(newDubs)) + " that the average of dubs is greater than the average of newDubs.");
		
//Question 12
		
		boolean isHotOutside = false;
		double moneyInPocket = 0.00;
		
		System.out.println("12. What is the temperature outside?");
		int temp = sc.nextInt();
		if (temp > 75) {
			isHotOutside = true;
		} 		
		
		System.out.println("How much money do you have on you?");
		moneyInPocket = sc.nextDouble();
						
		boolean shouldDrink = willBuyDrink(isHotOutside, moneyInPocket);
				
		if (shouldDrink == false) {
			System.out.println("Not today, fella.");
		} else if (shouldDrink == true){
			System.out.println("Yes, you should probably get a drink.");
		}
		
//Question 13
		
		System.out.println("13. On a scale of 1 to 10, how much do you like this shirt?");
		double like = sc.nextDouble();
		
		System.out.println("How many holes does it have?");
		int holes = sc.nextInt();
		
		System.out.println(keepShirt(like, holes));
				
	}
}
