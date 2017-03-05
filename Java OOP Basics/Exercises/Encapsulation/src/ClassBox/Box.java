package ClassBox;

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
        this.h = h;
    }

    private void setW(double w) {
        this.w = w;
    }

    private void setL(double l) {
        this.l = l;
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