package lab;

import java.util.List;

public class SumNestedList {
    //method 
    int sum(List<Object> list){
        int total = 0;

        //go through each number in list 
        for (Object number : list){
            //base case: return just the one
            if (number instanceof Integer){
                total += (Integer) number;
            }
            //recursive case: if the number is a list 
            else if (number instanceof List<?>){
                total += sum((List<Object>) number);

            }
        }
                return total;

        }
        public static void main(String[] args) {
            System.out.println();
        }
    }
    

