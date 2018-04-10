import java.util.*;
 
public class GuessingGame
{
	// global variable declarations
	static Scanner cin = new Scanner(System.in);
	static Random rand = new Random(); // this is the call to the "Random" class
	
	public static void main(String[] args)
	{
		// declare & initialize variables
		char playAgain = 'y';
		int userInput = 0;
		int numGuesses = 0; 
		int  randomNumber = rand.nextInt(1000)+1;
		// ^ get a number from the random generator in the range of 1 - 1000
 
		System.out.println("Welcome to My Programming Notes' Java Program.n");		
		
		// display directions to user
		System.out.print("I'm thinking of a number between 1 and 1000. Go " +
				"ahead and make your first guess.nn");
		
		do{ // this is the start of the do/while loop
			
			System.out.print(">> ");
			// get data from user
			userInput = cin.nextInt();
			System.out.println("");
			
			// increments the 'numGuesses' variable each time the user 
			// gets the guess wrong
			++numGuesses;
			
			// if user guess is too high, do this code
			if(userInput > randomNumber)
			{
				System.out.print("Too high! Think lower.n");
			}
			
			// if user guess is too low, do this code
			else if(userInput < randomNumber) 
			{
				System.out.print("Too low! Think higher.n");
			}
			
			// if user guess is correct, do this code
			else 
			{    // display data to user, prompt if user wants to play again
				System.out.print("You got it, and it only took you "
					+numGuesses+" trys!nWould you like to play again (y/n)? ");
				playAgain = cin.next().charAt(0);
				
				// if user wants to play again then re initialize the variables
				if(playAgain == 'y'|| playAgain =='Y') 
				{
					// creates a line seperator if user wants to enter new data
					System.out.println("");
					setwRF("", 60, '-');
					
					numGuesses = 0;
					System.out.print("nnMake a guess (between 1-1000):nn");
					// generate a new random number for the user to try & guess
					randomNumber = rand.nextInt(1000)+1;
				}
			}
			System.out.println("");
		}while(playAgain =='y' || playAgain =='Y');
		// ^ do/while loop ends when user doesnt select 'Y'
		// display data to user
		System.out.println("Thanks for playing!!");		
	}// end of main
 
	public static void setwRF(String str, int width, char fill)
	{
		System.out.print(str);
		for (int x = str.length(); x < width; ++x)
		{
			System.out.print(fill);     
		}
	}// end of setwRF 	
}// http://programmingnotes.org/

