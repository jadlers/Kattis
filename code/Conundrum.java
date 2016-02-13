public class Conundrum {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		String board = io.getWord().toUpperCase();
		int existingChars = board.length();
		for (int i = 0; i < board.length(); i++) {
			int modNum = i%3;
			if (modNum == 0) {
				if (board.charAt(i) == 'P') {
					existingChars--;
				}
			} else if (modNum == 1) {
				if (board.charAt(i) == 'E') {
					existingChars--;
				}
			} else {
				if (board.charAt(i) == 'R') {
					existingChars--;
				}
			}
		}
		io.print(existingChars);
		io.flush();
	}
}
