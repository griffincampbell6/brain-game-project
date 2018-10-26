package project;

/**
 * This is a class to instantiate an ingredient for a recipe
 * 
 * @author 
 */
public class Ingredient {
	private final String name;
	private String unit;
	private int amount;
	
	/**
	 * Create an ingredient by its name
	 * @param name this ingredient's name
	 */
	public Ingredient(String name, String unit) {
		this.name = name;
		this.unit = unit;
	}
	
	/**
	 * If it is just a string, that would be the name of the recipe
	 * @param name the recipe
	 */
	public Ingredient(String name) {
		this(name, null);
	}
	
	/**
	 * default constructor for an ingredient
	 * the name would be null
	 */
	public Ingredient() {
		this(null, null);
	}
	
	/**
	 * set an amount for this ingredient
	 * @param amount the measurement for the ingredient (100, 2, 3)
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * getter for this ingredient's name
	 * @return this name
	 */
	public String getName() {
		return name;
	}

	/**
	 * getter for this ingredient's amount
	 * @return this amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * getter for this ingredient's unit
	 * @return this unit
	 */
	public String getUnit() {
		return unit;
	}
	
	/**
	 * this ingredient's name and amount with its unit
	 * @return the toString of this class
	 */
	@Override
	public String toString() {
		return String.format("%s: %d %s", name, amount, unit);
	}
}
