package project;

import java.util.*;

/**
 * This class manages recipes that are allowed in the game,
 * it also includes a checker to see if the user is correct.
 * 
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 */
public class Game {	
	// instruction names
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
	private static final String COCO = "Chocolate-Chips";
	private static final String SPRINKLES = "Sprinkles";

	// ingredient names
	private static final String BUTTER = "Butter";
	private static final String SUGAR = "Sugar";
	private static final String FLOUR = "FLour";
	private static final String EGGIG = "Egg";
	private static final String OIL = "Oil";
	private static final String FROSTING = "Frosting";
	private static final String CINNAMON= "Cinnamon";
	private static final String BANANA = "Banana";
	private static final String YEASTIG = "Yeast";
	private static final String WATER = "WATER";
	private static final String SALT = "SALT";
	
	// unit names
	private static final String CUP = "c";
	private static final String EGG = "egg(s)";
	private static final String TBSP = "tbsp";
	private static final String PKG = "package(s)";
	private static final String BAN = "banana(s)";

	/**
	 * Create the InGredients for a sugar cookie
	 * @return the linked list of the ingredients
	 */
	protected static myLinkedList<Ingredient> sugarCookiesIG(){
		myLinkedList<Ingredient> sugarCookiesIG = new myLinkedList<>(); // Instantiate a linked list for ingredients 

		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient(BUTTER, CUP, 1))); // add the ingredients IG
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient(SUGAR, CUP, 3)));
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient(FLOUR, CUP, 3)));
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient(EGGIG, EGG, 1)));

		return sugarCookiesIG;
	}

	/**
	 * Create the InStruction for a sugar cookie
	 * @return the queue of instructions 
	 */
	protected static myQueue<String> sugarCookiesIS(){
		myQueue<String> sugarCookiesIS = new myQueue<>();	// Instantiate a queue for instruction

		sugarCookiesIS.add(CREAM); // add the instructions IS
		sugarCookiesIS.add(STIR);
		sugarCookiesIS.add(ROLL);
		sugarCookiesIS.add(BAKE);

		return sugarCookiesIS;
	}

	/**
	 * Create a string of image file location for a sugar cookie recipe
	 * @return the map of each image file corresponding to the ingredient
	 */
	protected static Map<String, String> sugarCookiesImg(){
		Map<String, String> sugarCookiesImg = new LinkedHashMap<>();

		sugarCookiesImg.put("resources/images/butter.PNG", BUTTER);
		sugarCookiesImg.put("resources/images/sugar.PNG", SUGAR);
		sugarCookiesImg.put("resources/images/flour.PNG", FLOUR);
		sugarCookiesImg.put("resources/images/egg.PNG", EGGIG);
		sugarCookiesImg.put("resources/images/cream.PNG", CREAM); //missing
		sugarCookiesImg.put("resources/images/stir.PNG", STIR);
		sugarCookiesImg.put("resources/images/roll.PNG", ROLL);
		sugarCookiesImg.put("resources/images/bake.PNG", BAKE);

		return sugarCookiesImg;
	}
	
	/**
	 * Create the InGredients for a chocolate chip cookie
	 * @return the linked list of the ingredients
	 */
	protected static myLinkedList<Ingredient> chocolateCakeIG(){
		myLinkedList<Ingredient> chocolateCakeIG = new myLinkedList<>();

		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient(FLOUR, CUP, 2)));
		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient(OIL, TBSP, 2)));
		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient(FROSTING, CUP, 2)));
		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient(EGGIG, EGG, 2)));

		return chocolateCakeIG;
	}

	/**
	 * Create the InStruction for a chocolate cake
	 * @return the queue of instructions
	 */
	protected static myQueue<String> chocolateCakeIS(){
		myQueue<String> chocolateCakeIS = new myQueue<>();

		chocolateCakeIS.add(MIX);
		chocolateCakeIS.add(BAKE);
		chocolateCakeIS.add(COOL);
		chocolateCakeIS.add(FROST);

		return chocolateCakeIS;
	}

	/**
	 * Create a string of image file location for a chocolate cake recipe
	 * @return the queue of each image file corresponding to the ingredient
	 */
	protected static Map<String, String> chocolateCakeImg(){
		Map<String, String> chocolateCakeImg = new LinkedHashMap<>();

		chocolateCakeImg.put("resources/images/flour.PNG", FLOUR);
		chocolateCakeImg.put("resources/images/oil.PNG", OIL);
		chocolateCakeImg.put("resources/images/frosting.PNG", FROSTING);
		chocolateCakeImg.put("resources/images/egg.PNG", EGGIG);
		chocolateCakeImg.put("resources/images/mix.PNG", MIX);
		chocolateCakeImg.put("resources/images/bake.PNG", BAKE);
		chocolateCakeImg.put("resources/images/cool.PNG", COOL);
		chocolateCakeImg.put("resources/images/add-frosting.PNG", FROST);

		return chocolateCakeImg;
	}

	/**
	 * Create the InGredients for a chocolate chip cookie
	 * @return the linked list of the ingredients
	 */
	protected static myLinkedList<Ingredient> chocolateChipCookieIG(){
		myLinkedList<Ingredient> chocolateChipCookieIG = new myLinkedList<>();

		chocolateChipCookieIG.addLast(new myLinkedList<Ingredient>(new Ingredient(BUTTER, CUP, 1)));
		chocolateChipCookieIG.addLast(new myLinkedList<Ingredient>(new Ingredient(FLOUR, CUP, 2)));
		chocolateChipCookieIG.addLast(new myLinkedList<Ingredient>(new Ingredient(SUGAR, CUP, 1)));
		chocolateChipCookieIG.addLast(new myLinkedList<Ingredient>(new Ingredient(EGGIG, EGG, 1)));
		chocolateChipCookieIG.addLast(new myLinkedList<Ingredient>(new Ingredient(COCO, CUP, 1)));

		return chocolateChipCookieIG;
	}	

	/**
	 * Create the InStruction for a chocolate chip cookie
	 * @return the queue of instructions
	 */
	protected static myQueue<String> chocolateChipCookieIS(){
		myQueue<String> chocolateChipCookieIS = new myQueue<>();

		chocolateChipCookieIS.add(CREAM);
		chocolateChipCookieIS.add(STIR);
		chocolateChipCookieIS.add(ADD + " " + COCO);
		chocolateChipCookieIS.add(SHAPE);
		chocolateChipCookieIS.add(BAKE);

		return chocolateChipCookieIS;
	}

	/**
	 * Create a string of image file location for a chocolate chips cookie recipe
	 * @return the queue of each image file corresponding to the ingredient
	 */
	protected static Map<String, String> chocolateChipCookieImg(){
		Map<String, String> chocolateChipCookieImg = new LinkedHashMap<>();

		chocolateChipCookieImg.put("resources/images/butter.PNG", BUTTER);
		chocolateChipCookieImg.put("resources/images/flour.PNG", FLOUR);
		chocolateChipCookieImg.put("resources/images/sugar.PNG", SUGAR);
		chocolateChipCookieImg.put("resources/images/egg.PNG", EGGIG);
		chocolateChipCookieImg.put("resources/images/chocholate-chips.PNG", COCO);
		chocolateChipCookieImg.put("resources/images/cream.PNG", CREAM);
		chocolateChipCookieImg.put("resources/images/stir.PNG", STIR);
		chocolateChipCookieImg.put("resources/images/add-chocholate-chips.PNG", ADD + " " + COCO);
		chocolateChipCookieImg.put("resources/images/shape.PNG", SHAPE);
		chocolateChipCookieImg.put("resources/images/bake.PNG", BAKE);

		return chocolateChipCookieImg;
	}

	/**
	 * Create the InGredients for a banana bread
	 * @return the linked list of the ingredients
	 */
	protected static myLinkedList<Ingredient> bananaBreadIG(){
		myLinkedList<Ingredient> bananaBreadIG = new myLinkedList<>();

		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient(BANANA, BAN, 3)));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient(FLOUR, CUP, 2)));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient(SUGAR, CUP, 1)));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient(EGGIG, EGG, 1)));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient(CINNAMON, TBSP, 2)));

		return bananaBreadIG;
	}

	/**
	 * Create the InStruction for a banana bread
	 * @return the queue of instructions
	 */
	protected static myQueue<String> bananaBreadIS(){
		myQueue<String> bananaBreadIS = new myQueue<>();

		bananaBreadIS.add(MASH);
		bananaBreadIS.add(MIX);
		bananaBreadIS.add(POUR);
		bananaBreadIS.add(BAKE);
		bananaBreadIS.add(COOL);

		return bananaBreadIS;
	}

	/**
	 * Create a string of image file location for a banana bread recipe
	 * @return the queue of each image file corresponding to the ingredient
	 */
	protected static Map<String, String> bananaBreadImg(){
		Map<String, String> bananaBreadImg = new LinkedHashMap<>();

		bananaBreadImg.put("resources/images/banana.PNG", BANANA);
		bananaBreadImg.put("resources/images/flour.PNG", FLOUR);
		bananaBreadImg.put("resources/images/sugar.PNG", SUGAR);
		bananaBreadImg.put("resources/images/egg.PNG", EGGIG);
		bananaBreadImg.put("resources/images/cinnamon.PNG", CINNAMON);
		bananaBreadImg.put("resources/images/mash.PNG", MASH);
		bananaBreadImg.put("resources/images/mix.PNG", MIX);
		bananaBreadImg.put("resources/images/pour.PNG", POUR);// missing
		bananaBreadImg.put("resources/images/bake.PNG", BAKE);
		bananaBreadImg.put("resources/images/cool.PNG", COOL);

		return bananaBreadImg;
	}

	/**
	 * Create the InGredients for a white bread
	 * @return the linked list of the ingredients
	 */
	protected static myLinkedList<Ingredient> whiteBreadIG(){
		myLinkedList<Ingredient> whiteBreadIG = new myLinkedList<>();

		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient(YEASTIG, PKG, 1)));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient(FLOUR, CUP, 6)));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient(SUGAR, TBSP, 3)));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient(WATER, CUP, 2)));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient(SALT, TBSP, 1)));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient(BUTTER, CUP, 1)));

		return whiteBreadIG;
	}

	/**
	 * Create the InStruction for a white bread
	 * @return the queue of instructions
	 */
	protected static myQueue<String> whiteBreadIS(){
		myQueue<String> whiteBreadIS = new myQueue<>();

		whiteBreadIS.add(YEAST);
		whiteBreadIS.add(ADD + " " + WATER);
		whiteBreadIS.add(RISE);
		whiteBreadIS.add(PAN);
		whiteBreadIS.add(RISE);
		whiteBreadIS.add(BAKE);

		return whiteBreadIS;
	}

	/**
	 * Create a string of image file location for a white bread recipe
	 * @return the queue of each image file corresponding to the ingredient
	 */
	protected static Map<String, String> whiteBreadImg(){
		Map<String, String> whiteBreadImg = new LinkedHashMap<>();

		whiteBreadImg.put("resources/images/yeast.PNG", YEASTIG);
		whiteBreadImg.put("resources/images/flour.PNG", FLOUR);
		whiteBreadImg.put("resources/images/sugar.PNG", SUGAR);
		whiteBreadImg.put("resources/images/water.PNG", WATER);
		whiteBreadImg.put("resources/images/salt.PNG", SALT);
		whiteBreadImg.put("resources/images/butter.PNG", BUTTER);
		whiteBreadImg.put("resources/images/add-yeast.PNG", YEAST);
		whiteBreadImg.put("resources/images/add-water.PNG", ADD + " " + WATER);
		whiteBreadImg.put("resources/images/rise.PNG", RISE);//missing
		whiteBreadImg.put("resources/images/pan.PNG", PAN);
		whiteBreadImg.put("resources/images/rise2.PNG", RISE);//missing
		whiteBreadImg.put("resources/images/bake.PNG", BAKE);

		return whiteBreadImg;
	}

	/**
	 * Create the InGredients for a fancy cake
	 * @return the linked list of the ingredients
	 */
	protected static myLinkedList<Ingredient> fancyCakeIG(){
		myLinkedList<Ingredient> fancyCakeIG = new myLinkedList<>();

		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient(FLOUR, CUP, 2)));
		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient(BUTTER, CUP, 1)));
		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient(SUGAR, CUP, 1)));
		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient(EGG, EGG, 2)));
		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient(FROSTING, CUP, 2)));
		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient(SPRINKLES, CUP, 1)));

		return fancyCakeIG;
	}

	/**
	 * Create the InStruction for a fancy cake
	 * @return the queue of instructions
	 */
	protected static myQueue<String> fancyCakeIS(){
		myQueue<String> fancyCakeIS = new myQueue<>();

		fancyCakeIS.add(CREAM);
		fancyCakeIS.add(STIR);
		fancyCakeIS.add(BAKE);
		fancyCakeIS.add(COOL);
		fancyCakeIS.add(FROST);
		fancyCakeIS.add(ADD + " " + SPRINKLES);

		return fancyCakeIS;
	}

	/**
	 * Create a string of image file location for a white bread recipe
	 * @return the queue of each image file corresponding to the ingredient
	 */
	protected static Map<String, String> fancyCakeImg(){
		Map<String, String> fancyCakeImg = new LinkedHashMap<>();

		fancyCakeImg.put("resources/images/flour.PNG", FLOUR);
		fancyCakeImg.put("resources/images/butter.PNG", BUTTER);
		fancyCakeImg.put("resources/images/sugar.PNG", SUGAR);
		fancyCakeImg.put("resources/images/egg.PNG", EGGIG);
		fancyCakeImg.put("resources/images/frosting.PNG", FROSTING);
		fancyCakeImg.put("resources/images/sprinkles.PNG", SPRINKLES);
		fancyCakeImg.put("resources/images/cream.PNG", CREAM);
		fancyCakeImg.put("resources/images/stir.PNG", STIR);
		fancyCakeImg.put("resources/images/bake.PNG", BAKE);
		fancyCakeImg.put("resources/images/cool.PNG", COOL);
		fancyCakeImg.put("resources/images/add-frosting.PNG", FROST);
		fancyCakeImg.put("resources/images/add-sprinkles.PNG", ADD + " " + SPRINKLES);

		return fancyCakeImg;
	}


	/**
	 * checking to see if the ingredients the player picked match 
	 * the one created by the developer
	 * @param definedIG the linked list of the created ingredient
	 * @param userIG an ArrayList of the users ingredient selection
	 * @return if the user list and the recipe list are the same
	 */
	protected static boolean checkIngredients(myLinkedList<Ingredient> definedIG , Map<String, Integer> userIG) {
		/*
		 * if the two lists are not the same size,
		 * then it is obvious that it is false
		 */
		if(definedIG.getSize() != userIG.size()) {
			return false;
		}else {			
			// a set for the ingredient names that the user inputed
			Set<String> name = userIG.keySet();
			
			for(myLinkedList<Ingredient> curNode = definedIG.head; curNode != null; curNode = curNode.getNext()) {
				if(!(name.contains(curNode.getInfo().getName()))){ // check if the defined ingredient exist in the user's set
					return false;
				}else if(userIG.get(curNode.getInfo().getName()) != curNode.getInfo().getAmount()) { // check if the amounts are the same
					return false;
				}else {
					continue;
				}
			}
			return true;
		}
	}

	/**
	 * checking to see if the instructions the player picked match 
	 * the one created by the developer
	 * @param definedIS the queue of the created instruction
	 * @param userIS the queue of the users instruction selection
	 * @return if the both queue are the same
	 */
	protected static boolean checkInstruction(myQueue<String> definedIS, myQueue<String> userIS) {
		/*
		 * if the two lists are not the same size,
		 * then it is obvious that it is false
		 */
		if(definedIS.size() != userIS.size()) {
			return false;
		}else {
			/*
			 * looping through the queue, does not use iterator 
			 */
			int size = definedIS.size();
			for(int i = 0; i < size; i++) {
				if(!(definedIS.peek().toString().equalsIgnoreCase(userIS.peek().toString()))) {
					return false;
				}

				/*
				 * moving the queue elements,
				 * while also retaining its information
				 */
				String temp = definedIS.remove().toString();
				definedIS.add(temp);
				temp = userIS.remove().toString();
				userIS.add(temp);
			}
			return true;
		}
	}

	/**
	 * Getting just the ingredient name from the linked list
	 * @param s the printList of the linked list of the ingredient
	 * @return an array of just the ingredient name
	 */
	protected static String[] split(String s, int n) {
		if(s.length() <= 0) {
			throw new IllegalArgumentException();
		}

		String[] arrayIG = new String[6];
		String[] tempArray = s.split(" ");

		for(int i = 0; i < arrayIG.length; i++) {
			if((3*i + n) < tempArray.length) {
				arrayIG[i] = tempArray[3*i+n];
			}else {
				break;
			}
		}

		for(int i = arrayIG.length-1; i >= 0; i--) {
			if(arrayIG[i] == null) {
				arrayIG[i] = "";
			}else {
				break;
			}
		}
		return arrayIG;
	}

	/**
	 * Convert a queue into an array with its steps
	 * @param q a queue of instruction for this game
	 * @return an array of string of instruction
	 */
	protected static String[] queueToArray(myQueue<String> q) {
		if(q == null) {
			throw new IllegalArgumentException();
		}

		String[] s = new String[q.size()];
		int n = q.size();

		for(int i = 0; i < n; i++) {
			String d  = q.remove().toString();
			s[i] = d;
			q.add(d);
		}

		return s;
	}
}
