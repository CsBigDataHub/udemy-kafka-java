package org.annotationprocessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaStore {

    private MealFactory factory = new MealFactory();

    public Meal order(String mealName) {
        return factory.create(mealName);
//        return null;
    }

    private static String readConsole() throws IOException {
        System.out.println("What do you like?");
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferRead.readLine();
        return input;
    }

    public static void main(String[] args) throws IOException {
        PizzaStore pizzaStore = new PizzaStore();
        Meal meal = pizzaStore.order(readConsole());
        System.out.println("Bill: $" + meal.getPrice());
    }

//    public Meal order(String mealName) {
//
//        if (mealName == null) {
//            throw new IllegalArgumentException("Name of the meal is null!");
//        }
//
//        if ("Margarita".equals(mealName)) {
//            return new MargaritaPizza();
//        }
//
//        if ("Calzone".equals(mealName)) {
//            return new CalzonePizza();
//        }
//
//        if ("Tiramisu".equals(mealName)) {
//            return new Tiramisu();
//        }
//
//        throw new IllegalArgumentException("Unknown meal '" + mealName + "'");
//    }
//
//    private static String readConsole() throws IOException {
//        System.out.println("What do you like?");
//        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
//        String input = bufferRead.readLine();
//        return input;
//    }
//
//    public static void main(String[] args) throws IOException {
//        PizzaStore pizzaStore = new PizzaStore();
//        Meal meal = pizzaStore.order(readConsole());
//        System.out.println("Bill: $" + meal.getPrice());
//    }

}
