package project;

/**
 * Uses to store all the instructions in a queue;
 * also testing generic of a Queue 
 * 
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 * @param <E> any element that can be placed in the linked list
 */
public class myQueue<E> {
	private myLinkedList<String> queue = new myLinkedList<>(); 

	/**
	 * adds the given value to the back of the list
	 * @param value any element
	 */
	public void add(E value) {
		queue.addLast(new myLinkedList<String>(new String(value+"")));
	}

	/**
	 * the content of the first element
	 * @return the value at the front of the list
	 */
	public myLinkedList<String> peek() {
		return queue.head;	
	}

	/**
	 * reset a queue
	 */
	public void removeAll() {
		queue.head = null;
	}
	
	/**
	 * remove an element
	 * @return removes and returns the value at the front of the list
	 */
	public myLinkedList<String> remove(){
		if(queue.head == null) {
			return null;
		}else {
			myLinkedList<String> tempNode = queue.head;

			if(queue.head.getNext() == null) {
				queue.head = null;
			}else {
				queue.head = queue.head.getNext();
			}
			queue.size--;
			
			tempNode.next = null;
			return tempNode;
		}
	}

	/**
	 * determines if the list is empty
	 * @return rather or not there is any content in the list
	 */
	public boolean isEmpty() {
		return (queue.head == null);
	}

	/**
	 * the size of the list
	 * @return the number of element in the list
	 */
	public int size() {
		return queue.size;
	}

	/**
	 * printing the queue
	 */
	public String printQueue() {
		return queue.printList();
	}
}
