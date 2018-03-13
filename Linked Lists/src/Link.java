
public class Link {

	//Variables
	public int iData;
	public double dData;
	public Link next;

	// Constructors
	
	//Creates a Link with integer data, double data, and what the next link is
	public Link(int iData, double dData, Link next) {
		super();
		this.iData = iData;
		this.dData = dData;
		this.next = next;
	}

	//Creates a link with integer data, and double data
	public Link(int iData, double dData) {
		super();
		this.iData = iData;
		this.dData = dData;
	}
	
	//Method
	
	//Displays the link's data
	public void displayLink(){ 
		System.out.println("{" + iData + ", " + dData + "}");
	}

}
