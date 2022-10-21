package com.driver;

public class Pizza {

    private int price;
    private int total;
    private Boolean isVeg;

    private boolean isCheeseaAdd=false;
    private boolean isToppingAdd=false;
    private boolean isTake=false;
    private String bill;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
    }

    public int getPrice(){
        if(isVeg){
            this.price=300;
        }
        else {
            this.price=400;
        }
        return this.price;
    }

    public void addExtraCheese(){

        isCheeseaAdd=true;
        // your code goes here
    }

    public void addExtraToppings(){
       isToppingAdd=true;
        // your code goes here
    }

    public void addTakeaway(){
        isTake=true;
        // your code goes here
    }

    public String getBill(){
        if(isVeg){
            this.total=300;
        }
        else {
            this.total=400;
        }
        bill="Base Price Of The Pizza: "+this.total+"\n";

        if(isCheeseaAdd){
            bill+= "Extra Cheese Added: "+80+"\n";
            this.total+=80;
        }
        if(isToppingAdd){
            if(isVeg){
                bill+= "Extra Toppings Added: "+70+"\n";
                this.total+=70;
            }
            else{
                bill+= "Extra Toppings Added: "+120+"\n";
                this.total+=120;
            }
        }
        if(isTake){
            bill+= "Paperbag Added: "+20+"\n";
            this.total+=20;
        }

        bill+="Total Price: "+total;


        // your code goes here
        return this.bill;
    }
}
