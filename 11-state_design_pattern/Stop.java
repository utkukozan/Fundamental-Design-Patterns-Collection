public class Stop implements State {
    int miles;

    public Stop(int miles) {
        this.miles = miles;
    }

    // Perform the action of stopping at a certain mile
    public void doAct(int miles, SetState setState) {
        System.out.println("User stopped at mile " + miles);
        setState.setState(this);
    }
}
