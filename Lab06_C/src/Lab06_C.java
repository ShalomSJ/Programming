  class Eat {
    private String name;
    public void eat() {
        System.out.println("I can eat very well");
    }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }
  }

  class Dog extends Eat {
    public void display() {
        System.out.println("My surname is " + getName()); //get the value of name
    }
}

  public class Lab06_C {

    public static void main(String[] args) {

        Dog labrador = new Dog();

        //set name value
        labrador.setName("Huda");
        labrador.display();
        labrador.eat();
    }
}
