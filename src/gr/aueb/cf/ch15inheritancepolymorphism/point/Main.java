package gr.aueb.cf.ch15inheritancepolymorphism.point;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(5);
        Point2D point2D = new Point2D(9,4);
        Point3D point3D = new Point3D(5,6,7);

        doPrint(point);
        doPrint(point2D);
        doPrint(point3D);
    }

    public static void doPrint(Point point) {
        System.out.println(point);
    }
}
