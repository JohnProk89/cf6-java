package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.Teacher;

/**
 * Client class creates a {@link Teacher} instance and populates its state
 */
public class TeacherMain {

    public static void main(String[] args) {
        Teacher elon = new Teacher();
        Teacher anna = new Teacher(2, "Anna", "G.");

        elon.setId(1);
        elon.setFirstname("Elon");
        elon.setLastname("M.");

        System.out.println("Elon's state");
        System.out.println("Id: " + elon.getId());
        System.out.println("Firstname: " + elon.getFirstname());
        System.out.println("Lastname: " + elon.getLastname());

        System.out.println("Anna's state");
        System.out.println("Id: " + anna.getId());
        System.out.println("Firstname: " + anna.getFirstname());
        System.out.println("Lastname: " + anna.getLastname());
    }
}
