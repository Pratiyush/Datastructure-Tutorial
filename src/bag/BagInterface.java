package bag;

/**
 *  The <tt>Bag</tt> class represents a bag of generic items. 
 *  It supports insertion and iterating over the items in arbitrary order.
 *
 *  @author Pratiyush Kumar Singh
 *  @since Version 1.0
 */
public interface BagInterface<T> {

	/**
	 * Current, How many objects in the <tt>Bag</tt>?
	 * @return int -  No of entries currently in the <tt>Bag</tt>.
	 */
	public int getCurrentSize();

	/**Core Method
	 * Is <tt>Bag</tt> full?
	 * @return <tt>true</tt> if the <tt>Bag</tt> is full;<tt>false</tt> otherwise.
	 */
	public boolean isFull();

	/**
	 * Is <tt>Bag</tt> empty?
	 * @return <tt>true</tt> if the <tt>Bag</tt> is empty;<tt>false</tt> otherwise.
	 */
	public boolean isEmpty();

	/**Core Method
	 * Adds a new element to <tt>Bag</tt>.
	 * @param element - the new element to be added in <tt>Bag</tt>. 
	 * @return <tt>true</tt> if the addition is successful;<tt>false</tt> otherwise.
	 */
	public boolean add(T element);

	/**
	 * Removes a single unspecified element from the <tt>Bag</tt>.
	 * @return Removed element if the removal of element is successful;null otherwise.
	 */
	public T remove();

	/**
	 * Removes one occurrence of a given element from this <tt>Bag</tt>.
	 * @param element - the element to be removed
	 * @return <tt>true</tt> if the removal was successful;<tt>false</tt> otherwise.
	 */
	public boolean remove(T element);

	/** 
	 *  Removes all of the elements from this <tt>Bag</tt>.
     *  The <tt>Bag</tt> will be empty after this method returns.
     */
	public void clear();

	/**
	 * Counts the number of times a given entry appears in this <tt>Bag</tt>.
	 * @param element - the element to be counted
	 * @return the number of times element appears in the <tt>Bag</tt>
	 */
	public int getFrequencyOf(T element);

	/**
	 * Tests whether this <tt>Bag</tt> contains a given entry.
	 * @param element -  element whose presence in this <tt>Bag</tt> is to be tested
	 * @return <tt>true</tt> if the <tt>Bag</tt> contains element;<tt>false</tt> otherwise.
	 */
	public boolean contains(T element);

	/**Core Method
	 * Creates an array containing all of the elements in <tt>Bag</tt>.
	 * @return a newly allocated array of all the elements in the <tt>Bag</tt>.
	 */
	public T[] toArray();
}// >>>>>>>>>>>>>>>BagInterface Ends Here<<<<<<<<<<<<<<