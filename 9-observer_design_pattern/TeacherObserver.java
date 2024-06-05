public class TeacherObserver implements Observer {
    @Override
    public void update() {
        System.out.println("The teacher has been notified about the student's absence.");
    }
}
