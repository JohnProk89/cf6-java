package gr.aueb.cf.ch15inheritancepolymorphism;

public class Point2D extends Point{
    private double y;

    public Point2D() {
//        super();
//        y = 0;
     }

     public Point2D(double x, double y) {
         super(x);
         this.y = y;
     }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String convertToString() {
         return "(" + getX() + ", " + y + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    public void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    protected void reset() {
        super.reset();
        y = 0;
    }

    /**
     * Calculates the distance from (0,0)
     * @return the distance
     */
    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(getX() * getX() + Math.pow(y, 2));
    }
}