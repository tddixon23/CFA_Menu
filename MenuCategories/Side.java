package MenuCategories;

/**
 * @author TD
 * @author EVH
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Side {

	public static void sides() {
		Map<String, Double> sideMenu = new HashMap<String, Double>();
		sideMenu.put("Small Fry", 2.09);
		sideMenu.put("Medium Fry", 2.35);
		sideMenu.put("Large Fry", 2.75);
		sideMenu.put("Small Fruit Cup", 2.99);
		sideMenu.put("Medium Fruit Cup", 3.95);
		sideMenu.put("Side Salad", 3.95);
		sideMenu.put("Small Mac and Cheese", 3.15);
		sideMenu.put("Medium Mac and Cheese", 3.95);
		sideMenu.put("Cup Chicken Noodle Soup", 3.75);
		sideMenu.put("Bowl Chicken Noodle Soup", 5.69);
		sideMenu.put("Cup Tortilla Soup", 5.19);
		sideMenu.put("Bowl Tortilla Soup", 7.95);
		sideMenu.put("Kale Crunch Side Salad", 2.35);
		sideMenu.put("Cookie Parfait", 4.65);
		sideMenu.put("Granola Parfait", 4.65);
		sideMenu.put("Chips", 1.99);
		sideMenu.put("Kids Apple Sauce", 2.29);

		StringBuilder sb = new StringBuilder();
		for (Entry<String, Double> entry : sideMenu.entrySet()) {
			sb.append(entry.getKey())
					.append(":  ---  $")
					.append(String.format("%.2f", entry.getValue()))
					.append("\n");
		}
		String result = sb.toString();
		System.out.println(result);

	}// end main

}// end Sides
