
public class LinkList {

	// Variable
	private Link first;

	// Constructor
	public LinkList() {
		first = null;
	}

	// Methods

	// Checks to see if list is empty
	public boolean isEmpty() {
		return (first == null);
	}

	// Inserts link at beginning of list
	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd); // step 1 - create object
		newLink.next = first; // step 2 - link to end of list
		first = newLink; // step 3 - point to new object
	}

	// Find a link with a given key (int data)
	public void find(int key) {
		if (!this.isEmpty()) {
			Link current = first; // Start at 'first'
			while (current.iData != key) { // While there is no match
				if (current.next == null) { // If end of list
					System.out.println("Link not found."); // Link not found
					break;
				} else if (current.iData == key) {
					current.displayLink(); // Found it
				} else {
					current = current.next; // Go to the next link
				}
			}

		} else {
			System.out.println("Link List is empty."); // If empty will return
														// empty statement
		}
	}

	// Delets the firts link of list
	public Link deleteFirst() {
		if (!this.isEmpty()) { // If the link list is not empty it will continue
			Link temp = first; // Create temp variable to hold the first value
			first = first.next; // First will now be the previously 'next' value
			return temp; // return the first value
		}
		return null; // If the link list is empty, the method will return null
	}

	// Delete link with given key (iData)
	public Link delete(int key) {
		// If link list is not empty - continue
		if (!this.isEmpty()) {
			Link current = first;
			Link previous = first;
			// Search for key
			while (current.iData != key) {
				// Didn't find it
				if (current.next == null) {
					// Return null
					return null;
				} else {
					// Go to next link
					previous = current;
					current = current.next;
				}
			}
			// If found

			// If first link, change first
			if (current == first) {
				first = first.next;
				// Otherwise bypass it
			} else {
				previous.next = current.next;
			}
			// Return link that was deleted
			return current;
		}
		// Return null is empty
		return null;
	}

	// Displays the link list
	public void displayList() {
		System.out.println("List (first-->last: ");
		Link current = first; // Starts at beginning of list

		while (current != null) { // Will cycle through to end of list
			current.displayLink(); // Displays the current link
			current = current.next; // Moves to the next link
		}
		System.out.println("");
	}

}
