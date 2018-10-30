package project;

/**
 * This is the recipe book that the user can pick to create their game
 * 
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 */
public class Recipe {
	/*
	 * reference for using linked list
	 * head is the first node 
	 * tail is the last node
	 * think of this as array,
	 * 	instead of boxes together, it is a box then point to
	 *  another box using "arrow" or references
	 */
	private static RecipeLL_Node head, tail;

	private static final Ingredient FLOUR = new Ingredient("Flour", "cup");
	private static final Ingredient EGG = new Ingredient("Egg", "eggs");
	private	static final Ingredient MILK = new Ingredient("Milk", "cup");
	private static final Ingredient CHOCOLATE = new Ingredient("Chocolate", "cup");
	private static final Ingredient BUTTER = new Ingredient("Butter", "tbs");
	private static final Ingredient SUGAR = new Ingredient("Sugar", "gram");

	/**
	 * create a ingredient list(LL) for cake
	 */
	public static void createChocolateCake() {
		/*
		 * each recipe uses similar ingredient
		 * the only difference is the amount of each
		 * therefore create the ingredient object, static final,
		 * then set the amount for each recipe
		 */
		FLOUR.setAmount(3);
		EGG.setAmount(2);
		MILK.setAmount(4);
		CHOCOLATE.setAmount(2);
		BUTTER.setAmount(3);
		SUGAR.setAmount(4);
		
		/*
		 * setting the first node of the linked list
		 * when there is only one node. the head and tail is the 
		 * same "box"
		 */
		head = new RecipeLL_Node(new Ingredient("Cake"));
		tail = head;
		
		/*
		 * tail is pointed to a new ingredient
		 * then that new ingredient becomes the new tail of 
		 * the linked list
		 * 
		 * think as connecting marker together, adding a marker to the end
		 * then the new marker is the new end rinse and repeat
		 */
		tail.setNext(tail = new RecipeLL_Node(FLOUR));
		tail.setNext(tail = new RecipeLL_Node(EGG));
		tail.setNext(tail = new RecipeLL_Node(MILK));
		tail.setNext(tail = new RecipeLL_Node(CHOCOLATE));
		tail.setNext(tail = new RecipeLL_Node(BUTTER));
		tail.setNext(tail = new RecipeLL_Node(SUGAR));
		
		printLL(head); // make sure it works
	}
	
	/**
	 * print the linked list to the console
	 * for checking to see if the recipe is correct
	 * @param head of a linked list
	 */
	private static void printLL(RecipeLL_Node h) {
		String name = "";
		String ingredient = "";
		
		/*
		 * if there is a head, there is a linked list
		 * the first node is the name of the recipe
		 */
		if(h != null) {
			name = String.format("%s:", h.getIngred().toString());
		}
		
		/*
		 * looping through a linked list, not using a while-loop
		 * similar to regular for-loop, the element to start, where to end 
		 * and how to move the reference/pointer
		 * 
		 * this is the part to show the ingredient 
		 */
		for(RecipeLL_Node n = h.getNext(); n != null; n = n.getNext()) {
			ingredient += String.format("%s ", n.toString());
		}
		
		//print to console
		System.out.format("%s%n%-5s%s", name, "", ingredient);
	}
	
	/**
	 * test each recipe
	 * @param args command-line, ignored
	 */
	public static void main(String[] args) {
		createChocolateCake();
	}
}