package lab;

public class Excercise3 {
    public static void main(String[] args) {

        //array of comma seperated values
        String[] values = {"12","20","mich","2000","elle"};

        //try/catch with a loop to go through all the inputs of the array
        for (String value : values){
        try {

            //attempt to convert string into an integer 
            int integer = Integer.parseInt(value);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid: "+ value);
            
        }
    }
}
}
