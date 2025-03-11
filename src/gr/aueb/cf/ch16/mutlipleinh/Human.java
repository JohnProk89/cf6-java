package gr.aueb.cf.ch16.mutlipleinh;

public class Human implements Ispeakable, IReadable{
    @Override
    public void read() {
        System.out.println("I read");
    }

    @Override
    public void speak() {
        System.out.println("I speak");
    }
}
