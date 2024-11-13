package task3;

public class Sphere extends ThreeDimensionalShape {

    public double calculateVolume(double raza) {
        return 4/3 * 3.14 * (raza * raza * raza);
    }

    public double calculateAria(double ar) {
        return 3.14 * (ar * ar);
    }
}

