package com.driver;

public class Pizza {

    private int price;
    private  int cheesePrice;
    private  int toppingPrice;
    private  int take;

    private final Boolean isVeg;

    private boolean isCheeseAdd;
    private boolean isBillGenerated;
    private boolean isTakeAdd;

    private boolean isToppingAdd;

    private String bill;


    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.price=this.isVeg?300:400;
        this.toppingPrice=this.isVeg?70:120;
        this.cheesePrice = 80;
        this.take = 20;

        this.isCheeseAdd = false;
        this.isToppingAdd = false;
        this.isTakeAdd = false;
        this.isBillGenerated = false;

        this.bill="Base Price Of The Pizza: "+this.price+"\n";

        // your code goes here
    }

    public int getPrice() {

        return this.price;
    }

    public void addExtraCheese() {

        if (!this.isCheeseAdd) {
            this.price += this.cheesePrice;
            isCheeseAdd = true;

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
        if (this.isBillGenerated==false) {
            if (this.isCheeseAdd) {
                this.bill += "Extra Cheese Added: " + this.cheesePrice + "\n";
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
