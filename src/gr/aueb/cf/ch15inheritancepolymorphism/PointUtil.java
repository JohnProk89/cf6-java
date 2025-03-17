package gr.aueb.cf.ch15inheritancepolymorphism;

/**
 * Point utility class
 */
public class PointUtil {

    /**
     * Polymorphic method that calculates the distance from the zero origin
     * @param point the point whose distance is calculated
     * @return the distance
     */
    public static double distanceFromOrigin(Point point) {
        return point.getDistanceFromOrigin();
    }
}
