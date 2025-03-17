package gr.aueb.cf.ch15inheritancepolymorphism.shape;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
