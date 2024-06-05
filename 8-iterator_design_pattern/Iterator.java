public interface Iterator<T> {
    /**
     * Checks if there is a next element in the iteration.
     * 
     * @return true if there is a next element, false otherwise
     */
    boolean hasNext();

    /**
     * Returns the current item in the iteration.
     * 
     * @return the current item
     */
    T currentItem();

    /**
     * Returns the next item in the iteration.
     * 
     * @return the next item
     */
    T next();
}
