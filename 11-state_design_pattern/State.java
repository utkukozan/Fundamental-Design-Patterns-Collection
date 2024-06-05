public interface State {
    /**
     * Performs an action based on the given miles and sets the state.
     * 
     * @param miles     the number of miles
     * @param setState  the object used to set the state
     */
    public void doAct(int miles, SetState setState);
}
