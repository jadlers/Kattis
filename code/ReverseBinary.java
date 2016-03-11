/**
 * Created during class in programming.
 * Created by jadlers on 2016-03-11.
 * Run time: 0.14s
 */
public class ReverseBinary {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int n = io.getInt();

		char[] binary = Integer.toBinaryString(n).toCharArray();

		char[] reverseCopy = new char[binary.length];
		for (int i = binary.length - 1, j = 0; i >= 0; i--, j++) {
			reverseCopy[j] = binary[i];
		}

		int result = 0;
		int j = 0;
		for (int i = reverseCopy.length - 1; i >= 0; i--, j++) {
			result += Character.getNumericValue(reverseCopy[j]) * (int)Math.pow(2, i);
		}

		io.println(result);
		io.flush();
	}
}
