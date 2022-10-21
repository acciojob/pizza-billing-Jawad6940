package com.driver;

public class Pizza {

    private int price;

    private Boolean isVeg;

    private boolean isCheeseaAdd;
    private boolean isTakeAdd;
    private int cheeseaPrice;
    private int toppingPrice;
    private boolean isToppingAdd;
    private int take;
    private String bill;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isCheeseaAdd=false;
        this.isToppingAdd=false;
        this.isTakeAdd=false;
        this.cheeseaPrice=80;
         this.take=20;
        if(isVeg){
            this.price=300;
            this.toppingPrice=70;
            bill="Base Price Of The Pizza: "+300+"\n";
        }
        else {
            this.price=400;
            this.toppingPrice=120;
            bill="Base Price Of The Pizza: "+400+"\n";
        }
        // your code goes here
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){

        if(!isCheeseaAdd){
            this.price+=this.cheeseaPrice;
            isCheeseaAdd=true;
            bill+= "Extra Cheese Added: "+this.cheeseaPrice+"\n";
        }
        // your code goes here
    }

    public void addExtraToppings(){
       if(!this.isToppingAdd){
           this.price+=this.toppingPrice;
           this.isToppingAdd=true;
           bill+= "Extra Toppings Added: "+this.toppingPrice+"\n";
       }
        // your code goes here
    }

    public void addTakeaway(){
        if(!this.isTakeAdd) {
            this.price += this.take;
            this.isTakeAdd=true;
            bill += "Paperbag Added: " + this.take + "\n";
        }
        // your code goes here
    }

    public String getBill(){

        bill+="Total Price: "+this.price;
        // your code goes here
        return this.bill;
    }
}
