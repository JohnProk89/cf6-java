package gr.aueb.cf.ch13apis;

public class MobileContactMain {

    public static void main(String[] args) {
        MobileContact alice = new MobileContact("Alice", "W.", "6942546024");
        alice.insertContact();

        MobileContact mobileContact = alice.getContactByPhoneNumber();
        System.out.println(mobileContact.contactToString());
    }
}
