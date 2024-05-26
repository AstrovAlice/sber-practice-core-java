package week4;

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double area() {
        return Math.PI*radius*radius;
    }
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
    public static void main(String args) {
        Circle circle = new Circle(5.0, "red");
        System.out.println(circle.toString());
    }
}