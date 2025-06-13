import java.util.Scanner;
import java.util.InputMismatchException;
public class Lab10_D {
    public static void main(String args[]) {
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
            int number[ ] = {4,7,2,9,5};

            System.out.println(number[3]);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero-Error."); System.exit(0);
        } catch (InputMismatchException InputMismatchException ) {
            System.out.println("Invalid character entering."); System.exit(0);
        }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of size of array"); System.exit(0);}
        System.out.println("DIVISION = " + divZ);
    }
}