package OOP;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");
        System.out.println(circle.toString());
    }
}
