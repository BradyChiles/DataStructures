package Package1;

public class ClassTemplate {
	
	//Default access modifier: assigned to a variable when you don't specify a modifier. 
	//Grants access to the variable to classes within the smae package as well as the class that contains it.
	int day = 0;
	
	//Public access modifier: grants access to all classes in the project.
	public int week = 0;
	
	//Protected access modifier: grants access to an subclasses that may be in other packages
	//as well as classes in the same package.
	protected int month = 0;
	
	//Private access modifier: grants access only to the class that has declared the variable.
	private int year = 0;
	
	public int printall(){
		
		return day + week + month + year;
		
	}
}
