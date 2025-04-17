package lab;

import java.util.ArrayList;
import java.util.List;

public class Part3 {
    public static void printStats(List<Number> numbers) {
        // prints the class 
        for (Number n : numbers) {
            System.out.println(n.getClass().getSimpleName() + " intValue= " + n.intValue() + ", doubleValue=" + n.doubleValue());
        }
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(3.14);
        numbers.add(2.71f);
        numbers.add((short)10);

        printStats(numbers);
    }
}
