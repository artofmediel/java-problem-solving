package collisiontest;

import java.util.Scanner;

public class collisiontest {

	public static void main(String[] args) {

		/*
		 * Introduction
		 * In game programming one basic problem is to determine if two objects collide. Collision
		 * often affects how different objects interact with other or with the environment
		 * 
		 *  Example:
		 *  Two represent objects. We will be using rectangles. If the rectangles intersect. 
		 *  then there is collision.
		 * 
		 * In the diagram below. R1 and R2 are intersecting, because some points of 
		 * R1 are in R2 and vice-versa
		 * 
		 * 
		 * 				_ _ _ _ _
		 * 				|		|
		 * 				|	 _ _|_ _ _
		 * 				|_ _ |_ |	 |
		 * 					 |		 |
		 * 					 |_ _ _ _|
		 * 
		 * In the diagram below. R1 and R2 are intersecting, because the corner of R1 overlaps 
		 * with the corner of R2
		 * 
		 * 				_ _ _ _ _
		 * 				|		|
		 * 				|		|
		 * 				|_ _ _ _|_ _ _ _
		 * 						|       |
		 * 						|       |
		 * 						|_ _ _ _|
		 * 
		 * In the diagram below, R1 and R2 are intersecting, because the edge 
		 * of R1 is along the edge of R2
		 * 
		 * 				_ _ _ _ _
		 * 				|		|
		 * 				|		|
		 * 				|_ _ _ _|
		 * 				|		|
		 * 				|		|
		 * 				|_ _ _ _|
		 * 
		 * 
		 * In the diagram below, R1 and R2 do not intersect
		 * 
		 * 			    _ _ _ _ _
		 * 				|		|
		 * 				|	    | _ _ _ _ _
		 * 				|_ _ _ _| |	      |
		 * 					 	  |       |
		 * 					      |_ _ _ _|
		 * 
		 * PROBLEM
		 * check if two rectangles are intersecting or not
		 * 
		 * Input:
		 * Set of 4 points representing 2 rectangles. 
		 * The first point represent the LOWER LEFT and UPPER RIGHT corners of R1
		 * The rest represent the LOWER LEFT and UPPER RIGHT corners of R2.
		 * The x and y coordinates of the point is separated by a space, one line of input per point.
		 * 
		 * Assume that the rectangles have no rotation. 
		 * The x-axis of the rectangle is parallel with the x-axis of the plane
		 * 
		 * Assume that the plane starts at (0,0) and extends up to (infinity,infinity)
		 * 
		 * Negative input will terminate the program
		 * 
		 * Output:
		 * Display "Collision" if the rectangles intersect,
		 * otherwise, display "No Collision".
		 * 
		*/	
		
		//Declare two 2D arrays
		int[][] R1 = new int[2][2];
		int[][] R2 = new int[2][2];
		
		//for program looping
		boolean loop = true;
		
		
		do {
			
			System.out.println("INPUT R1 corner points:");
			//Input UpperLeft corner of R1
			Scanner input1 = new Scanner(System.in);
			R1[0][0] = input1.nextInt();
			input1.nextLine();
			//System.out.print("r1ul " + R1[0][0]);
			// check if input is non zero,
			if(R1[0][0] >= 0) {
				
				//Input UpperRight corner of R1
				Scanner input2 = new Scanner(System.in);
				R1[0][1] = input2.nextInt();
				input2.nextLine();
				//System.out.println("r1ur"+ R1[0][1]);
				// check if input is non zero,
				if(R1[0][1] >= 0) {
					
					//Input LowerLeft corner of R1
					Scanner input3 = new Scanner(System.in);
					R1[1][0] = input3.nextInt();
					input3.nextLine();
					//System.out.print("r1ll "+ R1[1][0]);
					// check if input is non zero,
					if(R1[1][0] >= 0) {
						
						//Input LowerRight corner of R1
						Scanner input4 = new Scanner(System.in);
						R1[1][1] = input4.nextInt();
						input4.nextLine();
						//System.out.println("r1lr"+ R1[1][1]);
						// check if input is non zero,
						if(R1[1][1] >= 0) {
							
							System.out.println("INPUT R2 corner points:");
							//Input UpperLeft corner of R2
							Scanner input5 = new Scanner(System.in);
							R2[0][0] = input5.nextInt();
							input5.nextLine();
							//System.out.print("r2ul ");
							// check if input is non zero,
							if(R2[0][0] >= 0) {
								
								//Input UpperRight corner of R2
								Scanner input6 = new Scanner(System.in);
								R2[0][1] = input6.nextInt();
								input6.nextLine();
								//System.out.println("r2ur");
								// check if input is non zero,
								if(R2[0][1] >= 0) {
									
									//Input LowerLeft corner of R2
									Scanner input7 = new Scanner(System.in);
									R2[1][0] = input7.nextInt();
									input7.nextLine();
									//System.out.print("r2ll ");
									// check if input is non zero,
									if(R2[1][0] >= 0) {
										
										//Input LowerRight corner of R2
										Scanner input8 = new Scanner(System.in);
										R2[1][1] = input8.nextInt();
										input8.nextLine();
										//System.out.println("r2lr\n");
										// check if input is non zero,
										if(R2[1][1] >= 0) {
											
											//check and display points
											System.out.println("Check and display POINTS\nR1\n"+ R1[0][0] + "\t\t" +R1[0][1]+ "\n"+ R1[1][0] + "\t\t" +R1[1][1]+"\n\n");
											System.out.println("R2\n"+ R2[0][0] + "\t\t" +R2[0][1]+ "\n"+ R2[1][0] + "\t\t" +R2[1][1]+"\n\n");
											
											//OUTPUT Conditions
											if(R1[0][1] == R2[0][0]) {
												//R1 UpperRight and R2 UpperLeft collision
												System.out.println("Collision\n");
											} 
											else if(R1[1][0] == R2[0][0]) {
												//R1 LowerLeft and R2 UpperLeft collision
												System.out.println("Collision\n");
											} 
											else if(R1[1][1] == R2[0][0]) {
												//R1 LowerRight and R2 UpperLeft collision
												System.out.println("Collision\n");
											} 
											else if(R2[0][0] == R1[1][1]) {
												//R2 UpperLeft and R1 LowerRight collision
												System.out.println("Collision\n");
											} 
											else if(R2[1][0] == R1[0][1]) {
												//R2 LowerLeft and R1 UperRight collision
												System.out.println("Collision\n");
											} 
											else if(R2[0][0] == R1[0][1]) {
												//R2 UpperLeft and R1 UpperRight collision
												System.out.println("Collision\n");
											} else {
												System.out.println("No Collision\n");
											}
											
										} else {
											input1.close();
											input2.close();
											input3.close();
											input4.close();
											input5.close();
											input6.close();
											input7.close();
											input8.close();
											loop=false;
											break;
										}
									} else {
										input1.close();
										input2.close();
										input3.close();
										input4.close();
										input5.close();
										input6.close();
										input7.close();
										loop=false;
										break;
									}
								} else {
									input1.close();
									input2.close();
									input3.close();
									input4.close();
									input5.close();
									input6.close();
									loop=false;
									break;
								}
							} else {
								input1.close();
								input2.close();
								input3.close();
								input4.close();
								input5.close();
								loop=false;
								break;
							}
						} else {
							input1.close();
							input2.close();
							input3.close();
							input4.close();
							loop=false;
							break;
						}
					} else {
						input1.close();
						input2.close();
						input3.close();
						loop=false;
						break;
					}
				} else {
					input1.close();
					input2.close();
					loop=false;
					break;
				}
			} else {
				input1.close();
				loop=false;
				break;
			}
			
		}while(loop=true);
	}
	
	
}
