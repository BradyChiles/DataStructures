package Package1;

public class ProgramA {

	public static void main(String[] args) {
		
		ClassTemplate ct = new ClassTemplate();
		//All of these variables are available to this class
		//The only one not available is year due to its private access
		ct.day = 1;
		ct.week = 3;
		ct.month = 5;
		
		
		int x = ct.printall();
		System.out.println(x);
		
	}

}
