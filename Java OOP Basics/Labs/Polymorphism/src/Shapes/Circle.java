package Shapes;

public class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.setRadius(radius);
        this.calculateArea();
        this.calculatePerimeter();
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(2 * Math.PI * this.getRadius());
    }

    @Override
    protected void calculateArea() {
        setRadius(Math.PI * (this.getRadius() * this.getRadius()));
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    private final double getRadius() {
        return this.radius;
    }
}