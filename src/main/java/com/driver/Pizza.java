package com.driver;

public class Pizza {

    private int price;

    private final Boolean isVeg;

    private boolean isCheeseaAdd;
    private boolean isBillGenerated;
    private boolean isTakeAdd;
    private final int cheeseaPrice;
    private final int toppingPrice;
    private boolean isToppingAdd;
    private final int take;
    private String bill;


    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.isCheeseaAdd = false;
        this.isToppingAdd = false;
        this.isTakeAdd = false;
        this.isBillGenerated = false;
        this.cheeseaPrice = 80;
        this.take = 20;
        if (isVeg) {
            this.price = 300;
            this.toppingPrice = 70;
            bill = "Base Price Of The Pizza: " + 300 + "\n";
        } else {
            this.price = 400;
            this.toppingPrice = 120;
            bill = "Base Price Of The Pizza: " + 400 + "\n";
        }
        // your code goes here
    }

    public int getPrice() {

        return this.price;
    }

    public void addExtraCheese() {

        if (!isCheeseaAdd) {
            this.price += this.cheeseaPrice;
            isCheeseaAdd = true;

        }
        // your code goes here
    }

    public void addExtraToppings() {
        if (!this.isToppingAdd) {
            this.price += this.toppingPrice;
            this.isToppingAdd = true;

        }
        // your code goes here
    }

    public void addTakeaway() {
        if (!this.isTakeAdd) {
            this.price += this.take;
            this.isTakeAdd = true;

        }
        // your code goes here
    }

    public String getBill() {
        if (!isBillGenerated) {
            if (this.isCheeseaAdd) {
                this.bill += "Extra Cheese Added: " + this.cheeseaPrice + "\n";
            }
            if (this.isToppingAdd) {
                this.bill += "Extra Toppings Added: " + this.toppingPrice + "\n";
            }
            if (this.isTakeAdd) {
                this.bill += "Paperbag Added: " + this.take + "\n";
            }
            this.bill += "Total Price: " + this.price;
            this.isBillGenerated = true;
        }

        // your code goes here
        return this.bill;
    }
}
