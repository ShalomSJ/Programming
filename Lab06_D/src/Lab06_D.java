import java.util.Scanner;
  class Cube {

      void findCube(int num) {
          int cube = num * num * num;
          System.out.println("Output: The Cube is: " + cube);
      }

  }
  public class Lab06_D {

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          Cube cube = new Cube();
          int num;

          System.out.print("Enter a Number: ");
          num = sc.nextInt();
          if (num < 0) {
              System.out.println("Number cannot be less than 0");
          } else {
              cube.findCube(num);

          }
      }
  }
