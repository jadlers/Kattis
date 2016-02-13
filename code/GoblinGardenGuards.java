public class GoblinGardenGuards {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int[][] garden = new int[10001][10001];
		int numberOfGoblins = io.getInt();
		for (int i = 0; i < numberOfGoblins; i++) {
			int xPos = io.getInt();
			int yPos = io.getInt();
			garden[xPos][yPos]++;
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
				int xDist = xPos-xLow;
				int xDistSqr = xDist*xDist;
				for (int tempyLow = yLow; tempyLow <= yHi; tempyLow++) {
					int yDist = Math.abs(yPos-tempyLow);
					int yDistSqr = yDist*yDist;
					if (xDistSqr+yDistSqr <= radius*radius) {
						numberOfGoblins -= garden[xLow][tempyLow];
						garden[xLow][tempyLow] = 0;
					}
				}
			}
		}
		io.println(numberOfGoblins);
		io.flush();
	}
}
