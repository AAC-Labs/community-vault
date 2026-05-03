package university;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversitySystem {
    private static int totalMembers = 0;
    private static final String DATA_FILE = "university_data.txt";
    private List<Person> members;
    private Scanner scanner;

    public UniversitySystem() {
        this.members = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        loadData();
    }

    public static int getTotalMembers() {
        return totalMembers;
    }

    public void addMember(Person person) {
        members.add(person);
        totalMembers++;
        saveData();
    }

    public void listMembers() {
        if (members.isEmpty()) {
            System.out.println("No members found in the system.");
            return;
        }
        System.out.println("\n--- University Members List ---");
        for (Person member : members) {
            member.displayInfo();
            if (member instanceof Student) {
                System.out.println("  (Status: Student)");
            } else if (member instanceof Teacher) {
                System.out.println("  (Status: Faculty)");
            }
        }
    }

    public void saveData() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(DATA_FILE))) {
            for (Person member : members) {
                String type = (member instanceof Student) ? "STUDENT" : "TEACHER";
                writer.println(type + "|" + member.getName() + "|" + member.id + "|" + 
                    (member instanceof Student ? ((Student)member).getGpa() : ((Teacher)member).getSalary()));
            }
            System.out.println("Data auto-saved.");
        } catch (IOException e) {
            System.err.println("Error saving data: " + e.getMessage());
        }
    }

    public void loadData() {
        File file = new File(DATA_FILE);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length < 4) continue;

                String type = parts[0];
                String name = parts[1];
                String id = parts[2];
                double val = Double.parseDouble(parts[3]);

                if (type.equals("STUDENT")) {
                    members.add(new Student(name, id, val));
                } else if (type.equals("TEACHER")) {
                    members.add(new Teacher(name, id, val));
                }
                totalMembers++;
            }
            System.out.println("Loaded " + totalMembers + " members from file.");
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error loading data: " + e.getMessage());
        }
    }

    public void showMenu() {
        while (true) {
            System.out.println("\n=== University Management System CLI ===");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. List All Members");
            System.out.println("4. Show Total Count");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1":
                        System.out.print("Enter Student Name: ");
                        String sName = scanner.nextLine();
                        System.out.print("Enter Student ID: ");
                        String sId = scanner.nextLine();
                        System.out.print("Enter GPA (0.0 - 4.0): ");
                        double gpa = Double.parseDouble(scanner.nextLine());
                        if (gpa < 0 || gpa > 4.0) throw new InvalidDataException("GPA must be between 0 and 4");
                        addMember(new Student(sName, sId, gpa));
                        break;

                    case "2":
                        System.out.print("Enter Teacher Name: ");
                        String tName = scanner.nextLine();
                        System.out.print("Enter Teacher ID: ");
                        String tId = scanner.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary = Double.parseDouble(scanner.nextLine());
                        if (salary < 0) throw new InvalidDataException("Salary cannot be negative");
                        addMember(new Teacher(tName, tId, salary));
                        break;

                    case "3":
                        listMembers();
                        break;

                    case "4":
                        System.out.println("Total University Members: " + getTotalMembers());
                        break;

                    case "5":
                        System.out.println("Exiting system. Goodbye!");
                        return;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InvalidDataException e) {
                System.out.println("Validation Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Input Error: Please enter numeric values for GPA/Salary.");
            }
        }
    }

    public static void main(String[] args) {
        UniversitySystem system = new UniversitySystem();
        system.showMenu();
    }
}
