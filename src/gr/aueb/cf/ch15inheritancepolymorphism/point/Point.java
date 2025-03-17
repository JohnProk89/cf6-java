package gr.aueb.cf.ch15inheritancepolymorphism.point;

public class Point {
    private int x;

    public Point() {

    }

    public Point(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "(" + x + ")";
    }

    protected void printTypeof(){
        System.out.println(this.getClass().getSimpleName());
    }
}
