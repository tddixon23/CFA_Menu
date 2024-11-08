package MenuCategories;

/**
 * @author TD
 * @author EVH
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Salad {
	
	public static Map<String, Object> salad() {
		Map<String, Object> salad = new HashMap<String, Object>();
		salad.put("Cobb Salad", 9.39);
		salad.put("Spicy Southwest Salad", 9.59);
		salad.put("Market Salad", 9.59);

		System.out.printf("Cobb Salad\t $%.2f\n", salad.get("Cobb Salad"));
		System.out.printf("Spicy Southwest Salad\t $%.2f\n", salad.get("Spicy Southwest Salad"));
		System.out.printf("Market Salad\t $%.2f\n", salad.get("Market Salad"));
			return salad;
	}//end main
	
	public static boolean hasDuplicate(List<Double> list) {
		Set<Double> set = new HashSet<>(list);
		return set.size() < list.size();
	}

}//end Salads
