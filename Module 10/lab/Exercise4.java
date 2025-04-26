package lab;

public class Exercise4 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        //outer try/catch 
        try {
            System.out.println("Outer Try Block Started");

            //inner try/catch 
            try {
                //division by zero 
                int result = numbers[0]/0;
                System.out.println("Inner Try Result" + result);
                
                //inner try/catch
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e.getMessage());  
            }

            //array index out of bounds 
            int invalid = numbers[10];
            System.out.println("This line wont execute");

           //outer try catch  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Catch: Invalid Array Index"); 
        }
        System.out.println("Program continues after nested Try-Catch");
    }
    
}
