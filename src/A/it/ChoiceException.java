package A.it;

public class ChoiceException extends Exception {

    private int choice;

    public ChoiceException(String message, int choice) {
        super(message);
        this.choice = choice;
    }

    public int getChoice() {
        return choice;
    }
}
