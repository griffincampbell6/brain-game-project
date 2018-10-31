package project;

/**
 * This is the recipe book that the user can pick to create their game
 * 
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 */
public class Recipe {	
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
		 * think as connecting marker together, adding a marker to the end
		 * then the new marker is the new end rinse and repeat
		 */
/////////////////// Linked List Test \\\\\\\\\\\\\\\\\\\\
		myLinkedList<Ingredient> ig = new myLinkedList<Ingredient>();

		ig.addLast(new myLinkedList<Ingredient>(new Ingredient("Cake")));
		ig.addLast(new myLinkedList<Ingredient>(FLOUR));
		ig.addLast(new myLinkedList<Ingredient>(EGG));
		ig.addLast(new myLinkedList<Ingredient>(MILK));
		ig.addLast(new myLinkedList<Ingredient>(CHOCOLATE));
		ig.addLast(new myLinkedList<Ingredient>(BUTTER));
		ig.addLast(new myLinkedList<Ingredient>(SUGAR));
		
		System.out.println(ig.printList());
		/*
		 * size is one extra becuase the first node is to store
		 * the name of the baking-food
		 */
		System.out.println(ig.getSize());
		
/////////////////// Queue Test \\\\\\\\\\\\\\\\\\\\
		myQueue<String> in = new myQueue<String>();

		in.add(CRACK);
		in.add(MIX);
		in.add(BAKE);
		in.add(COOL);
		
		System.out.println(in.printQueue());
		System.out.println(in.peek());
		System.out.println(in.isEmpty());
		System.out.println(in.size());

/////////////////// Recipe_Book Test \\\\\\\\\\\\\\\\\\\\
		Recipe_Book<Recipe_Pair<myLinkedList<Ingredient>, myQueue<String>>> recipeBook = new Recipe_Book<>();
		
		recipeBook.add(new Recipe_Pair<myLinkedList<Ingredient>, myQueue<String>>(ig, in));
		recipeBook.add(ig, in);
		
		System.out.println(recipeBook.printAll());
		
	}

	/**
	 * test each recipe
	 * @param args command-line, ignored
	 */
	public static void main(String[] args) {
		createChocolateCake();
	}
}