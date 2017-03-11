package Shapes;

abstract class Shape {
    private double perimeter;
    private double area;

    double getArea() {
        return this.area;
    }

    double getPerimeter() {
        return this.perimeter;
    }

    protected final void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    protected final void setArea(double area) {
        this.area = area;
    }

    protected abstract void calculatePerimeter();

    protected abstract void calculateArea();
}