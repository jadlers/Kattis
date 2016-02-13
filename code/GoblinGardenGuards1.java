public class GoblinGardenGuards1 {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		boolean[][] garden = new boolean[10001][10001];
		int numberOfGoblins = io.getInt();
		int[] goblins = new int[numberOfGoblins*2];
		// Store the goblins in a array in the meantime
		for (int i = 0; i < goblins.length; i++) {
			int xPos = io.getInt();
			int yPos = io.getInt();
			goblins[i] = xPos;
			goblins[i+1] = yPos;
			i++;
		}
		int numberOfSprinklers = io.getInt();
		for (int i = 0; i < numberOfSprinklers; i++) {
			int xPos = io.getInt();
			int yPos = io.getInt();
			int radius = io.getInt();
			
			int xLow = xPos - radius;
			int xHi = xPos + radius;
			int yLow = yPos - radius;
			int yHi = yPos + radius;
			if (xLow < 0) {
				xLow = 0;
			}
			if (xHi > 10001) {
				xHi = 10001;
			}
			if (yLow < 0) {
				yLow = 0;
			}
			if (yHi > 10001) {
				yHi = 10001;
			}
			
			for(; xLow <= xHi; xLow++) {
				int xDist = Math.abs(xPos-xLow);
				int xDistSqr = xDist*xDist;
				for (int tempyLow = yLow; tempyLow <= yHi; tempyLow++) {
					int yDist = Math.abs(yPos-tempyLow);
					int yDistSqr = yDist*yDist;
					if (xDistSqr+yDistSqr <= radius*radius) {
						garden[xPos][yPos] = true;
					}
				}
			}
			for (int j = 0; j < goblins.length; j++) {
				int x = goblins[j];
				int y = goblins[j+1];
				j++;
				if (garden[x][y]) {
					numberOfGoblins--;
				}
			}
		}
		io.println(numberOfGoblins);
		io.flush();
	}
	
/*
5
0 0
36 34
0 100
100 100
50 50
1
0 0 50
*/
}
