abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {
    double s;
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = (a + b + c) / 2;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

class Rectangle extends Shape {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    double getArea() {
        return a * b;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}