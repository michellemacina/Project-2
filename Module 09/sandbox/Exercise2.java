package sandbox;

public class Exercise2 {
    public interface Chargeable {
        void charge();
        int getBatteryLevel();
    
    }
    //implement the interface of at least two classes 
    class Smartphone implements Chargeable{
    double batteryLevel;

    @Override
    public void charge() {
       batteryLevel+= 10;
    }

    @Override
    public int getBatteryLevel() {
   return (int) batteryLevel;
    }
}

class ElectricScooter implements Chargeable{
    double batteryLevel;

    @Override
    public void charge() {
     batteryLevel += 20;
    }

    @Override
    public int getBatteryLevel() {
       return (int) batteryLevel;
    }
    
}
}

