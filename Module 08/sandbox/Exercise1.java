package sandbox;

class Vehicle {
    void start() {
        System.out.println("The Vehicle is starting");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("The car is honking");
    }

}

public class Exercise1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start();

        Car c = new Car();
        c.honk();
        c.start();

    }
}