package sandbox;

public class Excersice3 {
    public void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before swap x = " + x + " y = " + y);
        swap(x, y);
        System.out.println("After swap x = " + x + " y =" + y);

    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
