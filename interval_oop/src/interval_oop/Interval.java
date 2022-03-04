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
	 * Representation invariant:
	 * 
	 * @invar | 0 <= length
	 */
	private int lowerBound;
	private int length;
	
	public int getLowerBound() { return lowerBound; }
	public int getUpperBound() { return lowerBound + length; }
	public int getLength() { return length; }
	
	/**
	 * Initializes this object to store the interval with the given lower bound and upper bound.
	 * 
	 * @throws IllegalArgumentException | upperBound < lowerBound
	 * 
	 * @post | getLowerBound() == lowerBound
	 * @post | getUpperBound() == upperBound
	 */
	public Interval(int lowerBound, int upperBound) {
		this.lowerBound = lowerBound;
		this.length = upperBound - lowerBound;
	}
	
	/**
	 * Shifts the interval stored by this object to the right by the given amount.
	 * 
	 * @post | getLowerBound() == old(getLowerBound()) + amount
	 * @post | getUpperBound() == old(getUpperBound()) + amount
	 */
	public void shift(int amount) {
		lowerBound += amount;
	}

}
