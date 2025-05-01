package sandbox;
//a recursive version of a function is one that calls itself to solve a smaller version of the same problem. 

public class Exercise3 {

//method for power 
public static double power(double base,int exponent){
    
//base case 
if(exponent==0){
    return 1;
}

//in case of negative 
if (exponent < 0){
    return 1/power (base, -exponent); //makes exponent positive and calls function 
}

//recursive case(smaller version of the promlem)
return base * power(base, exponent-1);

}

public static void main(String[] args) {
    System.out.println(power(2, 3));
    System.out.println(power(3, -1));
}

}
