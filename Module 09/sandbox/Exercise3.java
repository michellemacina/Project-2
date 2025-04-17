package sandbox;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void printInfo(List<Number> numbers) {
        for (Number n : numbers) {
            System.out.println(n.getClass().getSimpleName() + ": " +
                    "intValue=" + n.intValue() + ", doubleValue=" + n.doubleValue());
        }
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(5);// integer
        numbers.add(2.0);// double
        numbers.add(3.0f);// float
    }
}
