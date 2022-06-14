package additionalTasks.pizzeria.exceptions;

public class PizzaNotFoundException extends Exception{
    public PizzaNotFoundException() {
    }

    @Override
    public String toString() {
        return "Pizza not found...";
    }
}
