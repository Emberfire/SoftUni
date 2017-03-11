package Shapes;

public class Rectangle extends Shape{
    private double height;
    private double width;

    Rectangle(double height, double width) {
        this.setHeight(height);
        this.setWidth(width);
        this.calculateArea();
        this.calculatePerimeter();
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(2 * this.getHeight() + 2 * this.getWidth());
    }

    @Override
    protected void calculateArea() {
        setArea(this.getHeight() * this.getWidth());
    }

    private final double getHeight() {
        return this.height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private final double getWidth() {
        return this.width;
    }

    private void setWidth(double width) {
        this.width = width;
    }
}