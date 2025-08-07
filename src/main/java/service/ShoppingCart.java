package service;

import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getTotalPriceWithoutDiscount();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getTotalPriceWithDiscount();
        }
        return total;
    }

    public double getVegetarianPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getTotalPriceWithoutDiscount();
            }
        }
        return total;
    }
}//тест4