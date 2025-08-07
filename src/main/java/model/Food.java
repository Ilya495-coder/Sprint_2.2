package model;

public abstract class Food implements Discountable {
    protected int amount;            // килограммы
    protected double price;         // цена за кг
    protected boolean isVegetarian; // флаг вегетарианского продукта

    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getTotalPriceWithoutDiscount() {
        return amount * price;
    }

    public double getTotalPriceWithDiscount() {
        return getTotalPriceWithoutDiscount() * (1 - getDiscount());
    }

    public double getDiscount() {
        return 0;
    }
}//тест4