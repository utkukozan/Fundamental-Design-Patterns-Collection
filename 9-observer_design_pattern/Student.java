import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private String className;
    private boolean hasMissedClass;
    private ArrayList<Observer> observers;

    public Student() {
        this.observers = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public boolean hasMissedClass() {
        return hasMissedClass;
    }

    public void setHasMissedClass(boolean hasMissedClass) {
        this.hasMissedClass = hasMissedClass;
        if (hasMissedClass) {
            notifyObservers();
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}