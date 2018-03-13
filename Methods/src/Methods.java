
public class Methods {

	public static void main(String[] args) {

		sum();
		sub(7.5, 4.3);
		double x = mult(7.5, 4.6);
		System.out.println(x);
	}

	//Dumb method: only does the same equation with the same variables
	public static void sum() {

		double a = 4.2, b = 2.5;
		double c = a + b;
		System.out.println(c);

	}
	//Clever method: Takes variables as an argument but does not return a variable to the main method for use.
	
	public static void sub(double a, double b){
		
		double c = a - b;
		System.out.println(c);
	}
	//Smart method: takes variables as arguments and returns a variable back to the main method for use.
	
	public static double mult(double a, double b){
		double	c = a * b;
		return c;
		
	}
}
