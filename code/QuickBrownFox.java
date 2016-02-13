import java.util.ArrayList;

public class QuickBrownFox {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int numberOfLines = io.getInt();

		String letters = "abcdefghijklmnopqrstuvwxyz";
		ArrayList<Character> chars = new ArrayList<>();

		for(int i = 0; i < letters.length(); i++){
			chars.add((char)Character.codePointAt(letters,i));
		}

		for (int i = 0; i < numberOfLines; i++) {
			ArrayList<Character> tempchars = (ArrayList<Character>) chars.clone();
			char[] line = io.getLine().toLowerCase().toCharArray();
			for (char current: line) {
				tempchars.remove(((Character) current));
			}
			if (tempchars.isEmpty()) {
				io.println("pangram");
			} else {
				io.print("missing ");
				tempchars.forEach(io::print);
				io.println();
			}
		}
		io.flush();
	}
}
