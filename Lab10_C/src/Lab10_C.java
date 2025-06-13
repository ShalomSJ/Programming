import java.util.Scanner;
public class Lab10_C {
    public static void main(String[] args) {
        //int d, a;
        int upper, lower;
        double divZ=0.0;
        try {
            //int divZ=0, upper, lower;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the upper = ");
            upper = sc.nextInt();
            System.out.print("Enter the lower = ");
            lower = sc.nextInt();
            divZ=upper/lower;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero-Error.");
        }
        System.out.println("DIVISION = " + divZ);
    }
}