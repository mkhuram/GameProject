import java.util.*;  

public class GridLayout {
	static Random rand1 = new Random();
	
	public void PrintGrid(int x, int y) {

		int myGrid[][] = new int[x][y];
		for(int i = 0; i < myGrid.length ; i++) { 
			System.out.println("");
			for(int j = 0; j < myGrid[i].length; j++) {
		//		myGrid[i][j] = rand1.nextInt(10);
				System.out.print(myGrid[i][j] + " ");
			}
		}
		System.out.println("");
	}
}

