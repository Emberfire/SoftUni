package ShapesDrawing;

class Circle implements Drawable {
    private int radius;
    private int centerX;
    private int centerY;

    public Circle(int radius, int centerX, int centerY) {
        this.setRadius(radius);
        this.setCenterX(centerX);
        this.setCenterY(centerY);
    }

    @Override
    public void draw() {
        double rIn = this.getRadius() - 0.4;
        double rOut = this.getRadius() + 0.4;

        for(double y = this.getRadius(); y >= -this.getRadius(); --y) {
            for (double x = -this.getRadius(); x < rOut; x+= 0.5) {
                double value = x * x + y * y;
                if (value >= rIn * rIn && value <= rOut * rOut) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    private int getRadius() {
        return this.radius;
    }

    private void setRadius(int radius) {
        this.radius = radius;
    }

    private int getCenterX() {
        return this.centerX;
    }

    private void setCenterX(int centerX) {
        this.centerX = centerX;
    }

     private int getCenterY() {
        return this.centerY;
    }

    private void setCenterY(int centerY) {
        this.centerY = centerY;
    }
}