package project;

/**
 *  Testing generic on Linked List
 *  this is the node class for  
 *  
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 */
public class myLinkedList<T> {
	private T info;
	private myLinkedList<T> next;
	
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
	
	/**
	 * toString method (just like the getter)
	 * @return the toString of the ingredient
	 */
	@Override
	public String toString() {
		return info.toString();
	}
}
