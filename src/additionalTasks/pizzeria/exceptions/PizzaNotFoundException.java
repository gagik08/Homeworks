package additionalTasks.pizzeria.exceptions;

public class PizzaNotFoundException extends Exception{
    public final static String ERROR_MESSAGE = "Pizza not found..";
    public PizzaNotFoundException(String message) {
        super(message);
    }

}
