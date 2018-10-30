package project;

import java.util.Queue;

/**
 * TESTING
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 *
 * @param <K> generic, restricting to a linked list of recipe node
 * @param <V> generic, restricting to a queue of string
 */
public class Recipe_Pair<K extends RecipeLL_Node, V extends Queue<String>> implements Pair<K,V> {
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
		String name = "";
		String ingredient = "";
		String instruction = "";
		int i = 1;

		/*
		 * if there is a head, there is a linked list
		 * the first node is the name of the recipe
		 */
		if(key != null) {
			name = String.format("%s:", key.getIngred().toString());
		}

		/*
		 * looping through a linked list, not using a while-loop
		 * similar to regular for-loop, the element to start, where to end 
		 * and how to move the reference/pointer
		 * 
		 * this is the part to show the ingredient 
		 */
		for(RecipeLL_Node n = key.getNext(); n != null; n = n.getNext()) {
			ingredient += String.format("%s ", n.getIngred().toString());
		}

		for(String s : value) { 
			instruction += String.format("%d. %s ", i, s);
		}

		//print to console
		return String.format("%s%n%-5s%s%n%-5s%s", name, "", ingredient, "", instruction);
	}
}