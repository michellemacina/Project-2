package lab;

import java.util.Scanner;

// custom exception class 
class InvalidAgeException extends Exception {
   public InvalidAgeException(String msg){
   super(msg);
}
}


//main where input it asked for 
public class Exercise1{


// method for age validtor 
public static void validateAge(int age) throws InvalidAgeException{
        if (age < 0 || age > 130){
            throw new InvalidAgeException("Age must be between 0 and 130");
        }
    }

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 System.out.println("Enter Age to Validate: ");
 try {
    int age = input.nextInt();
    validateAge(age);
    System.out.println("Age is valid");
    
 } catch (InvalidAgeException e) {
    System.out.println("Invalid Age Exception: " + e.getMessage());
 }
 finally{
    input.close();
 }
}
}




