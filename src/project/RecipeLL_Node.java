package project;

/**
 * A linked list for a list of ingredients
 * Array is restricted, and arraylist is not efficient 
 * 
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 */
public class RecipeLL_Node {
	private Ingredient ingred;
	private RecipeLL_Node next;
	
	/**
	 * Create a node with an ingredient and a pointer
	 * @param i ingredient object
	 * @param n pointer to the next recipe linked list node
	 */
	public RecipeLL_Node(Ingredient i, RecipeLL_Node n) {
		ingred = i;
		next = n;
	}
	
	/**
	 * Single parameter that accepts only an ingredient
	 * @param i ingredient object
	 */
	public RecipeLL_Node(Ingredient i) {
		this(i, null);
	}
	
	/**
	 * default constructor
	 */
	public RecipeLL_Node() {
		this(null, null);
	}
	
	/**
	 * a setter to connect the LL nodes together
	 * @param n another node
	 */
	public void setNext(RecipeLL_Node n) {
		next = n;
	}
	
	/**
	 * getter for the ingredient object
	 * @return the object of the ingredient
	 */
	public Ingredient getIngred() {
		return ingred;
	}
	
	/**
	 * whatever the next node is
	 * @return next LL node
	 */
	public RecipeLL_Node getNext() {
		return next;
	}
	
	/**
	 * toString method (just like the getter)
	 * @return the toString of the ingredient
	 */
	@Override
	public String toString() {
		return ingred.toString();
	}
}
