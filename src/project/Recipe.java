package project;

/**
 * This is the recipe book that the user can pick to create their game
 * 
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 */
public class Recipe {	
	private static Recipe_Book<Recipe_Pair<myLinkedList<Ingredient>, myQueue<String>>> recipeBook = new Recipe_Book<>();

	private static final Ingredient FLOUR = new Ingredient("Flour", "cup");
	private static final Ingredient EGG = new Ingredient("Egg", "eggs");
	private	static final Ingredient MILK = new Ingredient("Milk", "cup");
	private static final Ingredient CHOCOLATE = new Ingredient("Chocolate", "cup");
	private static final Ingredient BUTTER = new Ingredient("Butter", "tbs");
	private static final Ingredient SUGAR = new Ingredient("Sugar", "gram");
	private static final Ingredient BAKING_MIX = new Ingredient("Baking Mix", "cup");
	private static final Ingredient OIL = new Ingredient("Oil", "tsp");
	private static final Ingredient FROSTING = new Ingredient("Frosting", "cup");
	private static final Ingredient YEAST = new Ingredient("Yeast", "gram");

	private static final String BAKE = "Bake";
	private static final String MIX = "Mix";
	private static final String CRACK = "Crack";
	private static final String COOL = "Cool";
	private static final String CREAM = "Cream";
	private static final String FROST = "Frost";
	private static final String STIR = "Stir";
	private static final String SHAPE = "Shape";


	/**
	 * create a ingredient list(LL) for cake
	 */
	private static void createChocolateCake() {
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
		myLinkedList<Ingredient> cakeIG = new myLinkedList<Ingredient>();

		cakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Cake")));
		cakeIG.addLast(new myLinkedList<Ingredient>(FLOUR));
		cakeIG.addLast(new myLinkedList<Ingredient>(EGG));
		cakeIG.addLast(new myLinkedList<Ingredient>(MILK));
		cakeIG.addLast(new myLinkedList<Ingredient>(CHOCOLATE));
		cakeIG.addLast(new myLinkedList<Ingredient>(BUTTER));
		cakeIG.addLast(new myLinkedList<Ingredient>(SUGAR));

		System.out.println(cakeIG.head.toString() + ": ");
		System.out.println(cakeIG.printList());
		/*
		 * size is one extra becuase the first node is to store
		 * the name of the baking-food
		 */
		System.out.println(cakeIG.getSize());

		/////////////////// Queue Test \\\\\\\\\\\\\\\\\\\\
		myQueue<String> cakeIN = new myQueue<String>();

		cakeIN.add(CRACK);
		cakeIN.add(MIX);
		cakeIN.add(BAKE);
		cakeIN.add(COOL);

		System.out.println(cakeIN.printQueue());
		System.out.println(cakeIN.peek());
		System.out.println(cakeIN.isEmpty());
		System.out.println(cakeIN.size());

		/////////////////// Recipe_Book Test \\\\\\\\\\\\\\\\\\\\		
		recipeBook.add(new Recipe_Pair<myLinkedList<Ingredient>, myQueue<String>>(cakeIG, cakeIN));
		recipeBook.add(cakeIG, cakeIN);		
	}

	private static void createBread() {
		FLOUR.setAmount(7);
		EGG.setAmount(3);
		MILK.setAmount(4);
		BUTTER.setAmount(3);
		SUGAR.setAmount(4);

		myLinkedList<Ingredient> breadIG = new myLinkedList<Ingredient>();

		breadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Bread")));
		breadIG.addLast(new myLinkedList<Ingredient>(FLOUR));
		breadIG.addLast(new myLinkedList<Ingredient>(EGG));
		breadIG.addLast(new myLinkedList<Ingredient>(MILK));
		breadIG.addLast(new myLinkedList<Ingredient>(CHOCOLATE));
		breadIG.addLast(new myLinkedList<Ingredient>(BUTTER));
		breadIG.addLast(new myLinkedList<Ingredient>(SUGAR));

		myQueue<String> breadIN = new myQueue<String>();

		breadIN.add(CRACK);
		breadIN.add(MIX);
		breadIN.add(BAKE);
		breadIN.add(COOL);

		recipeBook.add(breadIG, breadIN);
	}

	/**
	 * create sugar cookies
	 */
	private static void createSugarCookies() {

	}
	
	/**
	 * create chocolate chip cookies
	 */
	private static void createChocolateChipCookies() {

	}
	
	/**
	 * create banana bread
	 */
	private static void createBananaBread() {

	}
	
	/**
	 * create white bread
	 */
	private static void createWhiteBread() {

	}
	
	/**
	 * create fancy cake
	 */
	private static void createFancyCakee() {

	}

	/**
	 * test each recipe
	 * @param args command-line, cakeIGnored
	 */
	public static void main(String[] args) {
		createChocolateCake();
		createBread();
		createSugarCookies();
		createChocolateChipCookies();
		createBananaBread();
		createWhiteBread();
		createFancyCakee();

		System.out.println("\n\n" + recipeBook.printAll());
	}
}