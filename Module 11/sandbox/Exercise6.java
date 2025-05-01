package sandbox;

public class Exercise6 {

    //check if its even or odd if even print 0 if its odd print 1 then move to next number by dividing by 2 
public static String decimalToBinary(int n){

    if (n==0){
        return " ";
    }else{
        if (n % 2==0){ //even
        return decimalToBinary(n);
    } 
}
    return null;
}

public static void main(String[] args) {
    System.out.println(decimalToBinary(70));
}
}
