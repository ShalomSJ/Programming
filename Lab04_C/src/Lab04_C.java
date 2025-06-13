public class Lab04_C {
        //ATTRIBUTE/PROPERTY SECTION
        String studName, studDept;
        int test1, test2, assign1, studNumber;

        public static void main(String[] args) {
            //CREATION OF OBJECT
            Lab04_C stud = new Lab04_C();

            stud.studName = "Teresia Aka";
            stud.studNumber=93100191;
            stud.studDept="Computer Science";
            stud.test1=23;
            stud.test2=18;
            stud.assign1=20;

            int totalMark;

            totalMark=stud.test1+stud.test2+ stud.assign1;

            //PRINTING SECTION-METHOD
            System.out.println("Student Name: "+stud.studName);
            System.out.println("Student Number: "+stud.studNumber);
            System.out.println("Student Department: "+stud.studDept);
            System.out.println("Test1: "+stud.test1);
            System.out.println("Test2: "+stud.test2);
            System.out.println("Assignment: "+stud.assign1);
            System.out.println("Total Mark: "+totalMark);

        }
    }

