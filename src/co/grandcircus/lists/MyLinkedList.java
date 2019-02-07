package co.grandcircus.lists;
public class MyLinkedList implements MyList {

	// head is the first node in the list. if null, the list is empty.
	private Node head = null;
	
	// for convenience, keep track of how many items are in the list
	private int length = 0;
	
	@Override
	public void addAtBeginning(String data) {
		// add a new node and set it as the new head
		// TODO #1
		//Variable new node, set up on one line.
		Node node = new Node(data);
		head = node;
		node.setNext(head);
		length++;
	}
	
	@Override
	public void removeFromBeginning() {
		// find the second node and set it as the new head
		// TODO #4
		if (length == 0) {
			return; //do nothing
		}
		head = head.getNext();
		length--;
		
	}
	//Attempt at addAtEnd
	@Override
	public void addAtEnd(String data) {
		// TODO Exercise
		
		Node node = head;
		
		for(int i = 0; i < length; i++)
		if(node != null) {
			node = node.getNext();
		}
		else {
			node.setNext(null);
		}
		return;
	}
		
//		for (int i = 0; i < length; i++) {
//			if (node == null) {
//				node = getNodeAt(i-1);
//				
//				
//			}
//			node.setData(data);
//		
			
			
		

	
	@Override
	public void removeFromEnd() {
		if (length < 2) {
			// The beginning is the end.
			removeFromBeginning();
		} else {
			// TODO #5
			Node node = getNodeAt(length-2);
			node.setNext(null);
			length--;
		}
	}
	
	@Override
	public String get(int index) {
		// TODO #3
		//Private getNodeAt() method at the bottom of this file.
		Node node = getNodeAt(index);
		if (node == null) {
			throw new IndexOutOfBoundsException();
		}else {
			return node.getData();
		}
		
	
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// start at the head
		Node node = head;
		// follow the links between nodes until it reaches the end 
		while (node != null) {
			// TODO #2
			
			sb.append(node);
			node = node.getNext();
			
			//Start with the head print it, advance to the next node, print that, until the next node holds a value of null;
			
		}
		return sb.toString();
	}
	
	@Override
	public int size() {
		return length;
	}
	
	private Node getNodeAt(int index) {
		// start at the head
		Node node = head;
		// follow the links between nodes until it counts off the right number
		for (int i = 0; i < index; i++) {
			if (node == null) {
				// In case we run out of nodes before we get up to the desired index, return null
				return null;
			}
			node = node.getNext();
		}
		return node;
	}
	
	public boolean removeAt(int index) {
		Node node = head;
		Node nodeEnd = getNodeAt(length-1);
		for(int i = 0; i < index; i++) {
			if (node == null) {
				return false;
			}
		}
			return true;
		
	}
	public boolean booleanInsertAt(int index, String item) {
		Node node = head;
		Node nodeEnd = getNodeAt(length-1);
		for(int i = 0; i < index; i++) {
			if (node == null) {
				return false;
			}
			
		}
		return true;
	}

}