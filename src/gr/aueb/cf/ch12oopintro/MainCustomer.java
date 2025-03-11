package gr.aueb.cf.ch12oopintro;

import gr.aueb.cf.ch12oopintro.model.Customer;

public class MainCustomer {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setVatRegistrationNo("128458231");

        Customer anna = new Customer(2, "Anna", "G.", "234567890", "6999999999", "Attica",
                "Central Attica", "Athens", "Pattission", "76", "10434");

        System.out.println("Customer ΑΦΜ: " + customer.getVatRegistrationNo());
        System.out.println("Anna's vat: " + anna.getVatRegistrationNo());
    }
}
