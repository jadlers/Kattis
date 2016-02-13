public class SpeedLimit {
	private final Kattio io;
	
	public static void main(String[] args) {
		SpeedLimit sl = new SpeedLimit();
		sl.printDistances();
	}
	
	public SpeedLimit() {
		io = new Kattio(System.in, System.out);
	}
	
	private void printDistances() {
		int newBatch = io.getInt();
		while(newBatch != -1) {
			io.println(""+calcDistance(newBatch) + " miles");
			newBatch = io.getInt();
		}
		io.flush();
	}

	public int calcDistance(int numberOfRecords) {
		int distance = 0;
		int lastStartTime = 0;
		for (int i = 0; i < numberOfRecords; i++) {
			int v = io.getInt();
			int t = io.getInt();
			distance += v*(t-lastStartTime);
			lastStartTime = t;
		}
		return distance;
	}
}
