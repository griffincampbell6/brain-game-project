package project;

/**
 * This is the recipe book that the user can pick to create their game
 * 
 * @author 
 */
public class Recipe_Book {
	private static RecipeLL_Node head, tail, n;

	private static final Ingredient FLOUR = new Ingredient("Flour", "cup");
	private static final Ingredient EGG = new Ingredient("Egg", "eggs");
	private	static final Ingredient MILK = new Ingredient("Milk", "cup");
	private static final Ingredient CHOCOLATE = new Ingredient("Chocolate", "cup");
	private static final Ingredient BUTTER = new Ingredient("Butter", "tbs");
	private static final Ingredient SUGAR = new Ingredient("Sugar", "gram");

	public static void createCake() {
		FLOUR.setAmount(3);
		EGG.setAmount(2);
		BUTTER.setAmount(3);
		SUGAR.setAmount(4);
		
		head = new RecipeLL_Node(new Ingredient("Cake"));
		tail = head;
		
		tail.setNext(tail = new RecipeLL_Node(FLOUR));
		tail.setNext(tail = new RecipeLL_Node(EGG));
		tail.setNext(tail = new RecipeLL_Node(BUTTER));
		tail.setNext(tail = new RecipeLL_Node(SUGAR));
		
		printLL(head);
	}
	
	private static void printLL(RecipeLL_Node h) {
		String name = "";
		String ingredient = "";
		
		if(h != null) {
			name = String.format("%s:", h.getIngred());
		}
		
		for(RecipeLL_Node n = h.getNext(); n != null; n = n.getNext()) {
			ingredient += String.format("%s ", n.toString());
		}
		
		System.out.format("%s%n%-5s%s", name, "", ingredient);
	}
	
	
	public static void main(String[] args) {
		createCake();
	}
}
