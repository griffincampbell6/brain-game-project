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
	private static myLinkedList<Ingredient> head2, tail2;

	private static final Ingredient FLOUR = new Ingredient("Flour", "cup");
	private static final Ingredient EGG = new Ingredient("Egg", "eggs");
	private	static final Ingredient MILK = new Ingredient("Milk", "cup");
	private static final Ingredient CHOCOLATE = new Ingredient("Chocolate", "cup");
	private static final Ingredient BUTTER = new Ingredient("Butter", "tbs");
	private static final Ingredient SUGAR = new Ingredient("Sugar", "gram");

	private static final String BAKE = "Bake";
	private static final String MIX = "Mix";
	private static final String CRACK = "Crack";
	private static final String COOL = "Cool";
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
		
		//Queue<String> q = new Queue<String>
		
		head2 = new myLinkedList<Ingredient>(new Ingredient("Cake"));
		tail2 = head2;
		tail2.setNext(tail2 = new myLinkedList<Ingredient>(FLOUR));
		tail2.setNext(tail2 = new myLinkedList<Ingredient>(EGG));
		tail2.setNext(tail2 = new myLinkedList<Ingredient>(MILK));
		tail2.setNext(tail2 = new myLinkedList<Ingredient>(CHOCOLATE));
		tail2.setNext(tail2 = new myLinkedList<Ingredient>(BUTTER));
		tail2.setNext(tail2 = new myLinkedList<Ingredient>(SUGAR));
		
		printRLL(head); // make sure it works
		printMLL(head2);
	}
	
	/**
	 * print the linked list to the console
	 * for checking to see if the recipe is correct
	 * @param head of a linked list
	 */
	private static void printRLL(RecipeLL_Node h) {
		String name = "";
		String ingredient = "";
		
		/*
		 * if there is a head, there is a linked list
		 * the first node is the name of the recipe
		 */
		if(h != null) {
			name = String.format("%s:", h.getIngred().getName());
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
		System.out.println();
	}
	
	private static <T> void printMLL(myLinkedList<Ingredient> h) {
		String name = "";
		String ingredient = "";
		
	
		if(h != null) {
			name = String.format("%s:", h.getInfo().getName());
		}
		
		for(myLinkedList<Ingredient> n = h.getNext(); n != null; n = n.getNext()) {
			ingredient += String.format("%s ", n.toString());
		}
	
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