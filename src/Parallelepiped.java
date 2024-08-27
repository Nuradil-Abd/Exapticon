import impl.GeometricFigureService;

public class Parallelepiped implements GeometricFigureService {
    private double length, width, height;
    public Parallelepiped() {

    }

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void area() {
        double area = 2*((getHeight() * getLength()) + (getLength() * getWidth()) + (getHeight() * getWidth()));
        System.out.println("Параллелепипедтин аянты =  " + area);
    }

    @Override
    public void volume() {
       double volume =  (getLength() * getWidth() * getHeight());
        System.out.println("Параллелепипедтин колому = " + volume);
    }
}
