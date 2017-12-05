package com.allanwilson;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
	    Hamburger basicBurger = new Hamburger();
        System.out.println("Basic burger: " + basicBurger.getBasePrice() + " euros. " + basicBurger.getMeat() +  " burger on a " + basicBurger.getBreadRollType() + " roll");
        System.out.println("===================================================================");
        // Setting up prices
        basicBurger.setAllPricesToDefault();
        basicBurger.getAllPrices();
        //Additions
        System.out.println("===================================================================");
        System.out.println("ORDER 1");
        basicBurger.addLettuce();
        basicBurger.addTomato();
        basicBurger.addCarrot();
        basicBurger.addCucumber();
        basicBurger.printReceipt();
        System.out.println("===================================================================");
        System.out.println("ORDER 2");
    }
}
