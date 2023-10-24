public class Trekant {
    private double g;
    private double h;

    public Trekant() {
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Trekant(double g, double h) {
        this.g = g;
        this.h = h;
    }


    public double getAreal(){
        return 0.5*g*h;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Trekant{" +
                "g=" + g +
                ", h=" + h +
                '}';
    }
}

