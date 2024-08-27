import impl.GeometricFigureService;

import static java.lang.Math.PI;

public class Cylinder implements GeometricFigureService {
    private double radius;
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void area() {
        double area = 2 * PI * getRadius()*( getHeight() + getRadius());
        System.out.println("Цилиндрдын аянты = " + Math.round(area));

    }

    @Override
    public void volume() {
        double volume = (PI*getRadius() * getRadius() * getHeight());
        System.out.println("Цилиндрдын колому = " + Math.round(volume));

    }
}
