package lab;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // prompt user for file name 
    System.out.println("Enter a file name");
    String filename=scanner.nextLine();

    // prompt the user for a line of text
    System.out.println("Enter text");
    String text=scanner.nextLine();

    //append the text to the file 
    try(FileWriter writer = new FileWriter(filename, true)){
        writer.write(text);
        System.out.println("Text Appended to File");

        //IOException 
    }catch (IOException e){
       System.out.println("IOException" + e.getMessage());

        //SecurityException
    }catch (SecurityException e){
        System.out.println("Security Exception" + e.getMessage());
        
        //close the scanner
    }finally{
        scanner.close();
    }
        
    }
}

