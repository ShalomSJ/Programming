import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String firstName;
    private String lastName;
    private int age;
    private char gender;
    private String studentNumber;
    private static int studentCount = 0;

    // Default Constructor
    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.gender = ' ';
        this.studentNumber = generateStudentNumber();
    }

    // Constructor with all attributes
    public Student(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.studentNumber = generateStudentNumber();
    }

    // Getter and Setter methods
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    // Generate student number based on count
    private String generateStudentNumber() {
        studentCount++;
        String countString = String.format("%03d", studentCount);
        return "22201" + countString;
    }

    // ToString method to print student details
    public String toString() {
        return "Full names : " + firstName + " " + lastName + "\n" +
                "Age : " + age + "\n" +
                "Gender : " + gender + "\n" +
                "Student Number : " + studentNumber + "\n";
    }
}

public class Lab04_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter the number of students:");
        int numberOfStudents = sc.nextInt();

        if (numberOfStudents < 0) {
            System.out.println("Please provide a valid student age");
            return; // Exit the program
        }

        sc.nextLine(); // Consume newline

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Last Name: ");
            String lastName = sc.nextLine();

            int age;
            System.out.print("Age: ");
            age = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (age < 0) {
                System.out.println("Provide a valid student age");
            }

            System.out.print("Gender (M/F): ");
            char gender = sc.nextLine().charAt(0);

            Student student = new Student(firstName, lastName, age, gender);
            students.add(student);
        }

                // Print out student details
        for (Student student : students) {
            System.out.println(student.toString());
                }
            }
        }





