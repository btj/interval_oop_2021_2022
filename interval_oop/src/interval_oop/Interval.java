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
	
	public int getLowerBound() { throw new RuntimeException("Not yet implemented"); }
	public int getUpperBound() { throw new RuntimeException("Not yet implemented"); }
	public int getLength() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * Initializes this object to store the interval with the given lower bound and upper bound.
	 * 
	 * @throws IllegalArgumentException | upperBound < lowerBound
	 * 
	 * @post | getLowerBound() == lowerBound
	 * @post | getUpperBound() == upperBound
	 */
	public Interval(int lowerBound, int upperBound) { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * Shifts the interval stored by this object to the right by the given amount.
	 * 
	 * @post | getLowerBound() == old(getLowerBound()) + amount
	 * @post | getUpperBound() == old(getUpperBound()) + amount
	 */
	public void shift(int amount) { throw new RuntimeException("Not yet implemented"); }

}
