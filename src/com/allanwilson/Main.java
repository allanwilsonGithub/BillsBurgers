package com.allanwilson;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("ORDER 1 : Basic Burger");
        Hamburger basicBurger = new Hamburger();
        basicBurger.setAllPricesToDefault();
        basicBurger.getAllPrices();
        // Additions here...
        basicBurger.addLettuce();
        basicBurger.addTomato();
        basicBurger.addCarrot();
        basicBurger.addCucumber();
        //
        System.out.println("Bread Roll: " + basicBurger.getBreadRollType());
        basicBurger.printTotalReceipt(basicBurger.printBaseReceipt());

        System.out.println("================================");
        System.out.println("ORDER 2 : Healthy Burger");
        HealthyBurger goodBurger = new HealthyBurger();
        goodBurger.setAllPricesToDefault();
        goodBurger.setHealthPricesToDefault();
        goodBurger.getAllPrices();
        // Additions here...
        goodBurger.addCucumber();
        goodBurger.addCarrot();
        goodBurger.addGarlic();
        goodBurger.addTomato();
        goodBurger.addOnion();
        System.out.println("Bread Roll: " + goodBurger.getBreadRollType());
        goodBurger.printTotalReceipt(goodBurger.printBaseReceipt());
        goodBurger.getTotalPrice();

        System.out.println("================================");
        System.out.println("ORDER 3 : Deluxe Burger");
        DeluxeBurger cashBurger = new DeluxeBurger();
        cashBurger.DeluxePricesToDefault();
        cashBurger.getAllPrices();
        cashBurger.addCucumber();
        cashBurger.addCarrot();
        cashBurger.addGarlic();
        cashBurger.addTomato();
        cashBurger.addOnion();
        cashBurger.printTotalReceipt(cashBurger.printBaseReceipt());
    }
}
