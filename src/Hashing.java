package src;

public class Hashing extends Driver {
	private int curSize, maxSize;
	private String[] name; // key
	private Double[] price; // value

	/**
	 * Constructor
	 * 
	 * @param capacity
	 */
	public Hashing(int capacity) {
		curSize = 0;
		maxSize = capacity;
		name = new String[maxSize];
		price = new Double[maxSize];
	}// end Hashing

	/**
	 * Get with Modulus
	 * 
	 * @param KEY
	 * @return
	 */
	private int hash(String KEY) {
		return KEY.hashCode() % maxSize;
	}// end hash

	/**
	 * get value
	 * 
	 * @param KEY
	 * @return
	 */
	public String get(String KEY) {
		int i = hash(KEY);
		while (name[i] != null) {
			if (name[i].equals(KEY))
				return price[i].toString();
			i = (i + 1) % maxSize;
		}
		return null;
	}// end get

	/**
	 * Returns size of table
	 * 
	 * @return
	 */
	public int getSize() {
		return curSize;
	}// end getSize

	/**
	 * Do-while add method to add item to menu
	 * 
	 * @param name
	 * @param price
	 */
	public void insert(String KEY, Double value) {
		int add = hash(KEY);
		int i = add;

		do {
			if (name[i] == null) {
				name[i] = KEY;
				price[i] = value;
				curSize++;
				return;
			} // end if
			if (name[i].equals(KEY)) {
				price[i] = value;
				return;
			} // end if
			i = (i + 1) % maxSize;
		} // end do
		while (i != add);
	}// end insert

	/**
	 * remove item from table
	 * 
	 * @param name
	 */
	public void remove(String KEY) {
		if (!conatins(KEY))
			return;
		int i = hash(KEY);
		while (!KEY.equals(name[i]))
			i = (i + 1) % maxSize;
		name[i] = null;
		price[i] = null;

		curSize--;
	}// end remove

	/**
	 * Returns name if in table
	 * 
	 * @param name
	 * @return
	 */
	public boolean conatins(String KEY) {
		return get(KEY) != null;
	}// end contains

	/**
	 * Print method
	 */
	public void print() {
		System.out.println("Table:");
		for (int i = 0; i < maxSize; i++)
			if (name[i] != null)
				System.out.println(name[i] + " " + price[i]);
		System.out.println();
	}// end print

}// end Hashing
