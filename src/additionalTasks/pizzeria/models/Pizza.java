package additionalTasks.pizzeria.models;

import additionalTasks.pizzeria.exceptions.PizzaNotFoundException;

public class Pizza {
    private String pizzaName;
    private int price;
    private PizzaSizeEnum size;

    public Pizza(String pizzaName, int price, PizzaSizeEnum size) {
        this.pizzaName = pizzaName;
        this.price = price;
        this.size = size;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PizzaSizeEnum getSize() {
        return size;
    }

    public void setSize(PizzaSizeEnum size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nPizza{" +
                "pizzaName='" + pizzaName + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}' + "\n";
    }
}
