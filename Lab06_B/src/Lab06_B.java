class Eat {
    String name;
    public void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Eat {
    public void display() {
        System.out.println("My name is " + name);
    }
}

    public class Lab06_B {

        public static void main(String[] args) {

            Dog labrador = new Dog();

            labrador.name = "Roku";
            labrador.display();
            labrador.eat();
        }
    }

