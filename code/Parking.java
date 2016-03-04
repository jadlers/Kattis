/**
 * Created during Övning.
 * Created by jadlers on 2016-03-04.
 */
public class Parking {
	static Kattio io;

	public static void main(String[] args) {
		io = new Kattio(System.in, System.out);

		int A = io.getInt();
		int B = io.getInt();
		int C = io.getInt();
		int[] carsInParking = new int[100];

		for (int i = 0; i < 3; i++) {
			int arrival = io.getInt();
			int departure = io.getInt();
			for (int j = arrival; j < departure; j++) {
				carsInParking[j]++;
			}
		}

		int totalCost = 0;
		for (int current : carsInParking) {
			switch (current){
				case 1:
					totalCost += A;
					break;
				case 2:
					totalCost += 2*B;
					break;
				case 3:
					totalCost += 3*C;
					break;
				default:
					break;
			}
		}
		io.println(totalCost);
		io.flush();
	}
}
