package ClasBoxDataValidation;

class Box {
    private double l;
    private double w;
    private double h;

    Box(double l, double w, double h) {
        this.setL(l);
        this.setW(w);
        this.setH(h);
    }

    private void setH(double h) {
        if (h > 0) {
            this.h = h;
        } else {
            throw new IllegalStateException("Height cannot be zero or negative.");
        }
    }

    private void setW(double w) {
        if (w > 0) {
            this.w = w;
        } else {
            throw new IllegalStateException("Width cannot be zero or negative.");
        }
    }

    private void setL(double l) {
        if (l > 0) {
            this.l = l;
        } else {
            throw new IllegalStateException("Length cannot be zero or negative.");
        }
    }

    double calculateArea(double l, double w, double h) {
        return (2 * l * w) + (2 * l * h) + (2 * w * h);
    }

    double calculateLateralArea(double l, double w, double h) {
        return (2 * l * h) + (2 * w * h);
    }

    double calculateVolume(double l, double w, double h) {
        return l * w * h;
    }
}