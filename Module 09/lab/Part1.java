package lab;

abstract class Appliance {
    String brand;

    // add constructor
    public Appliance(String brand) {
        this.brand = brand;
    }

    // abstract method
    public abstract double energyUsage(int hours);

    // concrete method
    public void info() {
        System.out.println("The Brand is: " + brand);
    }

}

// create 2 subclasses

class Washer extends Appliance {
    // constructor
    public Washer(String brand) {
        super(brand);
    }

    // use the abstract method
    @Override
    public double energyUsage(int hours) {
        return 0.5 * hours;
    }
}

class Dryer extends Appliance {
    // constructor
    public Dryer(String brand) {
        super(brand);
    }

    // use abstract method
    @Override
    public double energyUsage(int hours) {
        return 1.0 * hours;
    }

}

public class Part1 {
    public static void main(String[] args) {
        // create appliances
        Appliance washer = new Washer("Samsung");
        Appliance dryer = new Dryer("Samsung");

        // call info()
        washer.info();
        dryer.info();

        // call energyUsage()
        System.out.println("The washer uses: " + washer.energyUsage(3) + " energy");
        System.out.println("The dryer uses: " + dryer.energyUsage(3) + " energy");
       
    }

}
