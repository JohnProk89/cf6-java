package gr.aueb.cf.ch14utilitiesfactories;

import java.util.ArrayList;

/**
 * {@Link FlyWeightPattern} implements the <b>Flyweight design pattern</b>.
 * That is it guarantees that two {@link ImmutablePoint} instances a, b are
 * equal (states are equal) if (if and only if) a == b (references are equal).
 *
 * This is also a <b>facade design pattern</b> since {@Link FlyWeightPattern} class
 * provides an 'interface' to other packages for getting {@Link ImmutablePoint}
 * instances since {@Link ImmutablePoint} constructor is package private and
 * external packages can not directly get {@Link ImmutablePoint} instances.
 */
public class FlyWeightPattern {
    private static final ArrayList<ImmutablePoint> points = new ArrayList<>();

    private FlyWeightPattern() {

    }

    /**
     * Static factory that returns unique points
     * or a reference to an existing object
     *s
     * @param x
     * @param y
     * @return
     */
    public static ImmutablePoint getFlyWeightPoint(int x, int y) {
        ImmutablePoint point = null;

        int position = getPointPosition(x, y);

        if (position == -1) {
            point = new ImmutablePoint(x, y);
            points.add(point);
        } else {
            point = points.get(position);
        }

        return point;
    }

    private static int getPointPosition(int x, int y) {
        int positionToReturn = -1;

        for (int i = 0; i < points.size(); i++) {
            if ((points.get(i).getX() == x) && (points.get(i).getY() == y)) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}