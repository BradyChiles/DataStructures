package Package2;

import Package1.ClassTemplate;

public class ProgramB {

	public static void main(String[] args) {
		
		ClassTemplate ct1 = new ClassTemplate();
		//The only variable available in this class is the week variable due to its public access
		ct1.week = 1;
		
		
	}

}
