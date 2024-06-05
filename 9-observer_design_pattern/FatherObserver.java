public class FatherObserver implements Observer {
    @Override
    public void update() {
        System.out.println("Father got notified that the student has skipped class.");
    }
}
