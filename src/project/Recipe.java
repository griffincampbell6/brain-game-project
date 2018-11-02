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
	 * test each recipe
	 * @param args command-line, cakeIGnored
	 */
	public static void setUp() {
		createSugarCookies();
		createChocolateChipCookies();
		createBananaBread();
		createWhiteBread();
		createFancyCakee();
	}
	
	/**
	 * create sugar cookies
	 */
	private static void createSugarCookies() {
		myLinkedList<Ingredient> sugarCookiesIG = new myLinkedList<>(); // Instantiate a linked list for ingredients 

		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar Cookies"))); // add the title of the recipe
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Butter"))); // add the ingredients IG
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar")));
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour")));
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Egg")));

		myQueue<String> sugarCookiesIS = new myQueue<>();	// Instantiate a queue for instruction

		sugarCookiesIS.add(CREAM); // add the instructions IS
		sugarCookiesIS.add(STIR);
		sugarCookiesIS.add(ROLL);
		sugarCookiesIS.add(BAKE);

		recipeBook.add(sugarCookiesIG, sugarCookiesIS); // put it in the recipe book
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
		chocolateCakeIS.add(ADD + " " + COCO);
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
		whiteBreadIS.add(ADD + " " + MILK);
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
		bananaBreadIS.add(ADD + " " + SPRINKLES);

		recipeBook.add(bananaBreadIG, bananaBreadIS);
	}
}