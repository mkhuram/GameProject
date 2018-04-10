
public class PlayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridLayout grid = new GridLayout();
		grid.PrintGrid(10, 10);
		
		EnterPlayer player1 = new EnterPlayer();
		player1.PlayerName();
		
		GetDirections dir = new GetDirections();
		dir.EnterDirections();
	}

}
