package lab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {

    // custom exception
    public static void main(String[] args) {
        try {
            //read and process file
            readFile("File.txt");
        } catch (ProcessingException e) {
            e.printStackTrace();
            //print original cause and stack trace 
            System.out.println("Original Cause: " + e.getCause());

        }
    }
    public static void readFile(String fileName) throws ProcessingException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            //reads first line of file
            String line = reader.readLine();
            //print the first line
            System.out.println("First Line: " + line);
            reader.close();
        } catch (IOException e) {
            throw new ProcessingException("Error processing file: " + fileName, e);

        }
    }
}

// custom exception class
class ProcessingException extends Exception {
    public ProcessingException(String message, Throwable cause) {
        super(message, cause);

    }
}
