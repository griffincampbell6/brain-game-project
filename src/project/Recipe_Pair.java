package project;

/**
 * TESTING
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 *
 * @param <K> generic, restricting to a linked list of recipe node
 * @param <V> generic, restricting to a queue of string
 * @param <T> generic, for the linked list
 */
public class Recipe_Pair<K extends myLinkedList<Ingredient>, V extends myQueue<String>> implements Pair<K,V> {
	final private K key;
	final private V value;

	/**
	 * Pairing a list of ingredient with a list of instruction
	 * @param key this recipe's ingredients
	 * @param value this recipe's instruction
	 */
	public Recipe_Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * return the linked list of ingredients
	 */
	@Override
	public K getKey() {
		return key;
	}

	/**
	 * return the queue of instruction
	 */
	@Override
	public V getValue() {
		return value;
	}

	/**
	 * a toString to display the pair
	 */
	@Override
	public String toString() {

		return null;
	}
}