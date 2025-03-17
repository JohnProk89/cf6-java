package gr.aueb.cf.ch15inheritancepolymorphism;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(1);
        Point p2 = new Point2D(5,12);
        Point p3 = new Point3D(5,9,23);

        p3.movePlusOne();
        ((Point3D) p3).sayHi(); //downcast

        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);

        System.out.println(p1.getX());
        System.out.println(p2.getX() + " " + ((Point2D) p2).getY());
        System.out.println(p3.getX() + " " + ((Point3D) p3).getY() + " " + ((Point3D) p3).getZ());

        System.out.println("Distance from origin: " + PointUtil.distanceFromOrigin(p1));
        System.out.println("Distance from origin: " + PointUtil.distanceFromOrigin(p2));
        System.out.println("Distance from origin: " + PointUtil.distanceFromOrigin(p3));
    }

    /**
     * It is a polymorphic method. That is a method that may get many forms of input, not only Point
     * but also Point2D & Point3D.
     * <br>
     * It is agnostic of the type of Point. It accepts any point in the inheritance hierarchy.
     *
     * @param point a Point instance or any type of instance in the inheritance hierarchy of Point.
     */
    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }
}
