
public class TreeApp {

	public static void main(String[] args) {
		
		Tree boysTree = new Tree();
		
		boysTree.insert(1, "Noah");
		boysTree.insert(2, "Liam");
		boysTree.insert(3, "Mason");
		boysTree.insert(4, "Jacob");
		boysTree.insert(5, "William");
		boysTree.insert(6, "Ethan");
		boysTree.insert(7, "James");
		boysTree.insert(8, "Alexander");
		boysTree.insert(9, "Michael");
		boysTree.insert(10, "Benjamin");
		
		boysTree.find("Liam");
		boysTree.find("Brady");
		boysTree.find("Greg");
		
		
		Tree girlsTree = new Tree();
		
		girlsTree.insert(1, "Emma");
		girlsTree.insert(2, "Olivia");
		girlsTree.insert(3, "Sophia");
		girlsTree.insert(4, "Ava");
		girlsTree.insert(5, "Isabella");
		girlsTree.insert(6, "Mia");
		girlsTree.insert(7, "Abigail");
		girlsTree.insert(8, "Emily");
		girlsTree.insert(9, "Charlotte");
		girlsTree.insert(10, "Harper");
		
		girlsTree.find("Abigail");
		girlsTree.find("Brady");
		girlsTree.find("Riley");
	}

}
