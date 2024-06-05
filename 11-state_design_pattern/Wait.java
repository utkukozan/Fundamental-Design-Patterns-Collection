public class Wait implements State {
    int miles;

    public Wait(int miles) {
        this.miles = miles;
    }

    @Override
    public void doAct(int miles, SetState setState) {
        System.out.println("User is queuing up in the waiting state at " + miles + " miles");
        setState.setState(this);
    }
}
