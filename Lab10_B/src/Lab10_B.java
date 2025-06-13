public class Lab10_B {
    public static void main(String[] args) {
        int a, b, m;
        try {
            a = 44;
            b = 4;
            m = a / b;
            System.out.println("The value of A divide by B is = " + m);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero-Error.");
        }
        try {
            int[] number = {4, 7, 2, 8, 5};
            System.out.println("The value in array is : " + number[0]);
        }

        //An Array containing 5 spaces were declared, but you are trying to access the 6th location using number[7], hence it will give error.
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of size of the array");
            System.out.println("After catch statement.");
        }
    }
}