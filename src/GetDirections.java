import java.util.*;

public class GetDirections extends GridLayout {
	static Scanner s = new Scanner(System.in);
	static Random rand = new Random();
	
	public void EnterDirections() {
		// declare & initialize variables
		char playAgain = 'y';
		int userDirection = 0;
		int findTreasure = 0; 
		int  randomNumber = rand.nextInt(10)+1;
		
		
//***************************************************************************************************************/		
/*		final int row = 10;
		final int col = 10;
		int randomNumber[][] = new int[row][col];
		for(int i = 0; i < randomNumber.length ; i++) { 
			System.out.println("");
			for(int j = 0; j < randomNumber[i].length; j++) {
				randomNumber[i][j] = rand1.nextInt(10);
				System.out.print(randomNumber[i][j] + " ");
			}
		}
		System.out.println("");
//**************************************************************************************************************/
		// ^ set a location of treasure at somewhere in the position of 1 - 10
 
		System.out.println("You are in the middle of grey swamp");		
		
		// display directions to user
		System.out.print("Enter values between 1 and 10 to reach treasure " +
				"Enter first value");
		
		do{ // this is the start of the do/while loop
			
			System.out.print(">> ");
			// get data from user
			userDirection = s.nextInt();
			System.out.println("");
			
			// increments the player position variable each time the user 
			// gets the guess wrong
			++findTreasure;
			
			// if user goes too far, do this code
			if(userDirection > randomNumber) {
				System.out.print("Come back");
			}
			
			// if user going in right direction, do this code
			else if(userDirection < randomNumber) {
				System.out.print("Keep Going"+ "");
			}
			
			// if user guess is correct, do this code
			else {    
				// display data to user, prompt if user wants to play again
				System.out.print("You found treasure, and it only took you "
				+findTreasure+" trys!nWould you like to play again (y/n)? ");
				playAgain = s.next().charAt(0);
				
				// if user wants to play again then re initialize the variables
				if(playAgain == 'y'|| playAgain =='Y') {
					// creates a line seperator if user wants to enter new data
					System.out.println("");
					setwRF("", 60, '-');
					
					findTreasure = 0;
					System.out.print("nnMake a guess (between 1-10):nn");
					// generate a new random number for the user to try & guess
					randomNumber = rand.nextInt(10)+1;
				}
			}
			System.out.println("");
		}
		
		while(playAgain =='y' || playAgain =='Y');
		// ^ do/while loop ends when user doesnt select 'Y'
		// display data to user
		System.out.println("Thanks for playing!!");	
	}
	
	public static void setwRF(String str, int width, char fill)
	{
		System.out.print(str);
		for (int x = str.length(); x < width; ++x)
		{
			System.out.print(fill);     
		}
	}
}
