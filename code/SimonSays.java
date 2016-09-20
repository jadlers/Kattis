/**
 * Kattis problem "simonsays"
 * Created by jadlers on 2016-09-20.
 */
public class SimonSays {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int n = io.getInt();
		for (int i = 0; i < n; i++) {
			String line = io.getLine();
			String[] words = line.split("\\s");
			if (words[0].equals("Simon") && words[1].equals("says")) {
				io.println(line.substring(11));
			}
		}
		io.flush();
	}
}
