package gr.aueb.cf.ch16.abstractclasses;

public abstract class Animal {
    private int id;
    private String name;

    public Animal() {

    }

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String toString();

//    @Override
//    public String toString() {
//        return "id: " + id + "name: " + name;
//    }

    public abstract void speak();

    public void eat() {
        System.out.println(name + " is eating");
    }
}
