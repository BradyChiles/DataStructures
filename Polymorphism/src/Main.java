
public class Main {
//Created by Brady Chiles
	public static void main(String [] args){
		Animal animal = new Animal();
		Animal cow = new Cow();
		Animal goat = new Goat();
		
		Animal[] animals = {goat, cow, animal};
		//For loop to execute methods
		for(Animal abc : animals){
			abc.walk();
		}
	}
}
//super class
class Animal{
	
	//super class method
	public void walk(){
		System.out.println("Animal walks");
	}
}
//sub class
class Cow extends Animal{
	//Override method
	public void walk(){
		System.out.println("Cow moves");
	}
}
//sub class
class Goat extends Animal{
	//Override method
	public void walk(){
		System.out.println("Goat walks");
	}
}