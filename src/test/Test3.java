package test;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double m = max(3.1 , 40.4, -5);
		System.out.println(m);
	}
	
	public static double max(double... values) {
		double largest = Double.NEGATIVE_INFINITY;
		for (double v : values) {
			if (v > largest) {
				largest = v;
			}	
		}
		return largest;
	}
}
