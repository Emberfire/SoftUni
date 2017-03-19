package ShapesDrawing;

class Rectangle implements Drawable {
    private int height;
    private int width;

    Rectangle(int width, int height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    @Override
    public void draw() {
        StringBuilder rectangle = new StringBuilder();
        for (int row = 0; row < this.getHeight(); row++) {
            for (int column = 0; column < this.getWidth(); column++) {
                if (row == 0 || row == this.getHeight() - 1) {
                    rectangle.append("* ");
                } else {
                    if (column == 0 || column == this.getWidth() - 1) {
                        rectangle.append("* ");
                    } else {
                        rectangle.append("  ");
                    }
                }
            }

            rectangle.append("\n");
        }

        System.out.println(rectangle.toString());
    }

    private int getHeight() {
        return this.height;
    }

    private void setHeight(int height) {
        this.height = height;
    }

    private int getWidth() {
        return this.width;
    }

    private void setWidth(int width) {
        this.width = width;
    }
}