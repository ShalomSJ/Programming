import java.util.Scanner;
public class Lab05_C {

    public static class Employee1 {
        float basic_sal = 40000;

        float housing_all = 20000;

        float transport_all = 7000;
    }

// inherit from Employee1

    static class Programmer extends Employee1 {
        float bonus = 12000;

        float overtime = 9100;

        float progTotalSalary;

    }

    static class Admin extends Employee1 {
        float bonus = 10000;
        float overtime = 900;
        float totalAdminSalary;
    }

    static class Library extends Employee1 {
        float bonus = 90000;
        float overtime = 1900;
        float totalLibrarySalary;
    }


    public static void main(String[] args) {

        String firstName1 , lastName1 ;

        Scanner input = new Scanner(System.in);

        System.out.println("EMPLOYEE #1:");

        System.out.println("Enter a First Name:");
        if (input.hasNextLine()) {
            firstName1 = input.nextLine();

            System.out.println("Enter a Last Name:");
            if (input.hasNextLine()) {
                lastName1 = input.nextLine();

                Programmer program = new Programmer();

                program.progTotalSalary = program.basic_sal + program.housing_all + program.transport_all + program.bonus + program.overtime;

                System.out.println("Programmer’s Firstname and LastName are:" + firstName1 + " " + lastName1);

                System.out.println("Programmer’s Basic salary is:" + program.basic_sal);

                System.out.println("Programmers Housing Allowance is:" + program.housing_all);

                System.out.println("Programmers Transport Allowance is:" + program.transport_all);

                System.out.println("Bonus of Programmer is:" + program.bonus);

                System.out.println("overtime of Programmer is:" + program.overtime);

                System.out.println("TOTAL SALARY OF PROGRAMMER IS:" + program.progTotalSalary);


                Admin admin = new Admin();

                String firstName2 , lastName2 ;

                System.out.println("EMPLOYEE #2:");

                System.out.println("Enter a First Name:");
                firstName2 = input.nextLine();

                System.out.println("Enter a Last Name:");
                    lastName2 = input.nextLine();


                admin.totalAdminSalary = admin.basic_sal + admin.housing_all + admin.transport_all + admin.bonus + admin.overtime;

                System.out.println("Programmer’s Firstname and LastName are:" + firstName2 + " " + lastName2);

                System.out.println("Admin’s Basic salary is:" + admin.basic_sal);

                System.out.println("Admin's Housing Allowance is:" + admin.housing_all);

                System.out.println("Admin's Transport Allowance is:" + admin.transport_all);

                System.out.println("Bonus of Admin is:" + admin.bonus);

                System.out.println("overtime of Admin is:" + admin.overtime);

                System.out.println("TOTAL SALARY OF ADMIN STAFF IS:" + admin.totalAdminSalary);

                Library library = new Library();

                String firstName3 , lastName3 ;

                System.out.println("EMPLOYEE #3:");

                System.out.println("Enter a First Name:");
                    firstName3 = input.nextLine();


                System.out.println("Enter a Last Name:");
                    lastName3 = input.nextLine();

                    
                library.totalLibrarySalary = library.basic_sal + library.housing_all + library.transport_all + library.bonus + library.overtime;

                System.out.println("Librarian’s Firstname and LastName are:" + firstName3 + " " + lastName3);

                System.out.println("Librarian’s Basic salary is:" + library.basic_sal);

                System.out.println("Librarian's Housing Allowance is:" + library.housing_all);

                System.out.println("Librarian's Transport Allowance is:" + library.transport_all);

                System.out.println("Bonus of Librarian is:" + library.bonus);

                System.out.println("overtime of Librarian is:" + library.overtime);

                System.out.println("TOTAL SALARY OF LIBRARY STAFF IS:" + library.totalLibrarySalary);


            }

        }
    }
}

