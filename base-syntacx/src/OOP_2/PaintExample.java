package OOP_2;

import java.util.EnumSet;

// Класс Point
class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Абстрактный класс Figure
abstract class Figure {
    Point point;

    public Figure(Point point) {
        this.point = point;
    }

    abstract double area();

    abstract double perimeter();
}

// Интерфейс Drawable
interface Drawable {
    void draw();
    void draw(Color color);
}

// Перечисление Color
enum Color {
    RED, GREEN, BLUE, YELLOW, BLACK
}

// Класс Circle
class Circle extends Figure implements Drawable {
    double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle at (" + point.x + ", " + point.y + ") with color BLACK");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Draw Circle at (" + point.x + ", " + point.y + ") with color " + color);
    }
}

// Класс Rectangle
class Rectangle extends Figure implements Drawable {
    double width, height;

    public Rectangle(Point point, double width, double height) {
        super(point);
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle at (" + point.x + ", " + point.y + ") with color BLACK");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Draw Rectangle at (" + point.x + ", " + point.y + ") with color " + color);
    }
}

// Класс Square
class Square extends Rectangle {

    public Square(Point point, double side) {
        super(point, side, side);
    }

    @Override
    public void draw() {
        System.out.println("Draw Square at (" + point.x + ", " + point.y + ") with color BLACK");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Draw Square at (" + point.x + ", " + point.y + ") with color " + color);
    }
}

// Класс Triangle
class Triangle extends Figure implements Drawable {
    double a, b, c;

    public Triangle(Point point, double a, double b, double c) {
        super(point);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double perimeter() {
        return a + b + c;
    }

    @Override
    public void draw() {
        System.out.println("Draw Triangle at (" + point.x + ", " + point.y + ") with color BLACK");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Draw Triangle at (" + point.x + ", " + point.y + ") with color " + color);
    }
}

// Утилитарный класс FigureUtil
class FigureUtil {

    private FigureUtil() {
        // Приватный конструктор
    }

    public static double area(Figure figure) {
        return figure.area();
    }

    public static double perimeter(Figure figure) {
        return figure.perimeter();
    }

    public static void draw(Drawable figure) {
        figure.draw();
    }

    public static void draw(Drawable figure, Color color) {
        figure.draw(color);
    }
}

// Класс для демонстрации работы
public class PaintExample {
    public static void main(String[] args) {
        Point p = new Point(0, 0);
        Circle circle = new Circle(p, 5);
        Rectangle rectangle = new Rectangle(p, 3, 4);
        Square square = new Square(p, 2);
        Triangle triangle = new Triangle(p, 3, 4, 5);

        FigureUtil.draw(circle);
        FigureUtil.draw(circle, Color.RED);
        FigureUtil.draw(rectangle);
        FigureUtil.draw(rectangle, Color.GREEN);
        FigureUtil.draw(square);
        FigureUtil.draw(square, Color.BLUE);
        FigureUtil.draw(triangle);
        FigureUtil.draw(triangle, Color.YELLOW);
    }
}
