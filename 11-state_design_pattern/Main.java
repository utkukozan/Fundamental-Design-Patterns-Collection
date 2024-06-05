public class Main {
    public static void main(String[] args) {
        // State Pattern is a design pattern that allows an object to exhibit different behaviors dynamically
        // at runtime when its internal state changes.
        
        int miles = 5000;
        State startState = new Start(miles);
        SetState set = new SetState();

        startState.doAct(miles, set);
        
        while (miles != 0) {
            miles--;
            
            if (miles == 2500) {
                State waitState = new Wait(miles);
                waitState.doAct(miles, set);
            }
        }
        
        State stopState = new Stop(miles);
        stopState.doAct(miles, set);
    }
}
