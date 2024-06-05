public class Start implements State {
    int miles;

    public Start(int miles) {
        this.miles = miles;
    }

    @Override
    public void doAct(int miles, SetState setState) {
        System.out.println("User now starts running from " + miles);
        setState.setState(this);
    }
}
