import java.util.ArrayList;
import java.util.Collections;

public class OddManOut {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int numberOfCases = io.getInt();
		for (int i = 1; i <= numberOfCases; i++) {
			int numberOfParticipants = io.getInt();
			ArrayList<Integer> invNumbers = new ArrayList<>();
			for (int j = 0; j < numberOfParticipants; j++) {
				int nextValue = io.getInt();
				invNumbers.add(nextValue);
			}
			Collections.sort(invNumbers);
			boolean found = false;
			for (int j = 0; j < invNumbers.size() - 1 && !found; j++) {
				int firstValue = invNumbers.get(j);
				int secondValue = invNumbers.get(j+1);
				j++;
				if (firstValue != secondValue) {
					io.println("Case #" + i + ": " + firstValue);
					found = true;
				}
			}
			if (!found) {
				io.println("Case #" + i + ": " + invNumbers.get(invNumbers.size()-1));
			}
		}
		io.flush();
	}
}
