
public abstract class House {

	//abstract method
	//Must be implemented in child classes
	public abstract void build();
	
	
	public static void main(String[] args) {

		//Cannot create an instance of an abstract class
		//House house = new House();  -Creates error
		
		//You can however create instances of the child classes as Objects of the parent class
		
		House door = new Door();
		
		//Or you can create them as objects of themselves
		Window window = new Window();
		
		//The methods will work either way
		window.build();
		door.build();
	}
}
