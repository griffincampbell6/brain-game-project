package project;

import java.util.ArrayList;
import java.util.Queue;

/**
 * This class stores all the recipes created by the developer
 * using Java defines arraylist
 * 
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 */
public class Recipe_Book {
	private ArrayList<Recipe_Pair<RecipeLL_Node, Queue<String>>> recipeBook = new ArrayList<Recipe_Pair<RecipeLL_Node, Queue<String>>>();

	/**
	 * Adding the ingredient and instruction to the recipe book
	 * @param rb a generic of a recipe with key as ingredient and value as instruction
	 */
	public void add(Recipe_Pair<RecipeLL_Node, Queue<String>> rb) {
		recipeBook.add(rb);
	}

	/**
	 * Adding the ingredient and instruction given just their information
	 * @param n a linked list node of the head of the recipe
	 * @param q a queue of strings of the instruction
	 */
	public void add(RecipeLL_Node n, Queue<String> q) {
		add(new Recipe_Pair<RecipeLL_Node, Queue<String>>(n, q));
	}

	/** 
	 * Print all the information in the recipe book
	 */
	public void printAll() {
		/*
		 * for each loop to iterate through the arraylist
		 * to print all the recipe in the game
		 */
		for(Recipe_Pair<RecipeLL_Node, Queue<String>> r: recipeBook) {
			System.out.format("%s%n", r.toString());
		}
	}

	/**
	 * Find the recipe that the players want to play
	 * @param name name of the recipe
	 * @return the Recipe_Pair for the information of the game
	 */
	public Recipe_Pair<RecipeLL_Node, Queue<String>> searchRecipe(String name){
		/*
		 * for each loop to iterate through the arraylist
		 * in order to find the recipe pair
		 */
		for(Recipe_Pair<RecipeLL_Node, Queue<String>> r: recipeBook) {
			if(r.getKey().toString().contains(name)) {
				return r;
			}
		}

		return null;
	}
}