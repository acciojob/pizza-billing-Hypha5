package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheesePrice;
    private boolean ischeeseAdded;
    private int extraToppingsPrice;

    private boolean isToppingsAdded;
    private int takeawayPrice;
    private boolean istakewayAdded;
    private boolean isbilladed;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.ischeeseAdded = false;
        this.extraCheesePrice = 80;
        this.isToppingsAdded = false;
        this.takeawayPrice = 20;
        this.istakewayAdded = false;
        this.isbilladed = false;
        if(isVeg)
        {
            this.price = 300;
            this.extraToppingsPrice = 70;
        }
        else
        {
            this.price = 400;
            this.extraToppingsPrice = 120;
        }
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ischeeseAdded)
        {
            this.price += this.extraCheesePrice;
            ischeeseAdded = true;
           // this.bill += "Extra Cheese Added: "+this.extraCheesePrice+"\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded)
        {
            this.price += this.extraToppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!istakewayAdded){
            this.price += this.takeawayPrice;
            this.istakewayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
       if(!isbilladed)
       {
           if(ischeeseAdded){
               this.bill += "Extra Cheese Added: "+this.extraCheesePrice+"\n";
           }
           if(isToppingsAdded)
           {
               this.bill += "Extra Toppings Added: "+this.extraToppingsPrice+"\n";
           }
           if(istakewayAdded)
           {
               this.bill += "Paperbag Added: "+this.takeawayPrice+"\n";
           }
           this.bill += "Total Price: "+this.price+"\n";
           isbilladed = true;
       }
        return this.bill;
    }
}
