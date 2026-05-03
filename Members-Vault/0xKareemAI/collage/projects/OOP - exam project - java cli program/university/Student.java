package university;

public class Student extends Person {
    private double gpa;

    public Student(String name, String id, double gpa) {
        super(name, id, "Student");
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Student Info] " + getDetails());
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", GPA: " + gpa;
    }

    public double getGpa() {
        return gpa;
    }
}
