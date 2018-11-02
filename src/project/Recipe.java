package project;

/**
 * This is the recipe book that the user can pick to create their game
 * 
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 */
public class Recipe {	
	private static Recipe_Book<Recipe_Pair<myLinkedList<Ingredient>, myQueue<String>>> recipeBook = new Recipe_Book<>();

	private static final String BAKE = "Bake";
	private static final String MIX = "Mix";
	private static final String CRACK = "Crack";
	private static final String COOL = "Cool";
	private static final String CREAM = "Cream";
	private static final String FROST = "Frost";
	private static final String STIR = "Stir";
	private static final String SHAPE = "Shape";
	private static final String ROLL = "Roll";
	private static final String ADD= "Add";
	private static final String MASH = "Mash";
	private static final String POUR = "Pour";
	private static final String YEAST = "Feed Yeast";
	private static final String MILK = "Milk";
	private static final String RISE = "Let Rise";
	private static final String PAN = "Place in Pan";
	private static final String COCO = "Chocolate Chips";
	private static final String SPRINKLES = "Sprinkles";


	/**
	 * create a ingredient list(LL) for cake
	 */
	private static void createChocolateCake() {

		/* 
		 * think as connecting marker together, adding a marker to the end
		 * then the new marker is the new end rinse and repeat
		 */
		/////////////////// Linked List Test \\\\\\\\\\\\\\\\\\\\
		myLinkedList<Ingredient> cakeIG = new myLinkedList<Ingredient>();

		cakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Cake")));
		cakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("FLOUR")));
		cakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("EGG")));
		cakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("MILK")));
		cakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("COCO")));
		cakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("BUTTER")));
		cakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("SUGAR")));

		System.out.println(cakeIG.head.toString() + ": ");
		System.out.println(cakeIG.printList());
		/*
		 * size is one extra becuase the first node is to store
		 * the name of the baking-food
		 */
		System.out.println(cakeIG.getSize());

		/////////////////// Queue Test \\\\\\\\\\\\\\\\\\\\
		myQueue<String> cakeIS = new myQueue<String>();

		cakeIS.add(CRACK);
		cakeIS.add(MIX);
		cakeIS.add(BAKE);
		cakeIS.add(COOL);

		System.out.println(cakeIS.printQueue());
		System.out.println(cakeIS.peek());
		System.out.println(cakeIS.isEmpty());
		System.out.println(cakeIS.size());

		/////////////////// Recipe_Book Test \\\\\\\\\\\\\\\\\\\\		
		recipeBook.add(new Recipe_Pair<myLinkedList<Ingredient>, myQueue<String>>(cakeIG, cakeIS));
		recipeBook.add(cakeIG, cakeIS);		
	}

	/**
	 * create sugar cookies
	 */
	private static void createSugarCookies() {
		myLinkedList<Ingredient> sugarCookiesIG = new myLinkedList<>();

		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar Cookies")));
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Butter")));
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar")));
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour")));
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Egg")));

		myQueue<String> sugarCookiesIS = new myQueue<>();

		sugarCookiesIS.add(CREAM);
		sugarCookiesIS.add(STIR);
		sugarCookiesIS.add(ROLL);
		sugarCookiesIS.add(BAKE);

		recipeBook.add(sugarCookiesIG, sugarCookiesIS);
	}

	/**
	 * create chocolate chip cookies
	 */
	private static void createChocolateChipCookies() {
		myLinkedList<Ingredient> chocolateCakeIG = new myLinkedList<>();

		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Chocolate Chip Cookie")));
		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Butter")));
		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar")));
		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour")));
		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Egg")));
		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Chocolate Chips")));

		myQueue<String> chocolateCakeIS = new myQueue<>();

		chocolateCakeIS.add(CREAM);
		chocolateCakeIS.add(STIR);
		chocolateCakeIS.add(ADD + COCO);
		chocolateCakeIS.add(SHAPE);
		chocolateCakeIS.add(BAKE);

		recipeBook.add(chocolateCakeIG, chocolateCakeIS);
	}

	/**
	 * create banana bread
	 */
	private static void createBananaBread() {
		myLinkedList<Ingredient> bananaBreadIG = new myLinkedList<>();

		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Banana Bread")));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Banana")));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour")));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar")));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Egg")));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Cinnamon")));

		myQueue<String> bananaBreadIS = new myQueue<>();

		bananaBreadIS.add(MASH);
		bananaBreadIS.add(MIX);
		bananaBreadIS.add(POUR);
		bananaBreadIS.add(BAKE);
		bananaBreadIS.add(COOL);

		recipeBook.add(bananaBreadIG, bananaBreadIS);
	}

	/**
	 * create white bread
	 */
	private static void createWhiteBread() {
		myLinkedList<Ingredient> whiteBreadIG = new myLinkedList<>();

		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("White Bread")));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Yeast")));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour")));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar")));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Water")));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Salt")));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Butter")));

		myQueue<String> whiteBreadIS = new myQueue<>();

		whiteBreadIS.add(YEAST);
		whiteBreadIS.add(ADD + MILK);
		whiteBreadIS.add(RISE);
		whiteBreadIS.add(PAN);
		whiteBreadIS.add(RISE);
		whiteBreadIS.add(BAKE);

		recipeBook.add(whiteBreadIG, whiteBreadIS);
	}

	/**
	 * create fancy cake
	 */
	private static void createFancyCakee() {
		myLinkedList<Ingredient> bananaBreadIG = new myLinkedList<>();

		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Fancy Cake")));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour")));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Butter")));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar")));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Egg")));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Frosting")));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sprinkles")));

		myQueue<String> bananaBreadIS = new myQueue<>();

		bananaBreadIS.add(CREAM);
		bananaBreadIS.add(STIR);
		bananaBreadIS.add(BAKE);
		bananaBreadIS.add(COOL);
		bananaBreadIS.add(FROST);
		bananaBreadIS.add(ADD + SPRINKLES);

		recipeBook.add(bananaBreadIG, bananaBreadIS);
	}

	/**
	 * test each recipe
	 * @param args command-line, cakeIGnored
	 */
	public static void main(String[] args) {
		createChocolateCake();

		createSugarCookies();
		createChocolateChipCookies();
		createBananaBread();
		createWhiteBread();
		createFancyCakee();

		System.out.println("\n\n" + recipeBook.printAll());
	}
}