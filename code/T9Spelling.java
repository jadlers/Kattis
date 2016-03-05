/**
 * Solution for problem: https://open.kattis.com/problems/t9spelling
 * Created by jadlers on 2016-03-05.
 * Running time = 0.17s
 */
public class T9Spelling {


	public static void main(String[] args) {
		Kattio io =  new Kattio(System.in, System.out);
		int numberOfLines = io.getInt();

		for (int i = 1; i <= numberOfLines; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("Case #");
			sb.append(i);
			sb.append(": ");
			// Work the line
			char[] chars = io.getLine().toCharArray();
			int lastChar = 999;
			for (char c : chars) {
				int charCode = getCharCode(c);
				if (charCode % 10 == lastChar) {
					sb.append(" ");
					sb.append(charCode);
				} else {
					sb.append(charCode);
				}
				lastChar = charCode % 10;
			}
			io.println(sb.toString());
			io.flush();
		}
	}

	private static int getCharCode(char character) throws IllegalArgumentException{
		switch (character) {
			case 'a':
				return 2;
			case 'b':
				return 22;
			case 'c':
				return 222;
			case 'd':
				return 3;
			case 'e':
				return 33;
			case 'f':
				return 333;
			case 'g':
				return 4;
			case 'h':
				return 44;
			case 'i':
				return 444;
			case 'j':
				return 5;
			case 'k':
				return 55;
			case 'l':
				return 555;
			case 'm':
				return 6;
			case 'n':
				return 66;
			case 'o':
				return 666;
			case 'p':
				return 7;
			case 'q':
				return 77;
			case 'r':
				return 777;
			case 's':
				return 7777;
			case 't':
				return 8;
			case 'u':
				return 88;
			case 'v':
				return 888;
			case 'w':
				return 9;
			case 'x':
				return 99;
			case 'y':
				return 999;
			case 'z':
				return 9999;
			case ' ':
				return 0;
		}
		throw new IllegalArgumentException();
	}
}
