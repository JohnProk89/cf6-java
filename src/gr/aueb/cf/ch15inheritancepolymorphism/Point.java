package gr.aueb.cf.ch15inheritancepolymorphism;

/**
 * Defines a one dimension point.
 */
public class Point {
    private double x;

    public Point() {

    }

    public Point(double x) {
        this.x = x;
    }

    public double getX() { return x; }

    public void setX(double x) { this.x = x; }

    public String convertToString() { return "( " + x + ")"; }

    // Public API
    public void movePlus10() {
        x += 10;

        // Self-use of movePlusOne
//        for (int i = 1; i <= 10; i++) { // this implementation, creates logical error in derived classes...
//            movePlusOne();
//        }
    }

    public void movePlusOne() {
        x++;
    }

    protected void reset() {
        x = 0;
    }

    protected void printTypeof(){
        System.out.println(this.getClass().getSimpleName());
    }

    /**
     * Calculates the distance from 0
     * @return the distance
     */
    public double getDistanceFromOrigin() {
        return Math.sqrt(x * x);
    }
}
