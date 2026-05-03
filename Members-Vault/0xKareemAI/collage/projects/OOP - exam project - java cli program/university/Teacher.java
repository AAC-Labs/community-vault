package university;

public class Teacher extends Person {
    private double salary;

    public Teacher(String name, String id, double salary) {
        super(name, id, "Teacher");
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Teacher Info] " + getDetails());
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Salary: $" + salary;
    }

    public double getSalary() {
        return salary;
    }
}
