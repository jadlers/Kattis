public class EstCircle {
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		double realRadius = io.getDouble();
		int dotsInCircle = io.getInt();
		int totalDots = io.getInt();
		while (totalDots != 0) {
			double realArea = realRadius*realRadius*Math.PI;
			double squareArea = Math.pow(realRadius*2, 2.0);
			double ratio = (double) totalDots / dotsInCircle;
			double calcArea = squareArea*ratio;
			io.print(realArea + " ");
			io.println(calcArea);
			realRadius = io.getDouble();
			dotsInCircle = io.getInt();
			totalDots = io.getInt();	
		}
		io.flush();
	}
}
