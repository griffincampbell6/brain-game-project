package project;

import java.util.ArrayList;

/**
 * This class stores all the recipes created by the developer
 * using Java defines arraylist
 * 
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 * @param T the recipe pair where K is the ingredient and V is the instruction
 */
public class Recipe_Book<T> {
	private ArrayList<Recipe_Pair<myLinkedList<Ingredient>, myQueue<String>>> recipeBook = new ArrayList<>();

	/**
	 * Adding the ingredient and instruction to the recipe book
	 * @param rb a generic of a recipe with key as ingredient and value as instruction
	 */
	public void add(Recipe_Pair<myLinkedList<Ingredient>, myQueue<String>> rb) {
		recipeBook.add(rb);
	}

	/**
	 * Adding the ingredient and instruction given just their information
	 * @param n a linked list node of the head of the recipe
	 * @param q a queue of strings of the instruction
	 */
	public void add(myLinkedList<Ingredient> n, myQueue<String> q) {
		add(new Recipe_Pair<myLinkedList<Ingredient>, myQueue<String>>(n, q));
	}

	/** 
	 * Print all the information in the recipe book
	 */
	public String printAll() {
		String s = "";
		
		if(recipeBook == null) {
			return s;
		}else {			
			/*
			 * for each loop to iterate through the arraylist
			 * to print all the recipe in the game
			 */
			for(int i = 0; i < recipeBook.size(); i++) {
				s += String.format("%s%n%s%n", recipeBook.get(i).getKey().printList(), recipeBook.get(i).getValue().printQueue());
			}
			return s;
		}
	}

	/**
	 * Find the recipe that the players want to play
	 * @param name name of the recipe
	 * @return the Recipe_Pair for the information of the game
	 */
	public Recipe_Pair<myLinkedList<Ingredient>, myQueue<String>> searchRecipe(String name){
		/*
		 * for each loop to iterate through the arraylist
		 * in order to find the recipe pair
		 */
		for(Recipe_Pair<myLinkedList<Ingredient>, myQueue<String>> r: recipeBook) {
			if(r.getKey().toString().contains(name)) {
				return r;
			}
		}

		return null;
	}
}