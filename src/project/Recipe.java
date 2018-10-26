package project;

import java.util.Queue;

public class Recipe<K extends RecipeLL_Node, V extends Queue<String>> implements IngredAndSteps<K,V> {
	final private K key;
	final private V value;

	public Recipe(K key, V value) {
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
