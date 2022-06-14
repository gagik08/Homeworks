package additionalTasks.pizzeria;

import additionalTasks.pizzeria.exceptions.PizzaNotFoundException;
import additionalTasks.pizzeria.models.Pizza;
import additionalTasks.pizzeria.models.PizzaSizeEnum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static additionalTasks.pizzeria.models.PizzaSizeEnum.getPizzaSizeNameBySizeInMM;

public class Main {
    public static void main(String[] args) {
        List<Pizza> pizzas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numberOfPizzas;
        String pizzaName;
        int price;
        PizzaSizeEnum size;
        System.out.print("Enter the number of pizzas you would like to order: ");
        while (true) {
            try {
                numberOfPizzas = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException ex1) {
                System.out.print("Invalid characters. Enter a number: ");
                continue;
            }
        }
        for (int i = 0; i < numberOfPizzas; i++){
            System.out.println("Pizza №" + (i+1));
            System.out.println("Enter the name of the pizza: ");
            pizzaName = scanner.nextLine();
            while (true) {
                try {
                    System.out.print("Enter the price of the pizza: ");
                    price = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException ex2) {
                    System.out.print("Invalid characters. Enter a number: ");
                    continue;
                }
            }
            System.out.print("Enter the size (in millimeters) of the pizza: ");
            while (true) {
                try {
                    size = PizzaSizeEnum.getPizzaSizeNameBySizeInMM(Integer.parseInt(scanner.nextLine()));
                    break;
                } catch (Exception ex3) {
                    System.out.println("Invalid characters. Try again/: ");
                    continue;
                }
            }
            pizzas.add(new Pizza(pizzaName,price,size));
        }
        System.out.println(Arrays.asList(pizzas));
    }
}
