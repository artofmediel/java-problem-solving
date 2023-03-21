package pr1caesarcipher;

import java.util.Scanner;

public class caesarcipher {

	public static void main(String[] args) {
		
		//caesar cipher -	is a simple substitution cipher where each 
		//					letter in the plain text is replaced with a letter with a fixed number
		//					of places down the alphabet
		
		//example:
		//if the number of places to shift is 3, the letter A would be converted  to letter D.
		//Using the same number of shifts, the letter X would be replaced with letter A. If we
		//change the number of shifts to 2, A would be C and X would be Z.
		
		//Problem:
		//Implement a Caesar Cipher.
		
		//Input:
		//Number of shifts and the plain text. Input will terminate with negative number of shifts.
		
		//Output:
		//Corresponding cipher text. Only letter will be converted. Special characters will be 
		//ignored and output will be as is.
		
		boolean isCapital = false;
		boolean isSmall = false;
		
		char[] AllCaps= {'A','B','C','D','E',
						'F','G','H','I','J',
						'K','L','M','N','O',
						'P','Q','R','S','T',
						'U','V','W','X','Y',
						'Z'};
		
		char[] smallCaps= {	'a','b','c','d','e',
							'f','g','h','i','j',
							'k','l','m','n','o',
							'p','q','r','s','t',
							'u','v','w','x','y',
							'z'};
		
		int shift = 0;
		char checkShift;
		String text = " ";
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("\n[Input a valid number only]\n[Negative value will exit the program]\nEnter shifts : ");
			shift = scanner.nextInt();
			scanner.nextLine();
			
			if(shift > 0) {
				System.out.print("Enter Text : ");
				text=scanner.nextLine();
				
					//scan the text
					for(int x = 0; x<=text.length()-1; x++) {
						
						//get the letter
						char letter = text.charAt(x);
						
						//scan if the letter is present in AllCaps array
						for(int y=0; y<=AllCaps.length-1;y++) {
							
							//if it match
							if(letter == AllCaps[y]) {
								
								//if the letter + input shift is greater than 25 
								if((y+shift)> 25) {
									//display character after looping back to array by subtraction
									System.out.print(AllCaps[(y+shift)-26]);
								} 
								//else shift normally by adding
								else {
									System.out.print(AllCaps[y+shift]);
								}
								isCapital = true;
							}
						}
						
						//scan if the letter is present in smallCaps array
						for(int y=0; y<=smallCaps.length-1;y++) {
							//if it match
							if(letter == smallCaps[y]) {
								
								//if the letter + input shift is greater than 25 
								if((y+shift)> 25) {
									//display character after looping back to array by subtraction
									System.out.print(smallCaps[(y+shift)-26]);
								} 
								//else shift normally by adding
								else {
									System.out.print(smallCaps[y+shift]);
								}
								isSmall = true;
							}
						}
						
						//if its a special character
						if(isCapital==false && isSmall==false) {
							System.out.print(letter);
						} 
						//set boolean values to false
						else {
							isCapital = false;
							isSmall = false;
						}
						
						
					}
			}
			
		} while (shift  > 0);

		scanner.close();
	}

}
