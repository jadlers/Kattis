public class Oddities {
	public static void main(String[] args){
	Kattio io = new Kattio(System.in, System.out);
	
	int amountOfNumbers = io.getInt();
		for (int i = 0; i < amountOfNumbers; i++) {
			int currentNumber = io.getInt();
			String evenOdd;
			if ((currentNumber / 2)*2 == currentNumber) {
				evenOdd = "even";
			} else {
				evenOdd = "odd";
			}
			io.println(currentNumber + " is " + evenOdd);
		}
		io.flush();
	}
}
