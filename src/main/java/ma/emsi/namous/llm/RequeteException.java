package ma.emsi.namous.llm;

public class RequeteException extends Exception {

    public RequeteException(String message, String requeteJson) {
        super(message + "\nrequete json:\n" + requeteJson);
    }
}