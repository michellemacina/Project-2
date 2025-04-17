package sandbox;

public abstract class Shape {
    public abstract double area();

    public void describe() {
        System.out.println("The Area is: ");
    }

    class Rectangle extends Shape {
        double length;
        double width;

        public Rectangle(double area, double length, double width) {
            this.length = length;
            this.width = width;

        }

        @Override
        public double area() {
            return length * width;

        }

    }
    class Circle extends Shape{
        double radius;
        public Circle(double area,double radius){
            this.radius=radius;
        }
        @Override
        public double area(){
            return Math.PI * (radius*radius);
        }

    }

    //make it say them both 
}