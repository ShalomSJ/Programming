import java.util.Scanner;
public class Lab10_A2 {

    // Java Program to Handle exception
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        try {

            System.out.println("Enter value of a: ");
            a = sc.nextInt();
            System.out.println("Enter value of b: ");
            b = sc.nextInt();

            c = a / b;


            if (b != 0) {
                System.out.println("The division of A with B = " + c);
            }
        } catch (ArithmeticException e) {
            System.out.println("Division by zero-Error.");
            System.out.println("After catch statement.");
        }
    }
}
