import java.util.Scanner;

public class Lab04_A {

    // Instance variables
    private static String firstName;
    private static String lastName;
    private static int age;
    private static char gender;
    private String studentNumber;
    private static int studentCount = 0;

    // Default constructor
    public Lab04_A() {
        studentCount++;
        this.studentNumber = "22201" + String.format("%03d", studentCount);
    }

    // Constructor with all attributes
    public Lab04_A(String firstName, String lastName, int age, char gender) { // Changed parameter type
        Lab04_A.firstName = firstName;
        Lab04_A.lastName = lastName;
        Lab04_A.age = age;
        Lab04_A.gender = gender;
        studentCount++;
        this.studentNumber = "22201" + String.format("%03d", studentCount);
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        Lab04_A.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        Lab04_A.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Lab04_A.age = age;
    }

    public char getGender() { // Changed return type
        return gender;
    }

    public void setGender(char gender) { // Changed parameter type
        Lab04_A.gender = gender;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        Lab04_A.studentCount = studentCount;
    }


    @Override
    public String toString() {
        return "Full names: " + firstName + " " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Student Number: " + studentNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int studentCount = sc.nextInt();
        sc.nextLine();// Consume newline character after nextInt()
        if (studentCount <= 0) {
            System.out.println("Please provide a positive count of students");
            return;
        }

        Lab04_A[] students = new Lab04_A[studentCount];

        int i;
        for (i = 0; i < studentCount; i++) {
            System.out.println("Enter student details:First name,Last name,Age,Gender");
            String firstName = sc.nextLine();
            String lastName = sc.nextLine();
            int age = sc.nextInt();
            char gender = sc.next().charAt(0);

            sc.nextLine();

            if (age <= 0) {
                System.out.println("Please provide a valid student age");
                sc.close();
                return;
            }

            students[i] = new Lab04_A(firstName, lastName, age, gender);
        }
        for (Lab04_A student : students) {

            System.out.println(students.toString());
        }

            sc.close();

    }
}


