class Animal {
    public void Polymorphism(){
        System.out.println("Demonstration of Polymorphism:");
    }
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Bird extends Animal{
    public void animalSound(){
        System.out.println("The Bird: Whistle");
    }
}

class Rat extends Animal{
    public void animalSound(){
        System.out.println("The Rat: Squeak");
    }
}


class Lion extends Animal{
    public void animalSound(){
        System.out.println("The Lion: Roar");
    }
}

public class Lab07_D {

    public static void main(String[] args) {

        Animal myAnimal = new Animal();  // Create a Animal object

        Animal myPig = new Pig();  // Create a Pig object

        Animal myDog = new Dog();  // Create a Dog object

        Animal myBird = new Bird();

        Animal myRat = new Rat();

        Animal myLion = new Lion();

        myAnimal.Polymorphism();
        myAnimal.animalSound();

        myPig.animalSound();

        myDog.animalSound();

        myBird.animalSound();
        myRat.animalSound();
        myLion.animalSound();

    }

}
