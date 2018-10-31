package project;

/**
 *  Testing generic on Linked List
 *  this is the node class for  
 *  
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 */
public class myLinkedList<T> {
	private T info;
	private myLinkedList<T> head = null;
	private myLinkedList<T> tail, next;
	private int size = 0;

	/**
	 * Create a node with an ingredient and a pointer
	 * @param i an object that would determine the information of the node
	 * @param n the pointer to the next node on the linked list
	 */
	public myLinkedList(T info, myLinkedList<T> next) {
		this.info = info;
		this.next = next;
	}

	/**
	 * Single parameter that accepts only an object
	 * @param i an object
	 */
	public myLinkedList(T info) {
		this(info, null);
	}

	/**
	 * default constructor
	 */
	public myLinkedList() {
		this(null, null);
	}

	//////////////////// Node Information \\\\\\\\\\\\\\\\\\\\

	/**
	 * a setter to connect the LL nodes together
	 * @param next
	 */
	public void setNext(myLinkedList<T> next) {
		this.next = next;
	}

	/**
	 * whatever the next node is
	 * @return next LL node
	 */
	public myLinkedList<T> getNext() {
		return next;
	}

	/**
	 * getter for an object in the node
	 * @return the object of the node
	 */
	public T getInfo() {
		return info;
	}

	//////////////////// Linked List Information \\\\\\\\\\\\\\\\\\\\

	/**
	 * attaching nodes together
	 * @param value an object of type T
	 */
	public void addLast(myLinkedList<T> value) {
		if(head == null) {
			head = value;
			tail = head;
		}else {
			tail.setNext(value);
			tail = value;
		}
		size++;
	}

	/**
	 * getter for the size of the linked list
	 * @return the size of this linked list
	 */
	public int getSize() {
		return size;
	}

	// TODO: to be changed
	public String printList() {
		String s = "";
		
		if(head == null) {
			return "";
		}else {
			for(myLinkedList<T> curNode = head; curNode != null; curNode = curNode.getNext()) {
				s += String.format("%s ", curNode.getInfo().toString());
			}
			
			return s;
		}
	}
	
	/**
	 * toString method (just like the getter)
	 * @return the toString of the ingredient
	 */
	@Override
	public String toString() {
		return info.toString();
	}
}
