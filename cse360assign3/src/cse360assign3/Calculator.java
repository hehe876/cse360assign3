
package cse360assign3;
/**
 * Calculator is a simulator to a simple functional 
 * calculator with functions such as add, subtract, multiply
 * and divide
 * @author Nguyen
 *
 */
public class Calculator {

	private int total;
	private String history = new String("0");
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Return the value that the calculator is holding
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Add value to the total
	 * @param value
	 */
	public void add (int value) {
		total += value;
		history += (" + " + value);
	}
	
	/**
	 * Subtract value to the total
	 * @param value
	 */
	public void subtract (int value) {
		total -= value;
		history += (" - " + value);
	}
	
	/**
	 * Multiply value by the total
	 * @param value
	 */
	public void multiply (int value) {
		total *= value;
		history += (" * " + value);
	}
	
	/**
	 * divide the total by value
	 * @param value
	 */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total /= value;
		
		history += (" / " + value);
	}
	
	/**
	 * Return calculator's history as a string
	 * @return history String that represent the history of the calculator
	 */
	public String getHistory () {
		return history;
	}
}
