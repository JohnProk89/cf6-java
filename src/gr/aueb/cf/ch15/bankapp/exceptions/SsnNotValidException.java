package gr.aueb.cf.ch15.bankapp.exceptions;

public class SsnNotValidException extends Exception{
    private static final long serialVersionUID = 1234567L;

    public SsnNotValidException(String ssn) {
        super("Ssn: " + ssn + " not valid");
    }
}
