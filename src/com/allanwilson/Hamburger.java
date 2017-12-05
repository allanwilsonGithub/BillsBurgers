package com.allanwilson;

/**
 * Created by awil on 2017-12-05.
 */
public class Hamburger {
    private double basePrice;
    private String breadRollType;
    private String meat;
    private boolean add1_lettuce;
    private boolean add2_tomato;
    private boolean add3_carrot;
    private boolean add4_cucumber;
    private double price_lettuce;
    private double price_tomato;
    private double price_carrot;
    private double price_cucumber;
    private double total_price;

    public Hamburger(){
        this.basePrice = 5.00;
        this.breadRollType = "sesame";
        this.meat = "Beef";
    }

    public String getBasePrice(){
        String formattedPrice = String.format("%.02f", basePrice);
        return formattedPrice;
    }
    public String getBreadRollType(){
        return breadRollType;
    }
    public String getMeat(){
        return meat;
    }
    public void setAllPricesToDefault(){
        this.price_lettuce = 0.20;
        this.price_tomato = 0.30;
        this.price_carrot = 0.40;
        this.price_cucumber = 0.10;
    }
    public void setPrice_lettuce(double amount){
        this.price_lettuce = amount;
    }
    public void setPrice_tomato(double amount){
        this.price_tomato = amount;
    }
    public void setPrice_carrot(double amount){
        this.price_carrot = amount;
    }
    public void setPrice_cucumber(double amount){
        this.price_cucumber = amount;
    }
    public String getPrice_lettuce(){
        String formattedPrice = String.format("%.02f", price_lettuce);
        return formattedPrice;
    }
    public String getPrice_tomato(){
        String formattedPrice = String.format("%.02f", price_tomato);
        return formattedPrice;
    }
    public String getPrice_carrot(){
        String formattedPrice = String.format("%.02f", price_carrot);
        return formattedPrice;
    }
    public String getPrice_cucumber(){
        String formattedPrice = String.format("%.02f", price_cucumber);
        return formattedPrice;
    }

    public String getTotalPrice(){
        String formattedPrice = String.format("%.02f", total_price);
        return formattedPrice;
    }

    public void addLettuce(){
        add1_lettuce = true;
    }
    public void addTomato(){
        add2_tomato = true;
    }
    public void addCarrot(){
        add3_carrot = true;
    }
    public void addCucumber(){
        add4_cucumber = true;
    }
    public void getAllPrices(){
        System.out.println("### Prices ###\nLettuce   : " + this.getPrice_lettuce() +
                "\nTomato    :          " + this.getPrice_tomato() +
                "\nCarrot    :          " + this.getPrice_carrot() +
                "\nCucumber  :          " + this.getPrice_cucumber());
    }
    public void printReceipt(){
        System.out.println("Base price:          " + this.getBasePrice());
        this.total_price += this.basePrice;
        //Adds
        if (add1_lettuce){
            this.total_price += price_lettuce;
            System.out.println("Lettuce   :          " + this.getPrice_lettuce());
        }
        if (add2_tomato){
            this.total_price += price_tomato;
            System.out.println("Tomato    :          " + this.getPrice_tomato());
        }
        if (add3_carrot){
            this.total_price += price_carrot;
            System.out.println("Carrot    :          " + this.getPrice_carrot());
        }
        if (add4_cucumber){
            this.total_price += price_cucumber;
            System.out.println("Cucumber  :          " + this.getPrice_cucumber());
        }
        System.out.println("-------------------------");
        System.out.println("TOTAL     :          " + this.getTotalPrice());
    }
}
