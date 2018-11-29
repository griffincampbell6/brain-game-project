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
	private static final String COCO = "Chocolate Chips";
	private static final String SPRINKLES = "Sprinkles";

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

		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Butter", CUP, 1))); // add the ingredients IG
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar", CUP, 3)));
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour", CUP, 3)));
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Egg", EGG, 1)));

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
		Map<String, String> sugarCookiesImg = new HashMap<>();

		// ingredient img
		sugarCookiesImg.put("resources/images/butter.PNG", "Butter");
		sugarCookiesImg.put("resources/images/sugar.PNG", "Sugar");
		sugarCookiesImg.put("resources/images/flour.PNG", "Flour");
		sugarCookiesImg.put("resources/images/egg.PNG", "Egg");

		//instruction img
		sugarCookiesImg.put("resources/images/butter.PNG", CREAM);
		sugarCookiesImg.put("resources/images/butter.PNG", STIR);
		sugarCookiesImg.put("resources/images/butter.PNG", ROLL);
		sugarCookiesImg.put("resources/images/butter.PNG", BAKE);

		return sugarCookiesImg;
	}
	
	/**
	 * Create the InGredients for a chocolate chip cookie
	 * @return the linked list of the ingredients
	 */
	protected static myLinkedList<Ingredient> chocolateCakeIG(){
		myLinkedList<Ingredient> chocolateCakeIG = new myLinkedList<>();

		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour", CUP, 2)));
		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Oil", TBSP, 2)));
		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Frosting", CUP, 2)));
		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Egg", EGG, 2)));

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
		Map<String, String> chocolateCakeImg = new HashMap<>();

		chocolateCakeImg.put("resources/images/flour.PNG", "Flour");
		chocolateCakeImg.put("resources/images/oil.PNG", "Oil");
		chocolateCakeImg.put("resources/images/frosting.PNG", "Frosting");
		chocolateCakeImg.put("resources/images/egg.PNG", "Egg");
		chocolateCakeImg.put("resources/images/butter.PNG", MIX);
		chocolateCakeImg.put("resources/images/butter.PNG", BAKE);
		chocolateCakeImg.put("resources/images/butter.PNG", COOL);
		chocolateCakeImg.put("resources/images/butter.PNG", FROST);

		return chocolateCakeImg;
	}

	/**
	 * Create the InGredients for a chocolate chip cookie
	 * @return the linked list of the ingredients
	 */
	protected static myLinkedList<Ingredient> chocolateChipCookieIG(){
		myLinkedList<Ingredient> chocolateChipCookieIG = new myLinkedList<>();

		chocolateChipCookieIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Butter", CUP, 1)));
		chocolateChipCookieIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour", CUP, 2)));
		chocolateChipCookieIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar", CUP, 1)));
		chocolateChipCookieIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Egg", EGG, 1)));
		chocolateChipCookieIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Chocolate", CUP, 1)));

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
		Map<String, String> chocolateChipCookieImg = new HashMap<>();

		chocolateChipCookieImg.put("resources/images/butter.PNG", "Butter");
		chocolateChipCookieImg.put("resources/images/flour.PNG", "Flour");
		chocolateChipCookieImg.put("resources/images/sugar.PNG", "Sugar");
		chocolateChipCookieImg.put("resources/images/egg.PNG", "Egg");
		chocolateChipCookieImg.put("resources/images/chocholate-chips.PNG", "Chocolate");
		chocolateChipCookieImg.put("resources/images/butter.PNG", CREAM);
		chocolateChipCookieImg.put("resources/images/butter.PNG", STIR);
		chocolateChipCookieImg.put("resources/images/butter.PNG", ADD + " " + COCO);
		chocolateChipCookieImg.put("resources/images/butter.PNG", SHAPE);
		chocolateChipCookieImg.put("resources/images/butter.PNG", BAKE);

		return chocolateChipCookieImg;
	}

	/**
	 * Create the InGredients for a banana bread
	 * @return the linked list of the ingredients
	 */
	protected static myLinkedList<Ingredient> bananaBreadIG(){
		myLinkedList<Ingredient> bananaBreadIG = new myLinkedList<>();

		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Banana", BAN, 3)));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour", CUP, 2)));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar", CUP, 1)));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Egg", EGG, 1)));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Cinnamon", TBSP, 2)));

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
		Map<String, String> bananaBreadImg = new HashMap<>();

		bananaBreadImg.put("resources/images/butter.PNG", "Banana"); // banana
		bananaBreadImg.put("resources/images/flour.PNG", "Flour");
		bananaBreadImg.put("resources/images/sugar.PNG", "Sugar");
		bananaBreadImg.put("resources/images/egg.PNG", "Egg");
		bananaBreadImg.put("resources/images/cinnamon.PNG", "Cinnamon");
		bananaBreadImg.put("resources/images/butter.PNG", MASH);
		bananaBreadImg.put("resources/images/butter.PNG", MIX);
		bananaBreadImg.put("resources/images/butter.PNG", POUR);
		bananaBreadImg.put("resources/images/butter.PNG", BAKE);
		bananaBreadImg.put("resources/images/butter.PNG", COOL);

		return bananaBreadImg;
	}

	/**
	 * Create the InGredients for a white bread
	 * @return the linked list of the ingredients
	 */
	protected static myLinkedList<Ingredient> whiteBreadIG(){
		myLinkedList<Ingredient> whiteBreadIG = new myLinkedList<>();

		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Yeast", PKG, 1)));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour", CUP, 6)));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar", TBSP, 3)));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Water", CUP, 2)));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Salt", TBSP, 1)));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Butter", CUP, 1)));

		return whiteBreadIG;
	}

	/**
	 * Create the InStruction for a white bread
	 * @return the queue of instructions
	 */
	protected static myQueue<String> whiteBreadIS(){
		myQueue<String> whiteBreadIS = new myQueue<>();

		whiteBreadIS.add(YEAST);
		whiteBreadIS.add(ADD + " " + MILK);
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
		Map<String, String> whiteBreadImg = new HashMap<>();

		whiteBreadImg.put("resources/images/yeast.PNG", "Yeast");
		whiteBreadImg.put("resources/images/flour.PNG", "Flour");
		whiteBreadImg.put("resources/images/sugar.PNG", "Sugar");
		whiteBreadImg.put("resources/images/water.PNG", "Water");
		whiteBreadImg.put("resources/images/salt.PNG", "Salt");
		whiteBreadImg.put("resources/images/butter.PNG", "Butter");
		whiteBreadImg.put("resources/images/butter.PNG", YEAST);
		whiteBreadImg.put("resources/images/butter.PNG", ADD + " " + MILK);
		whiteBreadImg.put("resources/images/butter.PNG", RISE);
		whiteBreadImg.put("resources/images/butter.PNG", PAN);
		whiteBreadImg.put("resources/images/butter.PNG", RISE);
		whiteBreadImg.put("resources/images/butter.PNG", BAKE);

		return whiteBreadImg;
	}

	/**
	 * Create the InGredients for a fancy cake
	 * @return the linked list of the ingredients
	 */
	protected static myLinkedList<Ingredient> fancyCakeIG(){
		myLinkedList<Ingredient> fancyCakeIG = new myLinkedList<>();

		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour", CUP, 2)));
		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Butter", CUP, 1)));
		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar", CUP, 1)));
		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Egg", EGG, 2)));
		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Frosting", CUP, 2)));
		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sprinkles", CUP, 1)));

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
		Map<String, String> fancyCakeImg = new HashMap<>();

		fancyCakeImg.put("resources/images/flour.PNG", "Flour");
		fancyCakeImg.put("resources/images/butter.PNG", "Buutter");
		fancyCakeImg.put("resources/images/sugar.PNG", "Sugar");
		fancyCakeImg.put("resources/images/egg.PNG", "Egg");
		fancyCakeImg.put("resources/images/frosting.PNG", "Frosting");
		fancyCakeImg.put("resources/images/sprinkles.PNG", "Sprinkles");
		fancyCakeImg.put("resources/images/butter.PNG", CREAM);
		fancyCakeImg.put("resources/images/butter.PNG", STIR);
		fancyCakeImg.put("resources/images/butter.PNG", BAKE);
		fancyCakeImg.put("resources/images/butter.PNG", COOL);
		fancyCakeImg.put("resources/images/butter.PNG", FROST);
		fancyCakeImg.put("resources/images/butter.PNG", ADD + " " + SPRINKLES);

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
