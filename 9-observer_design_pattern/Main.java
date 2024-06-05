public class Main {
    // Observer Pattern belongs to the Behavioral Pattern category.
    // It is based on notifying other objects when a change occurs in any object.
    /*
    For example, let's say there are parents and a teacher who are following a student.
    When the student skips a class, the school directly notifies the parents and the teacher who are following the student.
    In this case:
    Subject -> Object being followed -> Student
    Observer -> Notifier
    Concrete -> Object following -> Parents, Teacher */
    
    public static void main(String[] args) {
        Student student = new Student();
        FatherObserver father = new FatherObserver();
        MotherObserver mother = new MotherObserver();
        TeacherObserver teacher = new TeacherObserver();
        
        student.addObserver(mother);
        student.addObserver(father);
        student.addObserver(teacher);

        student.setHasMissedClass(true); // Notify observers about the missed class
    }
}