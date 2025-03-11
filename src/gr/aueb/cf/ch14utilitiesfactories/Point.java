package gr.aueb.cf.ch14utilitiesfactories;

import java.util.Random;

public class Point {
    private int x;
    private int y;

    private Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public static Point getInstance() {
//        return new Point();
//    }

    /**
     * A static factory that returns a (0, 0) new point.
     * @return a (0, 0) new point
     */
    public static Point getZeroPoint() {
        return new Point();
    }

    /**
     * A static factory that returns a random point...
     * @return
     */
    public static Point getRandomPoint() {
        Random rnd = new Random(System.currentTimeMillis());
        return new Point(rnd.nextInt(101),rnd.nextInt(101));
    }
}
