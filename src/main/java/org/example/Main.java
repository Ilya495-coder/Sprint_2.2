package org.example;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100.0);
        Food redApples = new Apple(10, 50.0, Colour.RED);
        Food greenApples = new Apple(8, 60.0, Colour.GREEN);

        Food[] products = { meat, redApples, greenApples };

        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getVegetarianPriceWithoutDiscount());
    }
}
//тест