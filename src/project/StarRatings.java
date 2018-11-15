package project;

import java.util.HashMap;

/**
 * class to store star rating (complexity) associated with recipe
 * @author campbellg4
 *
 */
public class StarRatings {
	
	/**
	 * method to create hash map of recipe name and star rating
	 * by integer
	 * @param name
	 * @return returns values association
	 */
	public static Integer rating(String name) {
		HashMap<String, Integer> starValues = new HashMap<>();
		starValues.put("Sugar Cookies", 1);
		starValues.put("Chocolate Cake", 1);
		starValues.put("Chocolate Chip Cookies", 2);
		starValues.put("Banana Bread", 2);
		starValues.put("White Bread", 3);
		starValues.put("Fancy Cake", 3);
		
		if (starValues.containsKey(name)) {
			return starValues.get(name);
		}
		return null;
	}
	
	/**
	 * called from recipe menu controller
	 * for displaying amount of stars
	 * @param name
	 * @return value associated with given recipe name
	 */
	public static Integer getRatings(String name) {
		return rating(name);
	}
}
