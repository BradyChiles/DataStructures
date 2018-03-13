
public class Main{

	public static void main(String[] args) {
		
		Book wool = new Book();
		
		wool.setAuthor("Hugh Howey");
		wool.setTitle("Wool");
		wool.setIsbn("1476735115");
		
		System.out.println(wool.getAuthor());
		System.out.println(wool.getTitle());
		System.out.println(wool.getIsbn());
	}

}
