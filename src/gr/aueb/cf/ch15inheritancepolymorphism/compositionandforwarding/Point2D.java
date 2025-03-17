package gr.aueb.cf.ch15inheritancepolymorphism.compositionandforwarding;

public class Point2D {
    private Point point;
    private int z;

    public Point2D(){}

    public Point2D(Point point, int z) {
        this.point = point;
        this.z = z;
    }
}
