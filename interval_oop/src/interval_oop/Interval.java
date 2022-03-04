package interval_oop;

/**
 * Each instance of this class stores an interval with integer bounds.
 * 
 * Abstract state invariants:
 * 
 * @invar | getLength() == getUpperBound() - getLowerBound()
 * @invar | getLowerBound() <= getUpperBound()
 */
public class Interval {
	
	/**
	 * Representation invariants:
	 * 
	 * @invar | lowerBound <= upperBound
	 */
	private int lowerBound;
	private int upperBound;
	
	public int getLowerBound() { return lowerBound; }
	public int getUpperBound() { return upperBound; }
	public int getLength() { return upperBound - lowerBound; }
	
	/**
	 * Initializes this object to store the interval with the given lower bound and upper bound.
	 * 
	 * @throws IllegalArgumentException | upperBound < lowerBound
	 * 
	 * @post | getLowerBound() == lowerBound
	 * @post | getUpperBound() == upperBound
	 */
	public Interval(int lowerBound, int upperBound) {
		if (upperBound < lowerBound)
			throw new IllegalArgumentException("`upperBound` is less than `lowerBound`");
		
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	/**
	 * Shifts the interval stored by this object to the right by the given amount.
	 * 
	 * @post | getLowerBound() == old(getLowerBound()) + amount
	 * @post | getUpperBound() == old(getUpperBound()) + amount
	 */
	public void shift(int amount) {
		this.lowerBound += amount;
		this.upperBound += amount;
	}

}
