package vowelsconsonantschecker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Create a program that will find and display whether the entered character is a vowel,
		 * consonant, digit, or special char.
		 */
		
		boolean isVowel = false;
		boolean isConsonant = false;
		boolean isDigit = false;
		
		char[] Vowels= {'A','E','I','O','U'};
		
		char[] Consonants= {'B','C','D','F','G',
							'H','J','K','L','M',
							'N','P','Q','R','S',
							'T','V','W','X','Y','Z'};
		
		char[] Digit = {'0','1','2','3','4','5',
						'6','7','8','9'};
		
		System.out.println("INPUT\n");
		System.out.print("Enter a character : ");
		
		Scanner scanner=new Scanner(System.in);
		
		String value= scanner.nextLine();
		value = value.toUpperCase();	//to UpperCase
		char evaluate= value.charAt(0);	//get 1st character input
		
		System.out.println("OUTPUT\n");
		
			//check for Vowels
			for(int x=0;x<=Vowels.length-1;x++) {
				if(evaluate==Vowels[x]) {
					isVowel = true;
				}
			}
			//check for Consonants
			for(int x=0;x<=Consonants.length-1;x++) {
				if(evaluate==Consonants[x]) {
					isConsonant = true;
				}
			}
			//check for Digit
			for(int x=0;x<=Digit.length-1;x++) {
				if(evaluate==Digit[x]) {
					isDigit = true;
				}
			}
			
			//display output
			if(isVowel == true) {
				System.out.println("It is a Vowel Character.");
			}
			else if(isConsonant == true) {
				System.out.println("It is a Consonant Character.");
			}
			else if(isDigit == true) {
				System.out.println("It is a Digit Character.");
			}
			else {
				System.out.println("It is a Special Character.");
			}
			
			scanner.close();
			
	}

}
