
public class Tree {

	private Node root;

	public void find(String sData) {
		Node current = root;
		char lookKey = sData.charAt(0);
		while (!current.sData.equals(sData)) {
			 char key = current.sData.charAt(0);
			if (lookKey < key) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			if (current == null) {
				System.out.println("Name not found...");
				return;
			}
		}
		System.out.println(sData + " found. It is in the " + current.iData + " position.");
	}

	public void insert(int iData, String sData) {
		Node newNode = new Node();
		newNode.iData = iData;
		newNode.sData = sData;
		int key =  sData.charAt(0);
		if (root == null) {
			root = newNode;
			System.out.println(sData + " inserted in the " + iData + " postion.");
		} else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				int currentKey = current.sData.charAt(0);
				if (key < currentKey) {
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = newNode;
						System.out.println(sData + " inserted in the " + iData + " postion.");
						return;
					}
				} else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						System.out.println(sData + " inserted in the " + iData + " postion.");
						return;
					}
				}
			}
		}
	}

}
