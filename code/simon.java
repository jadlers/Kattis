/**
 * Kattis problem "simonsays"
 * Created by jadlers on 2016-09-20.
 */
public class Simon {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int n = io.getInt();
		for (int i = 0; i < n; i++) {
			String line = io.getLine();
			String[] words = line.split("\\s");
			if (words.length >= 2 && words[0].equals("simon") && words[1].equals("says")) {
				if (words.length >= 3) {
					io.println(line.substring(11));
				} else {
					io.println();
				}
			} else {
				io.println();
			}
		}
		io.flush();
	}
}
