/*
 * This class is a overview of how much code I have learned in robotics up to this date.
 * Author(Jacky Au-Yeung)
 * 10/9/17
 */
public class Homework2 {
	public static void main(String[] args)
	{
	int x = 1; //It turns 1 in to the whole number 1.
	double y = 1.0; // Gives the exact value of the number. 1 = 1.0
	char c = 'c'; // assigns a variable to the letter c.
	String leonard = "tutor"; // assigns leonard to the phrase tutor.
	boolean eric = false; // assigns eric to the boolean phrase false. 
	System.out.println(x);
	System.out.println();
	System.out.println(y);
	System.out.println();
	System.out.println(c);
	System.out.println();
	System.out.println(leonard);
	System.out.println();
	System.out.println(eric);
	System.out.println();
	
	x = (int) 1.0; //This converts 1.0 into a whole number (1). The cast converts 1.0 to a whole number.
	y = y += 3; //This turns the double of 1.0 to the value of 1.0 + 3.0 = 4.0.
	c = c += 15; // This turns the character c 15 letters deeper in the alphabet 3 - 18 is the same as c to r in the alphabet. The operator adds 3 to y.
	eric = x<y; // Since x is smaller than y it converts false into true. The operator < works as a conditional in this statement and changes eric to true.
	leonard = leonard += 1; // The relational operator of += adds leonard (tutor) to 1 so it comes out to be tutor1.
	System.out.println(x);
	System.out.println();
	System.out.println(y);
	System.out.println();
	System.out.println(c);
	System.out.println();
	System.out.println(leonard);
	System.out.println();
	System.out.println(eric);
	System.out.println();
	
	boolean robotics = x==y; //The operator of == acts as a conditional. x and y arent equal so robotics is set to be false.
	boolean keyboard = robotics&&eric; // The boolean operator && acts a conditional. since robotics and eric is false keyboard is set to false.
	System.out.println(robotics);
	System.out.println();
	System.out.println(keyboard);
	}
}
