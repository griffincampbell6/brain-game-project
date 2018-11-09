package project;

import java.util.*;

/**
 * This is the recipe book that the user can pick to create their game
 * 
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 */
public class Game {	
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

	protected static boolean isIGCorrect = false;
	protected static boolean isISCorrect = false;
	/**
	 * Create the InGredients for a sugar cookie
	 * @return the linked list of the ingredients
	 */
	private static myLinkedList<Ingredient> sugarCookiesIG(){
		myLinkedList<Ingredient> sugarCookiesIG = new myLinkedList<>(); // Instantiate a linked list for ingredients 

		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Butter"))); // add the ingredients IG
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar")));
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour")));
		sugarCookiesIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Egg")));

		return sugarCookiesIG;
	}

	/**
	 * Create the InStruction for a sugar cookie
	 * @return the queue of instructions 
	 */
	private static myQueue<String> sugarCookiesIS(){
		myQueue<String> sugarCookiesIS = new myQueue<>();	// Instantiate a queue for instruction

		sugarCookiesIS.add(CREAM); // add the instructions IS
		sugarCookiesIS.add(STIR);
		sugarCookiesIS.add(ROLL);
		sugarCookiesIS.add(BAKE);

		return sugarCookiesIS;
	}

	/**
	 * Create the InGredients for a chocolate chip cookie
	 * @return the linked list of the ingredients
	 */
	private static myLinkedList<Ingredient> chocolateCakeIG(){
		myLinkedList<Ingredient> chocolateCakeIG = new myLinkedList<>();

		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Butter")));
		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar")));
		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour")));
		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Egg")));
		chocolateCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Chocolate Chips")));

		return chocolateCakeIG;
	}

	/**
	 * Create the InStruction for a chocolate chip cookie
	 * @return the queue of instructions
	 */
	private static myQueue<String> chocolateCakeIS(){
		myQueue<String> chocolateCakeIS = new myQueue<>();

		chocolateCakeIS.add(CREAM);
		chocolateCakeIS.add(STIR);
		chocolateCakeIS.add(ADD + " " + COCO);
		chocolateCakeIS.add(SHAPE);
		chocolateCakeIS.add(BAKE);

		return chocolateCakeIS;
	}

	/**
	 * Create the InGredients for a banana bread
	 * @return the linked list of the ingredients
	 */
	private static myLinkedList<Ingredient> bananaBreadIG(){
		myLinkedList<Ingredient> bananaBreadIG = new myLinkedList<>();

		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Banana")));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour")));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar")));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Egg")));
		bananaBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Cinnamon")));

		return bananaBreadIG;
	}

	/**
	 * Create the InStruction for a banana bread
	 * @return the queue of instructions
	 */
	private static myQueue<String> bananaBreadIS(){
		myQueue<String> bananaBreadIS = new myQueue<>();

		bananaBreadIS.add(MASH);
		bananaBreadIS.add(MIX);
		bananaBreadIS.add(POUR);
		bananaBreadIS.add(BAKE);
		bananaBreadIS.add(COOL);

		return bananaBreadIS;
	}

	/**
	 * Create the InGredients for a white bread
	 * @return the linked list of the ingredients
	 */
	private static myLinkedList<Ingredient> whiteBreadIG(){
		myLinkedList<Ingredient> whiteBreadIG = new myLinkedList<>();

		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Yeast")));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour")));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar")));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Water")));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Salt")));
		whiteBreadIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Butter")));

		return whiteBreadIG;
	}

	/**
	 * Create the InStruction for a white bread
	 * @return the queue of instructions
	 */
	private static myQueue<String> whiteBreadIS(){
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
	 * Create the InGredients for a fancy cake
	 * @return the linked list of the ingredients
	 */
	private static myLinkedList<Ingredient> fancyCakeIG(){
		myLinkedList<Ingredient> fancyCakeIG = new myLinkedList<>();

		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Flour")));
		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Butter")));
		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sugar")));
		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Egg")));
		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Frosting")));
		fancyCakeIG.addLast(new myLinkedList<Ingredient>(new Ingredient("Sprinkles")));

		return fancyCakeIG;
	}

	/**
	 * Create the InStruction for a fancy cake
	 * @return the queue of instructions
	 */
	private static myQueue<String> fancyCakeIS(){
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
	 * checking to see if the ingredients the player picked match 
	 * the one created by the developer
	 * @param definedIG the linked list of the created ingredient
	 * @param userIG an ArrayList of the users ingredient selection
	 * @return if the user list and the recipe list are the same
	 */
	public static void checkIngredients(myLinkedList<Ingredient> definedIG , Map<String, Integer> userIG) {
		/*
		 * if the two lists are not the same size,
		 * then it is obvious that it is false
		 */
		if(definedIG.getSize() != userIG.size()) {
			isIGCorrect = false;
		}else {
			// a set for the ingredient names that the user inputed
			Set<String> name = userIG.keySet();

			for(myLinkedList<Ingredient> curNode = definedIG.head; curNode != null; curNode = curNode.getNext()) {
				if(!(name.contains(curNode.getInfo().getName()))){ // check if the defined ingredient exist in the user's set
					isIGCorrect = false;
				}else if(userIG.get(curNode.getInfo().getName()) != curNode.getInfo().getAmount()) { // check if the amounts are the same
					isIGCorrect = false;
				}else {
					continue;
				}
			}
			isIGCorrect = true; // true if everything are the same
		}
	}

	/**
	 * checking to see if the instructions the player picked match 
	 * the one created by the developer
	 * @param definedIS the queue of the created instruction
	 * @param userIS the queue of the users instruction selection
	 * @return if the both queue are the same
	 */
	public static void checkInstruction(myQueue<String> definedIS, myQueue<String> userIS) {
		/*
		 * if the two lists are not the same size,
		 * then it is obvious that it is false
		 */
		if(definedIS.size() != userIS.size()) {
			isISCorrect = false;
		}else {
			/*
			 * looping through the queue, does not use iterator 
			 */
			int size = definedIS.size();
			for(int i = 0; i < size; i++) {
				if(!(definedIS.peek().toString().equals(userIS.peek().toString()))) {
					isISCorrect = false;
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
			isISCorrect = true;
		}
	}
}