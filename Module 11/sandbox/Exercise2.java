package sandbox;

public class Exercise2 {

    //method to print backwards 
    static void printBackwards(int[] arr, int index){
            if (index < 0){ //base case
                System.out.println();
                return;
            }
        //print array 
        System.out.print(arr[index]+ " ");
    
        //recursive case 
        printBackwards(arr, index-1);
        }
        
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            System.out.println("Array in reverse order: ");
            printBackwards(arr,arr.length-1);
    }
}
