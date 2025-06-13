import java.util.Scanner;

public class Lab04_B {

    private int x;
    private int y;

    public Lab04_B(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getQuadrant() {
        if (x > 0 && y > 0) {
            return "I";
        } else if (x < 0 && y > 0) {
            return "II";
        } else if (x < 0 && y < 0) {
            return "III";
        } else if (x > 0 && y < 0) {
            return "IV";
        } else {
            return "on the axis";
        }
    }

    public String toString() {
        return "Point (" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the x and y value:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        Lab04_B point = new Lab04_B(x, y);

        String quadrant = point.getQuadrant();

        if (x == 0 || y == 0) {
            System.out.println(point + " is at the centre and not in any Quadrant");
        } else {
            System.out.println(point.toString() + " is in Quadrant " + quadrant);
        }

        sc.close(); // Close scanner after use
    }
}
