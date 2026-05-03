package university;

public abstract class Person implements UniversityMember {
    private String name;
    protected String id;
    private final String role;

    public Person() {
        this("Unknown", "N/A", "Member");
    }

    public Person(String name, String id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    public final String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public abstract void displayInfo();

    @Override
    public String getDetails() {
        return "ID: " + id + ", Name: " + name + ", Role: " + role;
    }
}
