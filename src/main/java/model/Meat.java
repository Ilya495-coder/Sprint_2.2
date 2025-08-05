package model;

public class Meat extends Food  {

    public Meat(int amount, double price) {
        super(amount, price);
        this.isVegetarian = false;
    }

    @Override
    public double getDiscount() {//вызываем дисконт
        return 0;
    }
}//тест