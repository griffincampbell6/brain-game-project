package project;

import java.util.Queue;

/**
 * TESTING
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 *
 * @param <K>
 * @param <V>
 */
public class Recipe_Book<K extends RecipeLL_Node, V extends Queue<String>> implements IngredAndSteps<K,V> {
	final private K key;
	final private V value;

	public Recipe_Book(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}
}

