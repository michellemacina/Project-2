package sandbox;

// class for all animals 
class Animal {
    String name;
}

// class for dogs but they are apart of animal
class Dog extends Animal {
    public void bark() {
        System.out.println("woof");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("meow");
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        // array to enter animals
        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Dog();
        animals[3] = new Cat();
        animals[4] = new Dog();

        // what is this beginging part?
        for (Animal animal : animals) {
            // this is sayign that if the animal is a dog then preform the bark
            // or if the animal is a cat then meow
            // its looking down (downcasting) starting with the animal class(superclass) and
            // looking into the dog/cat (subclasses)
            if (animal instanceof Dog) {
                ((Dog) animal).bark();
            } else if (animal instanceof Cat) {
                ((Cat) animal).meow();
            }
        }
    }
}
