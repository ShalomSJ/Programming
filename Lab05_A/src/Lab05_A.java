public class Lab05_A {

    String name,department;

    int age;
    int number;
    int semesterMark;

    public static void main(String[] arg) {

        Lab05_A student = new Lab05_A();

        student.name = "Ramesh";

        student.number = 253110101;

        student.age = 25;

        student.department="Computer Science";

        student.semesterMark=67;

        System.out.println("Name: "+ student.name);

        System.out.println("Student Number: "+ student.number);

        System.out.println("Age: "+ student.age);

        System.out.println("Department :"+student.department);

        System.out.println("Semester Mark :"+student.semesterMark);

    }

}

