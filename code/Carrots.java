public class Carrots {
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		io.getInt();
		int p = io.getInt();
		io.println(p);
		io.close();
	}
}
