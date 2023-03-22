package palindrometest;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		//palindrome - is a number that can be read the same way in either direction
		
		//12321,4536354 are exmples of palindrome number since they can be read the 
		//same way in either direction
		
		//Make a program that can accepts number of test of up to 10 and
		//output the following screen samples
		
		//SCREEN SAMPLE 1
		//INPUT
		//
		//Enter the number of test: 4
		//Test 1 : 12321
		//Test 2 : 2345432
		//Test 3 : 1234565432
		//Test 4 : 98765432109
		
		//OUTPUT
		//Input is a Palindrome Number.
		//Input is a Palindrome Number.
		//Input is not a Palindrome Number.
		//Input is not a Palindrome Number.
		
		//SCREEN SAMPLE 2
		//INPUT
		//
		//Enter the number of tests : 0
		//
		//OUTPUT
		//
		//Invalid number!
		
		//SCREEN SCREEN 3
		//INPUT
		//Enter the number of tests : 15
		//OUTPUT
		//
		//Invalid number!
		
		int testnum = 0;
		
		do {

			System.out.println("Input\n");
			
			System.out.print("Enter number of tests	:");
			Scanner scanner =new Scanner(System.in);
			testnum = scanner.nextInt();
			
			int[] num = new int[testnum];
			
			//check if testnum is not 0 or > 10
			if(testnum>0 && testnum<=10) {
				
				//ask for input
				for(int a=1;a<=testnum;a++) {
					
						System.out.print("Test " + a + " : ");
						Scanner palindrome = new Scanner(System.in);
						String input = palindrome.nextLine();
						int maxValue = Integer.MAX_VALUE;
						
						//check input if it will max the allowed value
						if (Float.parseFloat(input)>= (float)maxValue)
						{
							//The sample screen allowed more than the max value and return not palindrome...
							//System.out.println("Integer max value reached. Input different number.");
							//a--;	//decrement the index so that the next input will overwrite the previous one
							
							//...we do this instead
							
							//check it on string data format 
							
							//hold value
							String tempText = input;
							//set 2 pointers
							int leftPointer = 0;
							int rightPointer = tempText.length()-1;
							
							while(leftPointer <  rightPointer) {
								if(tempText.charAt(leftPointer) != tempText.charAt(rightPointer))
								{
									//store non palindrome value
									num[(a-1)] = Integer.MAX_VALUE;
								}
								else 
								{
									//store palindrome value
									num[(a-1)] = 121;	
								}
								leftPointer++;
								rightPointer--;
							}
							
							
							
						} else {
							num[(a-1)] = Integer.parseInt(input);
							//test
							//System.out.println(num[(a-1)] + " on index " + (a-1) + " num length is" + num.length);
						}
				}
				
			}
				//display output
				System.out.println("Output\n");
				
				//check testnum condition if 0 or more than 10
				if(testnum>0 && testnum<=10) {
				
					for(int a=0;a<=num.length-1;a++) {
						
							int copy = num[a];
							int rev =0;
							
							//reverse function
							while(copy!=0) {
								rev = (rev*10)+(copy%10);
								copy= copy/10;
							}
							
							//display result
							if(num[a]== rev) {
								System.out.println("Input is a Palindrome Number.");
							} else {
								System.out.println("Input is not a Palindrome Number.");
							}
						
					}
					
				} else {
					System.out.println("Invalid Number!");
				}
		System.out.println("-----------------------------");
		} while (testnum>0 && testnum<=10);
		
	}

}
