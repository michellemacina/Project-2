package sandbox;

public class Exercise4 {

    public static void main(String[] args) {
        try {
        //   processData("abc");
           processData("123");
        } catch (DataProcessingException e) {
            System.out.println("Data processing error: " + e.getMessage()+ " " + e.getCause().getMessage());
        }
    }

    public static int parseNumber(String str) throws NumberFormatException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void processData(String data) throws DataProcessingException {
        try {
            // Simulate data processing
            int number = parseNumber(data);
            System.out.println("Processed number: " + number);
        } catch (NumberFormatException e) {
            throw new DataProcessingException("Invalid numeric string. ", e);
        }
    }
}

//define custom class 
class DataProcessingException extends Exception {
    public DataProcessingException(String msg, Exception cause) {
        super(msg, cause);
    }
}
