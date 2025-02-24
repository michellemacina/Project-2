public class loops {
    public static void main (String[] args) {
        int sumFor = 0;
        for (int i=1; i<= 100; i++) {
            sumFor += i;
        }
        System.out.println("Sum using for loop:" + sumFor);

        int sumWhile =0;
        int i=1;
        while (i<=100) {
            sumWhile += i;
            i++;
        }
        System.out.println("Sum using while loop:" + sumWhile);

        int sumDoWhile=0;
        int j=1;
        do{
            sumDoWhile += j;
            j++;
        } while (j<= 100);
        System.out.println("Sum using do while loop:" + sumDoWhile);
    }
    
}