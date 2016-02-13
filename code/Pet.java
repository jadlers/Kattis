public class Pet {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int[] contestants = new int[5];
		int k = -1;
		for (int i = 0; i < 20; i++) {
			if (i % 4 == 0) {
				k++;
			}
			contestants[k] += io.getInt();
		}
		int highestPerson = 0;
		int highestValue = contestants[0];
		for (int i = 0; i < 5; i++) {
			if (contestants[i] > highestValue) {
				highestValue = contestants[i];
				highestPerson = i;
			}
		}
		io.print(highestPerson + 1 + " " + highestValue);
		io.flush();
	}
}
