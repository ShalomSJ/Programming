public class Lab10_A1 {

    // Java Program to Handle exception
    public static void main(String[] args) {
        try {
            int a, b, d;
            b = 4;
            a = 44;

            d = a / b;
            System.out.println("The value of A divide B is = " + d);
        }catch (Exception e){
            System.out.println("DIVISION BY ZERO IS NOT PERMITTED");
        }
    }
}