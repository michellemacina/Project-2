import java.util.List;

public class SumNestedList {
    // method
    private static int sum(List<Object> list) {
        int total = 0;

        // go through each number in list
        for (Object number : list) {
            // base case: return just the one
            if (number instanceof Integer) {
                total += (Integer)number;
            }
            // recursive case: if the number is a list
            else if (number instanceof List<?>) {
                total += sum((List<Object>) number);

            }
        }
        return total;

    }

    public static void main(String[] args) {
        List<Object> list = List.of(1, List.of(2, 3), 4, List.of(5, List.of(6)));
        System.out.println(sum(list));
    }
}
