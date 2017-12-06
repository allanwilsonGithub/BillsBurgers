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
        this.add1_lettuce = false;
        this.add2_tomato = false;
        this.add3_carrot = false;
        this.add4_cucumber = false;
        this.total_price = 0;
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
    public void setBreadRollType(String type){
        this.breadRollType = type;
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
        System.out.println("### Prices ############\n#  Lettuce   :  " + this.getPrice_lettuce() + "  #" +
                "\n#  Tomato    :  " + this.getPrice_tomato() + "  #" +
                "\n#  Carrot    :  " + this.getPrice_carrot() + "  #" +
                "\n#  Cucumber  :  " + this.getPrice_cucumber() + "  #" +
                "\n#######################");
    }
    public double printBaseReceipt(){
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
        return this.total_price;
    }
    public void printTotalReceipt(double TotalPrice){
        System.out.println("--------------------------");
        System.out.println("Total price:         " + getTotalPrice());
    }
}

class HealthyBurger extends Hamburger{
    private boolean add5_garlic;
    private boolean add6_onion;
    private double price_garlic;
    private double price_onion;

    public HealthyBurger () {
        super();
        setBreadRollType("brown rye");
    }
    public void addGarlic(){
            add5_garlic = true;
        }
    public void addOnion(){
            add6_onion = true;
        }

    public void setHealthPricesToDefault() {
        this.price_garlic = 0.30;
        this.price_onion = 0.40;
    }
    public String getPrice_garlic(){
        String formattedPrice = String.format("%.02f", price_garlic);
        return formattedPrice;

    }    public String getPrice_onion(){
        String formattedPrice = String.format("%.02f", price_onion);
        return formattedPrice;
    }

    @Override
    public void printTotalReceipt(double TotalPrice){
        if (add5_garlic){
            TotalPrice += price_garlic;
            System.out.println("Garlic    :          " + this.getPrice_garlic());
        }
        if (add6_onion){
            TotalPrice += price_onion;
            System.out.println("Onion     :          " + this.getPrice_onion());
        }
        System.out.println("--------------------------");
        System.out.println("Total price:         " + getTotalPrice());
    }

    @Override
    public void getAllPrices(){
        System.out.println("### Prices ############\n#  Lettuce   :  " + this.getPrice_lettuce() + "  #" +
                "\n#  Tomato    :  " + this.getPrice_tomato() + "  #" +
                "\n#  Carrot    :  " + this.getPrice_carrot() + "  #" +
                "\n#  Cucumber  :  " + this.getPrice_cucumber() + "  #" +
                "\n#  Garlic    :  " + this.getPrice_garlic() + "  #" +
                "\n#  Onion     :  " + this.getPrice_onion() + "  #" +
                "\n#######################");
    }
}
