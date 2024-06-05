public class MotherObserver implements Observer {
    @Override
    public void update() {
        System.out.println("Mother got notified that the student has skipped class.");
    }
}
