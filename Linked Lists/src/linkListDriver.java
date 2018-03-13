
public class linkListDriver {

	public static void main(String[] args) {

		LinkList myLinkList = new LinkList();

		System.out.println(myLinkList.isEmpty());
		myLinkList.insertFirst(12, 12.6);
		myLinkList.insertFirst(16, 18.6);
		myLinkList.insertFirst(45, 47.89);
		System.out.println(myLinkList.isEmpty());
		myLinkList.displayList();
		myLinkList.find(16);
		myLinkList.find(13);
		myLinkList.delete(12);
		myLinkList.deleteFirst();
		myLinkList.displayList();
	}

}
