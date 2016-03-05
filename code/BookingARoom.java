import java.util.Arrays;

/**
 * Solution for problem: https://open.kattis.com/problems/bookingaroom
 * Created by jadlers on 2016-03-05.
 * Running time: 0.12s
 */
public class BookingARoom {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int numberOfRooms = io.getInt();
		boolean[] rooms = new boolean[numberOfRooms + 1];
		int bookedRooms = io.getInt();
		for (int i = 1; i <= bookedRooms; i++) {
			rooms[io.getInt()] = true;
		}

		boolean printed = false;
		for (int i = 1; i < rooms.length; i++) {
			if (!rooms[i]) {
				io.println(i);
				printed = true;
				break;
			}
		}
		if (!printed) {
			io.println("too late");
		}
		io.flush();
	}
}
