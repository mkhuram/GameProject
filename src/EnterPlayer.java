import java.util.*;
public class EnterPlayer {
	Scanner s = new Scanner(System.in);
	public void PlayerName() {
		
		System.out.println("Please Enter Player Name: ");
		String name = s.nextLine();
		System.out.println(name+ "! You are in the middle of infinite Grey Swamp.");
	}
}
